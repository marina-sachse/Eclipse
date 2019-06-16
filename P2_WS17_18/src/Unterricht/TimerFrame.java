package Unterricht;

import javax.swing.JFrame;

public class TimerFrame extends JFrame{

	
	public TimerFrame() {
		
		
		add(new TimerPanel());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TimerFrame();
	}
}
