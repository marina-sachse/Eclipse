package AufgabenEins;

import java.util.Scanner;

public class DialogApp {
		
	public static void main(String[] args) {
		
		System.out.println("Hallo, wie heiﬂt du?");
		Scanner scan = new Scanner(System.in);
		System.out.println("Hallo " + scan.nextLine());
		scan.close();
	}
	
}
