import java.util.Scanner;

public class Start {
	private static MakeChange makeChange = new MakeChange();
	private static Calculator calculator = new Calculator();
	private static Scanner myScanner = new Scanner(System.in);
	
	public static void main(String args[]) {
		System.out.println("Do you want to use the calculator or convert dollars to different coins? Enter 'calc' for the calculator or 'coins' for the change converter.");
		String answer = myScanner.next();
		
		if (answer.equalsIgnoreCase("calc")) 
			calculator.chooseType();
		else if (answer.equalsIgnoreCase("coins")) 
			makeChange.changeConverter();
		else 
			System.out.println("Retry.");
		
	}
}