import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import static java.lang.System.out;

public class Files {
	public void filesTesting() throws FileNotFoundException {
		Scanner myScanner = new Scanner(System.in);
		Scanner diskScanner = new Scanner(new File("occupancy"));
		int whichRoom;
		out.print("Which room? ");
		whichRoom = myScanner.nextInt();
		
		for (int roomNum = 0; roomNum < whichRoom; roomNum++) {
			diskScanner.nextInt();
		}
		
		out.print("Room ");
		out.print(whichRoom);
		out.print(" has ");
		out.print(diskScanner.nextInt());
		out.println(" guest(s).");
	}
}
