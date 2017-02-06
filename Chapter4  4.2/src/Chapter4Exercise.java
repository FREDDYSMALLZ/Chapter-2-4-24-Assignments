import java.util.Scanner;

public class Chapter4Exercise {

	public static void main(String[] args) {
		// Calculating the great circle distance
		
		 Scanner input = new Scanner(System.in);
		 
		 // applying the given formula in the book
		  System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
		  double x1 = Math.toRadians(input.nextDouble());
		  double y1 = Math.toRadians(input.nextDouble());
		 
		  System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
		  double x2 = Math.toRadians(input.nextDouble());
		  double y2 = Math.toRadians(input.nextDouble());
		 // The average earth radius is 6371.10 km
		  double distance = 6371.01 * Math.acos(Math.sin(x1) * Math.sin(x2)
		    + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
		  System.out.println("The distance between the two points is " + distance
		    + " km");
		 
	}

}
