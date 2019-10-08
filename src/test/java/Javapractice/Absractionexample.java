package Javapractice;

import org.openqa.selenium.By;

//create interface having abstract methods

abstract interface Employee {
	
	//we cant declare interface as private 
	//we can declare interface as abstract 
	
static int EmployeeID = 761797;
static float basesalary = 2500;

public float Salarydetails (int numberofyears) ;

public void displaySalarydetails ();

public void goodies ();

abstract  void employeeadres ();
}




abstract class ITEmployee implements Employee {

	@Override
	public float Salarydetails(int numberofyears) {
		// TODO Auto-generated method stub
		return basesalary * numberofyears ;
	}

	@Override
	abstract public void displaySalarydetails() ;

	@Override
	public void goodies() {
		
	System.out.println ("Employee goodies from IT Employee class ");
		
	}

	@Override
	public void employeeadres() {
	
	System.out.println ("Employee address from IT Employee class ");	
		
	}
	
	
}


public class Absractionexample extends ITEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ITEmployee obj = new Absractionexample () ;
	
	obj.displaySalarydetails();
	
	obj.employeeadres();
	
	obj.goodies();
	
	Employee obj1 = new Absractionexample () ;
	
	obj1.displaySalarydetails();
		
	
	//examples in selenium 
	
	By xpath = By.xpath("");
	}

	@Override
	public void displaySalarydetails() {
	
	super.Salarydetails(2)	;
	
	System.out.println ("salary details :" + super.Salarydetails(4));
	}
	
	public void employeeadres() {
		
	System.out.println ("Employee address from child Abstractonexample Employee class ");	
			
		}
	
	
}
