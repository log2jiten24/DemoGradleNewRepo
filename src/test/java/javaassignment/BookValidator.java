package javaassignment;

import java.util.regex.Pattern;

public class BookValidator {
	
	public Boolean isValidName (String string ) throws Exception {
		
		if (string != null && Pattern.matches("^[a-zA-Z\\s]*$", string)) {
			return true ;
		}else {
		throw new Exception("Invalid name ") ;
		}
	}

	
	
	public Boolean isValidEmail (String string ) throws Exception {
		
		if (string != null && Pattern.matches("^[a-zA-Z0-9._+-]+@[a-zA-Z0-9]+.[a-zA-Z]+$", string)) {
			
			return true ;
		}else {
			throw new Exception("Invalid email");
		}
	}
	
	public Boolean isValidTickets (Integer integer ) throws Exception {
		
	if (integer != null && (integer > 0 && integer <= 6 ))	{
	
		return true ;
	} else {
		throw new Exception("Tickets are limit to 6 per user");
	}
	   }
                   }
