package busReservation;
import java.util.Scanner;
import java.util.ArrayList;
public class busDemo {
	public static void main(String[] args) {
		
		ArrayList<bus> buses = new ArrayList<bus>();
		ArrayList<booking> bookings =new ArrayList<booking>();
		buses.add(new bus(1,true,45));
		buses.add(new bus(2,false,50));
		buses.add(new bus(3,true,48));
		
		
		int userOpt=1;
		Scanner scanner=new Scanner(System.in);
		
		for(bus b:buses) {
			b.displayBusInfo();
		}
		while(userOpt==1) {
		System.out.println("Enter 1 to book and 2 to exit.");
	    userOpt=scanner.nextInt();
	    if(userOpt==1) {
	    	booking Booking = new booking();
	    	if(Booking.isAvailable(bookings,buses)) {
	    		bookings.add(Booking);
	    		System.out.println("your booking confirmed");
	    	}
	    	else {
	    		System.out.println("Sorry! bus is full try another bus or date");
	    	}
	    }
		}
		
		
		
		
	}
}
