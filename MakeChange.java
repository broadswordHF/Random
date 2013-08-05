import java.util.Scanner;

public class MakeChange {
	private static Scanner myScanner = new Scanner(System.in);
	private static int total;
	
	public void changeConverter() {
		System.out.println("How many dollars do you have?");
		total = myScanner.nextInt() * 100;
		
		System.out.println("Do you want this turned into 'dimes', 'nickles', 'quarters', or 'pennies'?");
		String chooseCoin = myScanner.next();
		
		if (chooseCoin.equalsIgnoreCase("dimes") || chooseCoin.equalsIgnoreCase("dime")) 
			System.out.println(dimeConverter());
		else if (chooseCoin.equalsIgnoreCase("nickles") || chooseCoin.equalsIgnoreCase("nickle"))
			System.out.println(nickelConverter());
		else if (chooseCoin.equalsIgnoreCase("quarters") || chooseCoin.equalsIgnoreCase("quarter"))
			System.out.println(quarterConverter());
		else if (chooseCoin.equalsIgnoreCase("pennies") || chooseCoin.equalsIgnoreCase("penny"))
			System.out.println(pennyConverter());
		else
			System.out.println("Only type one of the listed options. \n");
			changeConverter();
		
	}
	
	public int dimeConverter() {
		return total / 10;
	}
	
	public int nickelConverter() {
		return total / 5;
	}
	
	public int quarterConverter() {
		return total / 25;
	}
	
	public int pennyConverter() {
		return total / 1;
	}
}
