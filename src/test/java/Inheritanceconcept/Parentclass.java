package Inheritanceconcept;

//when we declare class as final -we cannot inherit parent class with child class 

//when we declare method as final - we cannot override that method 
//public final class Parentclass {
	
	public class Parentclass {
		
		//create a parent class default constructor 
		
		public Parentclass (){
		System.out.println ("Parent claass constructor ") ;	
		}
		
		//constructor with parameters
		public Parentclass (int i) {
		System.out.println (" value of i is " + i  ) ;	
		}
		
		//constructor with parameters
		public Parentclass (int i , int k) {
		System.out.println (" value of i is " + i  ) ;	
		System.out.println (" value of k is " + k ) ;
		
				}
	public final  void start () {
		System.out.println ("parent class start ");
	}

	public   void startinitial () {
		System.out.println ("parent class start ");
	}
	
    //method with different parameters from parent class to child class 
	public void calculate ( int a, int b) {
	int c = a + b ;	
	System.out.println ("sum is from parent class " + c) ;	
	}
	
	 //method with same parameters 
	public void multiply ( int a, int b) {
	int c = a * b ;	
	System.out.println ("multiply from parent class " + c) ;	
	
	}
}
