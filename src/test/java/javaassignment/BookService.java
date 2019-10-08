package javaassignment;

public class BookService {

	
	BookValidator bookVal = new BookValidator() ;
	
	public Integer getTickets (BookDetailsBean b) {
		
	try {
	
		bookVal.isValidTickets(b.getNoOfTickets());
		bookVal.isValidName(b.getName());
		bookVal.isValidEmail(b.getEmail());
	} catch (Exception e) {
		
		e.printStackTrace(); 
	}
	
	return b.getBookingID() ;
	}
}
