package Übungen;

import javax.swing.JButton;
import javax.swing.JFrame;

public class IsKlicked extends JFrame{

	public IsKlicked() {
		JButton but = new JButton("Klick mich");
		but.addActionListener(e->{
			but.setText("Ich wurde geklickt");
		});
		add(but);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new IsKlicked();
	}
}
