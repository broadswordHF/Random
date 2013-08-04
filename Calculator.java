import java.util.Scanner;

public class Calculator {
	static Scanner getNumber = new Scanner(System.in);
	static int x, y;
	
	public int getScanner() {
		return getNumber.nextInt();
	}
	
	void addition() {
		System.out.println("Enter the first number: ");
		x = getScanner();
		
		System.out.println("Enter the second number: ");
		y = getScanner();
		
		System.out.println(x + y);
	}
	
	void subtract() {
		System.out.println("Enter the first number.");
		x = getScanner();
		
		System.out.println("Enter the second number.");
		y = getScanner();
		
		System.out.println(x - y);
	}
	
	void multiply() {
		System.out.println("Enter the first number.");
		x = getScanner();
		
		System.out.println("Enter the second number.");
		y = getScanner();
		
		System.out.println(x * y);
	}
	
	void divide() {
		System.out.println("Enter the first number.");
		x = getScanner();
		
		System.out.println("Enter the second number.");
		y = getScanner();
		
		System.out.println(x / y);
	}
}
