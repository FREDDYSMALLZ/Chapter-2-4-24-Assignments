import java.util.Scanner;
public class Chapter2Exercise {

	public static void main(String[] args) {
		
		
		//Financial calculation of tips
		
		 Scanner input = new Scanner(System.in);
		 
		 
		 //Prompt the user to enter the subtotal and the gratuity rate
		  System.out.print("Enter subtotal:");
		  double subtotal = input.nextDouble();
		  
		  //Prompt the user to enter the graturity rate
		  System.out.print("Enter gratuity rate:");
		  
		  
		  double rate = input.nextDouble();
		  double gratuity = subtotal * rate / 100;
		  double total = gratuity + subtotal;
		 
		  System.out.println("The gratuity is $" + gratuity + " and total is $"
		    + total);
		 
		 }
		 
		
	}


