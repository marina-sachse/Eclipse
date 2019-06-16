package Unterricht;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;

public class TimerPanel extends JPanel {

	private static final int OVAL_SIZE=10;
	private static final Random RANDOM = new Random();
	private boolean drawOvals = false;
	private boolean isBackgroundCleared = false;
	public TimerPanel() {
		
		Timer paintTimer = new Timer(100, e->{
			repaint();
		});
		Timer startTimer = new Timer(5000, e-> {
			paintTimer.start();
			drawOvals = true;
		});
		startTimer.setRepeats(false);
		startTimer.start();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		if(drawOvals) {
			if(!isBackgroundCleared) {
				super.paintComponent(g);
				isBackgroundCleared = true;
			}
			int x = RANDOM.nextInt(getWidth());
			int y = RANDOM.nextInt(getHeight());
			g.fillOval(x - OVAL_SIZE / 2, y - OVAL_SIZE / 2, OVAL_SIZE, OVAL_SIZE);
			
		} else {
			g.drawString("Die Kreise kommen bald!", 20, 20);
		}
		
		
	}
	
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(400, 400);
	}
}
