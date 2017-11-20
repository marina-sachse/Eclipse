package HausaufgabenSieben;

import java.util.Arrays;

public class Sitze {
	
	private Boolean []groe�e;
	private int freieSitze;
	private int anzahlSitze;

	public Sitze(int gesamtSitze) {
		anzahlSitze = gesamtSitze;
		groe�e = new Boolean[gesamtSitze];
		Arrays.fill(groe�e, false);
		freieSitze = gesamtSitze;
	}
	
	private boolean reservieren(int ausgewaehlterSitz) {
		if(!groe�e[ausgewaehlterSitz]){
			groe�e[ausgewaehlterSitz]= true;
			freieSitze--;
			return true;
		}
		else{
			return false;
		}
	}

	public int getAnzahlSitze() {
		return anzahlSitze;
	}

	public int getFreieSitze() {
		return freieSitze;
	}

	

	public static void main(String[] args) {
		Sitze sitze = new Sitze(40);
		int sitzNummer = 20;
		if(sitze.reservieren(sitzNummer)){
			System.out.println("Sitz: " + sitzNummer + " wurde gebucht");
		}
		else{
			System.out.println(sitze.getFreieSitze() + " von " + 
					sitze.getAnzahlSitze() + " sind noch frei");
		}
	}
}
