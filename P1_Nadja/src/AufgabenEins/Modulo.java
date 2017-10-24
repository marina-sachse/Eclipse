package AufgabenEins;

public class Modulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//9. Welche Aufgabe hat der Modulo-Operator. Schreiben Sie ein kurzes Beispiel auf: 
			int res = 0;
			int mod = 2;
			int val = 0 ;
			
			
			System.out.println("Zahl ist ungerade bei 1: \n");
			for(int i = 1; i <= 10; i++){
				val = i;
				res = val % mod; 
			System.out.println(val + "->" + res);			}
	}

}
