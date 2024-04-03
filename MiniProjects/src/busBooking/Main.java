package busBooking;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 
		ArrayList<Bus> buses = new ArrayList<Bus>();
		buses.add(new Bus(1,true,1));
		buses.add(new Bus(2,false,45));
		buses.add(new Bus(3,true,42));
      
		for(Bus b:buses) {
			b.display();
		}
		ArrayList<Booking> bookings=new ArrayList<Booking>();
		
		int userOpt=1;
		Scanner scanner=new Scanner(System.in);
		
		while(userOpt==1) {
			System.out.println("Press 1 to Book your seat");
			System.out.println("Press 2 to Exit");
			
				Booking booking=new Booking();
				
				if(booking.isAvailable(bookings,buses)) {
					bookings.add(booking);
					System.out.println("Your booking is confirmed");
				}
		
				else
					System.out.println("Sorry. Bus is full. Try another bus or date.");
		}
	}

}




















