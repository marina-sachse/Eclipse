package Übungen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Timer;

public class MainZeichnen extends JFrame{
	
	private int count;

	public MainZeichnen() {
		Schach schach = new Schach();
		ZufälligeKreise kreis = new ZufälligeKreise();
		KreisGroesseAendern aendern = new KreisGroesseAendern();
		ImageLaden bild = new ImageLaden();
		KreiseZeit zeit = new KreiseZeit();
		Timer time = new Timer(10, new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						count++;
						repaint();
						/*if(count == 50){
							time.stop();
							System.out.println("ich komme hier an");
						}*/
					}
				});
		//time.start();
		if(count == 50){
			time.stop();
			System.out.println("ich komme hier an");
		}
		
		DragRechteck r = new DragRechteck();
		
		add(schach);
		add(kreis);
		//add(aendern);
		//add(bild);
		//add(zeit);
		add(r);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);;
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MainZeichnen();
	}

}
