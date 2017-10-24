package Aufgabe3;

import java.util.Scanner;

public class SummationApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true){									//Endlosschleife
		
			System.out.println("please insert two numbers");
			double x= scan.nextDouble();
			double y= scan.nextDouble();
			System.out.println("The sum of "+ x+ " and "+ y+ " is "+ (x+y));
			
			if((x+y)> 200)								//wenn ergebniss größer als 200
				break;									//hier abgebrochen			
		}
		
		scan.close();
	}

}
