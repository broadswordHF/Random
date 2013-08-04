import java.util.Scanner;

public class Calculator {
	static Scanner onScanner = new Scanner(System.in);
	static int x, y;
	
	//Makes it easier to get the scanner for the number.
	public int getScanner() {
		return onScanner.nextInt();		
	}
	
	//Choose either addition, multiplication, subtraction, or division.
	void chooseType() {	
		System.out.print("Which you like to add, multiply, subtract, or divide: ");
		String userInput = onScanner.nextLine();
		
		if(userInput.toLowerCase() == "add") {
			addition();
		} else if (userInput.toLowerCase() == "multiply") {
			multiplication();
		} else if (userInput.toLowerCase() == "subtract") {
			subtraction();
		} else if (userInput.toLowerCase() == "divide") {
			division();
		} else {
			System.out.println("Please enter either add, multiply, subtract, or divide. \n");
			chooseType();
		}
	}
	
	//Handles addition
	void addition() {
		System.out.println("Enter the first number: ");
		x = getScanner();
		
		System.out.println("Enter the second number: ");
		y = getScanner();
		
		System.out.println(x + y);
	}
	
	//Handles subtraction
	void subtraction() {
		System.out.println("Enter the first number.");
		x = getScanner();
		
		System.out.println("Enter the second number.");
		y = getScanner();
		
		System.out.println(x - y);
	}
	
	//Handles multiplication
	void multiplication() {
		System.out.println("Enter the first number.");
		x = getScanner();
		
		System.out.println("Enter the second number.");
		y = getScanner();
		
		System.out.println(x * y);
	}
	
	//Handles division
	void division() {
		System.out.println("Enter the first number.");
		x = getScanner();
		
		System.out.println("Enter the second number.");
		y = getScanner();
		
		System.out.println(x / y);
	}
}
