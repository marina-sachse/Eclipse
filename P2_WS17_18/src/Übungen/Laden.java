package Übungen;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JWindow;

public class Laden extends JWindow{

	public Laden() {
		getContentPane().setBackground(Color.YELLOW);
		
		JLabel label = new JLabel("inizialisiert");
		add(label);
		
		setSize(200, 200);;
		setVisible(true);
	}
}
