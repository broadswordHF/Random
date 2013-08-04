import java.util.Scanner;

public class Calculator {
	private static Scanner myScanner = new Scanner(System.in);
	private static int x, y;
	
	//Makes it easier to get the scanner for the number.
	private int getIntScanner() {
		return myScanner.nextInt();		
	}
	
	//Choose either addition, multiplication, subtraction, or division.
	public void chooseType() {	
		System.out.println("Which you like to 'add', 'multiply', 'subtract', or 'divide'?");
		String userInput = myScanner.nextLine();
		
		if(userInput.equalsIgnoreCase("add")) {
			addition();
		} else if (userInput.equalsIgnoreCase("multiply")) {
			multiplication();
		} else if (userInput.equalsIgnoreCase("subtract")) {
			subtraction();
		} else if (userInput.equalsIgnoreCase("divide")) {
			division();
		} else {
			System.out.println("Please enter either 'add', 'multiply', 'subtract', or 'divide'. \n");
			chooseType();
		}
	}
	
	//Handles addition
	public void addition() {
		System.out.println("Enter the first number: ");
		x = getIntScanner();
		
		System.out.println("Enter the second number: ");
		y = getIntScanner();
		
		System.out.println(x + y);
	}
	
	//Handles subtraction
	public void subtraction() {
		System.out.println("Enter the first number.");
		x = getIntScanner();
		
		System.out.println("Enter the second number.");
		y = getIntScanner();
		
		System.out.println(x - y);
	}
	
	//Handles multiplication
	public void multiplication() {
		System.out.println("Enter the first number.");
		x = getIntScanner();
		
		System.out.println("Enter the second number.");
		y = getIntScanner();
		
		System.out.println(x * y);
	}
	
	//Handles division
	public void division() {
		System.out.println("Enter the first number.");
		x = getIntScanner();
		
		System.out.println("Enter the second number.");
		y = getIntScanner();
		
		System.out.println(x / y);
	}
}
