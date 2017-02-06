
public class Chapter2Exercise {

	public static void main(String[] args) {
		// convert pounds to kilograms
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		//Prompt the user to enter value in pounds
	    System.out.print("Enter a number in pounds: ");
	    double pounds = input.nextDouble();
	    double kilograms = pounds * 0.454;

	    System.out.println(pounds + " pounds is " + kilograms + " kilograms");
	  }
	
	}


