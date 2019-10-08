package javaassignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
	
	public static List <BookDetailsBean> bookinglist = null ;

	public static void main(String[] args) {
		
		
			
		BookDetailsBean bookDetail = new BookDetailsBean() ;
		BookService bookSrv = new BookService() ;
		
		Scanner scan = new Scanner(System.in);
		
		//For String -- nextLine method is being used 
		System.out.println ("Enter name :") ;
		bookDetail.setName(scan.nextLine());
		
		System.out.println ("Enter Email ID :");
		bookDetail.setEmail(scan.nextLine());
		
		//for Long -- nextLong method is used 
		System.out.println ("Enter Mobile Number :");
		bookDetail.setMobileNumber(Long.parseLong(scan.nextLine())); 
		
		System.out.println ("Enter Address :") ;
		bookDetail.setAddress(scan.nextLine());
		
		
		System.out.println ("Enter event (Carlsonreturn-CR | JING on the way - JW  )  (Type CR|JW) : ");
		String txtEvent = scan.nextLine();
		if (txtEvent.equals("CR") || txtEvent.equals("JW")) {
		bookDetail.setEvents(txtEvent);		
		}
		
		System.out.println ("Number of tickets (limited to 6 per user)");
		bookDetail.setNoOfTikets(Integer.parseInt(scan.nextLine()));
		scan.close();
		
		
		
		
		
		//Integer countBookingID = bookinglist.size() ;
		//System.out.println ("Booking Id :" + countBookingID);
		
		//countBookingID ++ ;
		
		//bookDetail.setBookingID(countBookingID);
		
		//bookinglist.add(bookDetail) ;
		
		try {
			
		//System.out.println ("Booking is done with booking ID :-  " + bookSrv.getTickets(bookDetail) );
//		Integer countBookingID = bookinglist.size() ;	
//		countBookingID ++ ;
//		
//		bookDetail.setBookingID(countBookingID);
		
		bookinglist.add(bookDetail);
		
		for (BookDetailsBean bb : bookinglist) {
		System.out.println (bb.getName() + bb.getEmail())	;
		
		//bookDetail.setBookingID(bookingID);
		System.out.println ("Booking is done with booking ID :-  " + bookSrv.getTickets(bookDetail) );
		
		}
		
		//countBookingID ++ ;
		} catch (Exception e) {
			
			System.out.println ("catched Exception :" + e.getMessage());
		}
		
		

	}

}
