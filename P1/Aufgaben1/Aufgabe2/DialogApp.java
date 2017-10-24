package Aufgabe2;

import java.util.Scanner;

public class DialogApp {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Hallo, wie ist dein Name?");
		String name= scan.nextLine();
		System.out.println("freut mich dich kennen zu lernen " + name + " :)");
		scan.close();
	}
	
}
