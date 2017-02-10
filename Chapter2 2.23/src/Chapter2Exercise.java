import java.util.Scanner;
public class Chapter2Exercise {

	public static void main(String[] args) {
// Calculating the cost of driving
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the driving distance:");
		double distance = input.nextDouble();
		
		System.out.print("Enter miles per gallon:");
		  double fuel = input.nextDouble();
		  
		  System.out.print("Enter price per gallon:");
		  double pricepergal = input.nextDouble();
		  
		  double cost = distance / 25.5 * pricepergal;
		  
		  System.out.print("The cost of driving is $" + cost);
		 
	}

}
