package �bungen;

import java.awt.Color;
import java.awt.Graphics;
import java.util.List;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.io.PipedOutputStream;
import java.util.ArrayList;

import javax.swing.JPanel;

public class PingPong extends JPanel{
	
	private List <Point> p = new ArrayList<>();
	private Point t;
	
	public PingPong() {
		setBackground(Color.GREEN);
		addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				t = e.getPoint();
			//	p.add(e.getPoint());
				repaint();
			}
		});
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.RED);		
		g.fillRect(0 ,0 , 10, 10);
		/*for (Point toDraw : p) {
			g.setColor(Color.RED);
			g.fillRect(toDraw.x, toDraw.y, 10, 10);   zeichnet alle punkte
		}*/
		if(t != null){
			g.setColor(getBackground());
			g.fillRect(0, 0, 10, 10);
			g.setColor(Color.RED);
			g.fillRect(getWidth()-15, t.y - 15, 10, 30);
		}
		
		
	}
}
