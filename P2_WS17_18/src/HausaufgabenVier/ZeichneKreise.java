package HausaufgabenVier;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class ZeichneKreise extends JPanel{	
	
	@Override
	protected void paintComponent(Graphics g) {

		super.paintComponent(g);
		for (int i = 0; i < 1000; i++) {
			int red = (int)(Math.random()*256);
			int green = (int)(Math.random()*256);
			int blue = (int)(Math.random()*256);
			g.setColor(new Color(red, green, blue));
			int bright = (int)(Math.random()*260);
			int weidth = (int)(Math.random()*240);
			g.fillOval(bright, weidth, 20, 20);
		}	
	}
}
