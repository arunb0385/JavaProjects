package AtmTask;

import java.util.Scanner;

public class Main {
	
public static void main(String[] arr){
		
		Scanner s1=new Scanner(System.in);
		
		 System.out.println("Enter your Name");
            	String name=s1.next();
				
      Atm ob=new Atm();
		ob.withdraw();
	}

}


class Atm{
	 static int total=10000;
	 static int pin=1100;
	 
public void withdraw(){
		while(true){
			Scanner s2=new Scanner(System.in);
					
			System.out.println("\n1.press 1 for Withdrawal \n2. press 2 for Deposit\n3.Exit press 3");
			
				int a=s2.nextInt();
			if(a==1){
				System.out.println("Enter your PIN");
	           int pin1=s2.nextInt();
			   if(pin1==pin){
	
				System.out.println("Enter your Amount");
				int amount=s2.nextInt();
				
				System.out.println("Balance Amount");
				int Balance=total-amount;
				System.out.println(Balance);
			   }
			   else{
				   System.out.println("Invalid pin");
			   }
			}
			else if(a==2){
				System.out.println("Enter your PIN");
	           int pin1=s2.nextInt();
			   if(pin1==pin){
			System.out.println("Deposite your Amount");
				int amount=s2.nextInt();
				
				System.out.println("Account Balance ");
				int Balance=total+amount;
				System.out.println(Balance);
			   }
			     else{
				   System.out.println("Invalid pin");
			   }
			}
			else if(a==3){
			
				System.out.println("Thank you ");
				System.exit(0);
			}
			else{
				System.out.println("Enter valid Number");
			}
		}
		
	}
		
}

	