package Aufgabe4;

import java.util.Scanner;

public class Bitrate {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Spielzeit [min sek]");
//		int ges= ((s.nextInt()* 60)+ s.nextInt());								--> mit zwischenspeicher in Variable
		System.out.println("Bitrate [Kilobit/sec]");
//		int bitRate = s.nextInt();												--> mit zwischenspeicher in Variable
		System.out.println("Groesse der Datei: " + (((s.nextInt()* 60)+ s.nextInt())* s.nextInt()/ 8) + "Bytes");
//		System.out.println("Groesse der Datei: "+ (ges* bitRate/ 8)+ "Bytes");	--> mit zwischenspeicher in Variable		
		s.close();
	}

}
