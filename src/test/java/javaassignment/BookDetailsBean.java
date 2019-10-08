package javaassignment;



public class BookDetailsBean {

	//declaration of global variables 
	private Integer bookingID ;
	private String name ; 
	private String email ;
	private Long mobilenumber ;
	private String address ;
	private String events ;
	private Integer noOfTickets ;
	
	// writing getters and setters for retrieving the values and setting the value
	
	public Integer getBookingID () {
		return bookingID ;
	}
	
	public void setBookingID (Integer bookingID) {
	this.bookingID = bookingID ;	
	}
	
	public String getName () {
		return name ;
	}
	
	public void setName (String name) {
		this.name = name ;
	}
	
	public String getEmail () {
		return email ;
	}
	
	public void setEmail (String email ) {
		this.email = email ;
	}
	
	public Long getMobileNumber () {
		return mobilenumber ;
	}
	
	public void setMobileNumber (Long mobilenumber) {
		this.mobilenumber = mobilenumber ;
	}
	
	public String getAddress () {
		return address ;
	}
	
	public void setAddress (String address) {
		this.address = address ;
	}
	
	public String getEvents () {
		return events ;
	}
	
	public void setEvents (String events) {
	
		this.events = events ;
	}
	
	public Integer getNoOfTickets () {
		return noOfTickets ;
	}
	
	public void setNoOfTikets (Integer noOfTickets ) {
	
	this.noOfTickets = noOfTickets ;	
	
    }
}