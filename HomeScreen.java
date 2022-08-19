package Project1;

import java.util.Scanner;

public class HomeScreen {
	public int display() {
		HomeScreen hs = new HomeScreen();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select one of the three options by entering the number of your choice");
		System.out.println("1.  Display all files in the directory alphabetically");
		System.out.println("2.  More options");
		System.out.println("3.  Close program");
		
		int input = sc.nextInt();
		while(3 < input || input < 1) {
			System.out.println("Not a valid option please select one of the listed options");
			System.out.println("");
			input = hs.display();
		}
		return input;
	}
}
