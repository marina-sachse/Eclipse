package HausaufgabenVier;

import javax.swing.JFrame;

public class Schachbrett extends JFrame{
	
	public Schachbrett() {
		
		ZeichneSchachbrett zeichnen = new ZeichneSchachbrett();
		add(zeichnen);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(216, 238);
		setVisible(true);
	}

	public static void main(String[] args) {
		
		new Schachbrett();
	}

}
