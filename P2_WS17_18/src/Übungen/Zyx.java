package �bungen;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.event.MouseInputAdapter;
import javax.swing.event.MouseInputListener;

public class Zyx extends JFrame{
	MouseInputListener inpu = new MouseInputListener() {
		
		@Override
		public void mouseMoved(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseDragged(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	};
	MouseMotionListener lis = new MouseMotionListener() {
		
		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	};
	MouseListener m =  new MouseListener() {
		
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	};
	MouseInputAdapter a = new MouseInputAdapter() {
		@Override
		public void mousePressed(MouseEvent e) {};
		public void mouseMoved(MouseEvent e) {};
	};
	KeyListener k = new KeyListener() {
		
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
	};
	KeyAdapter key = new KeyAdapter() {
		
	};
	
	
	public static void main(String[] args) {
		ArrayList<Integer>te= new ArrayList<>();
		int s= 2;
		int e = 3;
		int t = 5;
		te.add(e);
		te.add(s);
		te.add(t);
		System.out.println(te.get(1));
		te.set(2, 9);
		System.out.println(te.get(2));
		System.out.println(te.indexOf(3));
		
		Map<Integer, String> m = new HashMap<>();
		m.put(3, "e");
		m.put(6, "w");
		
		Map<Integer, String> et = new HashMap<>();
		System.out.println(et.get(3));
		m.putAll(et);
		System.out.println(et.get(3));
		
		JFrame f = new JFrame();
		ChatPanel 
	}
}
