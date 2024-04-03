package busBooking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Booking {
   String passengerName;
   int busNo;
   Date date;
   
   public Booking() {
	   Scanner scanner = new Scanner(System.in);
	   System.out.println("Enter the passenger Name : ");
	   passengerName=scanner.next();
	   System.out.println("Enter the Bus Number : ");
	   busNo=scanner.nextInt();
	   System.out.println("Enter date dd-mm-yyyy");
	   String dateInput=scanner.next();
	   SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
	 
	   try {
		date=dateFormat.parse(dateInput);
	} catch (ParseException e) {
		System.out.println("Enter the correct date Format");
	}
   }
   public boolean isAvailable(ArrayList<Booking> bookings,ArrayList<Bus> buses) {
	   int capasity=0;
	   for(Bus bus:buses) {
		   if(bus.getBusNo()==busNo) {
		   capasity=bus.getCapasity();
		   }
	   }
	   int booked=0;
	   for(Booking booking : bookings) {
		   if(booking.busNo==busNo && booking.date.equals(date)) {
			   booked++;
		   }
	   }
	   return booked<capasity?true:false;
   }
}
