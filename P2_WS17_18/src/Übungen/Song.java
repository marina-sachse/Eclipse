package Übungen;

public class Song {
	
	private int sec;
	private String titel;
	
	public Song(String titel, int sec) {
		this.titel = titel;
		this.sec = sec;
	}

	public int getSec() {
		return sec;
	}

	public String getTitel() {
		return titel;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return   titel + " : " + sec;
	}
}
