import java.util.Scanner;
public class Chapter2Exerxise {

	public static void main(String[] args) {
		// Financial application, calculating interest
		Scanner input = new Scanner(System.in);
		 //Prompt the user to enter the balance and the interest rate
		
		  System.out.print("Enter balance and interest rate:");
		  double balance = input.nextDouble();
		  double annualInterestRate = input.nextDouble();
		  double interest = balance * ( annualInterestRate / 1200 );
		  
		  System.out.print("The interest is " + interest);
		 
		 }
		 
		
	}


