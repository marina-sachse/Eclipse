package �bungen;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ZahlenEinlesen {
	
	private Set<Integer> posNum;
	private Scanner scan;
	private int i;
	
	public ZahlenEinlesen() {
		scan= new Scanner(System.in);
		posNum= new HashSet<>();
		System.out.println("F�ge Positive Zahlen hinzu \nbei -1 wird das Program beendet");
		//i= scan.nextInt();
		while(true){
			i= scan.nextInt();
			if(i >= 0){
				posNum.add(i);
				System.out.println("ich bin hier");
			}
			else if (i == -1) {
				break;
			}
			else
				System.out.println("negative Zahl");
		}
		for (Integer integer : posNum) {
			System.out.println(integer);
		}
	}
	public static void main(String[] args) {
		new ZahlenEinlesen();
	}
}
