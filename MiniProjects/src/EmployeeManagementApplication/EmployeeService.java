package EmployeeManagementApplication;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeService {
	
	    Scanner scanner = new Scanner(System.in);
	    
	    int id;
		String name;
		int age;
		String department;
		String desiganation;
		double sal;
	   
	
         ArrayList<Employee> empset=new ArrayList<Employee>();
        
	
	Employee emp1=new Employee(101, "Arun", 24, "Developer", "IT", 25000);
	Employee emp2=new Employee(102, "Bala", 26, "Tester","CO", 57000);
	Employee emp3=new Employee(103, "Santhosh", 20, "DevOps Eng","Admin", 5000);
	Employee emp4=new Employee(104, "Suhdir", 27, "System Eng","CO",  70000);
	
	
	
public EmployeeService() {
		
		empset.add(emp1);
		empset.add(emp2);
		empset.add(emp3);
		empset.add(emp4);
		
	}

public void viewAllEmps() {
	for(Employee emp : empset) {
		System.out.println(emp);
	}
}

public void viewEmp() {
	 boolean found = false;
	System.out.println("Enter Employee id : ");
	  id = scanner.nextInt();
	  for(Employee emp : empset) {
		  if(emp.getId()==id) {
			  System.out.println(emp);
			  found = true;
		  }
	  }
	  if(!found) {
		  System.out.println("Employee with this id is not present");
	  }
}

public void updateEmployee() {
	System.out.println("Enter Employee id: ");
	    id=scanner.nextInt();
	boolean found=false;
	for(Employee emp:empset) {
		if(emp.getId()==id) {
			System.out.println("Enter name: ");
			 name=scanner.next();
			System.out.println("Enter new Salary");
			 sal=scanner.nextDouble();
			emp.setName(name);
			emp.setSalary(sal);
			System.out.println("Updated Details of employee are: ");
			System.out.println(emp);
			found=true;
		}
	}
	if(!found) {
		System.out.println("Employee is not found");
	}
	else {
		System.out.println("Employee details updated successfully !!");
	}
}

public void deleteEmp() {
	boolean found = false;
	System.out.println("Enter Employee id : ");
	 id=scanner.nextInt();
	Employee empdelete=null;
	for(Employee emp : empset) {
		if(emp.getId()==id) {
			empdelete=emp;
			found=true;
		}
	}
	if(!found) {
		System.out.println("Employee is not found");
	}
	else {
		empset.remove(empdelete);
		System.out.println("Employee deleted successfully!!");
	}
}

public void addEmp() {
	System.out.println("Enter id:");
	id=scanner.nextInt();
	System.out.println("Enter name");
	name=scanner.next();
	System.out.println("Enter age");
	age=scanner.nextInt();
	System.out.println("enter Desiganation");
	desiganation=scanner.next();
	System.out.println("Enter Department");
	department=scanner.next();
	System.out.println("Enter sal");
	sal=scanner.nextDouble();
	
	Employee emp=new Employee(id, name, age, desiganation, department, sal);
	
	empset.add(emp);
	System.out.println(emp);
	System.out.println("Employee details added successsfully");
	
}


}
