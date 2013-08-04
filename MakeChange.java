import java.util.Scanner;


public class MakeChange {
	void changeConverter() {
		Scanner myScanner = new Scanner(System.in);
		int quarters, dimes, nickels, cents;
		int whatsLeft, total;
		
		System.out.print("How many cents do you have?");
		total = myScanner.nextInt();
		
		quarters = total / 25;
		whatsLeft = total % 25;
		
		dimes = whatsLeft / 10;
		whatsLeft = whatsLeft % 10;
		
		nickels = whatsLeft / 5;
		whatsLeft = whatsLeft % 5;
		
		cents = whatsLeft;
		
		System.out.println();
		System.out.println("From " + total + " cents you get");
		System.out.println(quarters + " quarters");
		System.out.println(dimes + " dimes");
		System.out.println(nickels + " nickels");
		System.out.println(cents + " cents");
	}
}
