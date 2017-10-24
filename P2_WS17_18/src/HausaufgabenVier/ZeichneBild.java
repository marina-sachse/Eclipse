package HausaufgabenVier;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

public class ZeichneBild extends JPanel{
	
	private Image image;
	
	public ZeichneBild(Image image) {
		
		setImage(image);
	}
	
	public void setImage(Image image) {
	      this.image = image;
	      repaint();
	   }
	
	@Override
	public Dimension getPreferredSize() {
		
		return new Dimension(image.getWidth(this), image.getHeight(this));
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		if (image != null) {
			g.drawImage(image, 0, 0, this);
		}
	}
	
}
