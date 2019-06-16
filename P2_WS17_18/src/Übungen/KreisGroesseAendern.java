package �bungen;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;

public class KreisGroesseAendern extends JPanel{
	
	private int d = 20;
	
	public KreisGroesseAendern() {
		System.out.println(getSize().width);
		setBackground(Color.RED);
		JSlider slider = new JSlider(SwingConstants.HORIZONTAL, 1, 100, 20);
		slider.addChangeListener(e->{
			d = slider.getValue();
			repaint();
			System.out.println(slider.getValue());
		});
		add(slider);
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.GREEN);
		g.fillOval(250, 250, d, d);
	}
}
