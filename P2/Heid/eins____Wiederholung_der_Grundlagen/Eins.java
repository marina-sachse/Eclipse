package eins____Wiederholung_der_Grundlagen;

public class Eins {

	public static void main(String[] args) {
		
		for(int i = -6; i<= 6; i += 2){
			double erg;
			if(i < 0){
				erg = 1.5* i;
			}
			else{
				erg = i/ 2;	
			}
			System.out.println("f(" + i + ") = " + erg);
		}

	}

}
