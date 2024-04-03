package FileManagement;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class OrganizeFiles {

	public static void main(String[] args) {
		    String folderpath="D:\\tailwind";
		    arrangeFile(folderpath);
		    System.out.println("Files Organized successfully....");
	}
	public static void arrangeFile(String fp) {
		  File folder =new File(fp);
		 File[] files= folder.listFiles();
		 
		 for(File file :files) {
			 if(file.isFile()) {
				String filetype = getFileType(file.getName());
				File destinationFolder = new File(folder,filetype);
				if(!destinationFolder.exists()) {
					destinationFolder.mkdir();
				}
			Path source = file.toPath();
			 Path destination =   Paths.get(destinationFolder.getAbsolutePath(),file.getName());
			 
             try {
                 Files.move(source, destination);
             } catch (IOException e) {
                 System.out.println(e);
             
			 }
			 }
		 }
	}
	
	public static String getFileType(String filename) {
		int lastIndex=filename.lastIndexOf(".");
		if(lastIndex !=-1 && lastIndex <filename.length()-1) {
			return filename.substring(lastIndex+1).toUpperCase();
		}
		return "Others";
	}

}
