package HausaufgabenVier;

import javax.swing.JFrame;

public class Kreise extends JFrame{
	
	public Kreise() {
		ZeichneKreise zeichnen = new ZeichneKreise();
		add(zeichnen);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
	//	pack();
		setVisible(true);
		
	}

	public static void main(String[] args) {
		
		new Kreise();
	}

}
