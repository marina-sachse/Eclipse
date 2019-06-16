package Übungen;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class KreiseZeit extends JPanel{
	private Timer time;
	private JPanel pan;
	private int randX;
	private int randY;
	private int randZ;
	private int count;
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);		
		time = new Timer(10, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				randX = (int)(Math.random()*255);
				randY = (int)(Math.random()*255);
				randZ = (int)(Math.random()*255);
				g.fillOval(randX, randY, 20, 20);
				g.setColor(new Color(randX, randY, randZ));
				if(count == 505){
					time.stop();
					System.out.println("ich komme hier an");
				}
			}
		});
		time.start();	
	}
}
