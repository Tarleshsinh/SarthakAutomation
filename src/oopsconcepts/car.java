package oopsconcepts;

public class car {

	// class variables or global variables 
	
	   
	public static void main(String[] args) {
	
		car canada = new car();
	    canada.automaticparameter(0);
	    canada.automaticparameter(100);
		
		canada.automaticparameter(10000000);
	} 
	
	public void automaticparameter (int i) {
		System.out.println("this is an int data type single parameter method");
		
	}
	
	
	public void display (String s) {
		System.out.println("This is a string data type single parameter ");
	}
	}


