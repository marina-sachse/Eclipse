package HausaufgabenVier;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class ZeichneSchachbrett extends JPanel{

	@Override
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		for (int i = 0; i < 200; i+= 20) {
			if(g.getColor()== Color.BLACK){
				g.setColor(Color.WHITE);
			}
			else{
				g.setColor(Color.BLACK);
			}
			for (int y = 0; y < 200; y+= 20) {
				if(g.getColor()== Color.WHITE){
					g.setColor(Color.BLACK);
					g.fillRect(y, i, 20, 20);		//erster wert nach links, zweiter wert nach unten
				}
				else{
					g.setColor(Color.WHITE);
					g.fillRect(y, i, 20, 20);
				}
			}
		}		
	}
}
