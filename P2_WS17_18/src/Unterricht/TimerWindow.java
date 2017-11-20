package Unterricht;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.Timer;

public class TimerWindow extends JWindow{
	
	private int counter;
	private Timer progressTimer;
	
	public TimerWindow() {
		
		JProgressBar progressBar = new JProgressBar();
		add(progressBar);
		progressTimer = new Timer(20, (e)-> {
			counter++;
			progressBar.setValue(counter);
			if(counter == 100) {
				showMainWindow();
				progressTimer.stop();
				
			}
		});
		progressTimer.start();
		getContentPane().setBackground(Color.YELLOW);
		
		setSize(500, 200);
		setVisible(true);
		
	}
	
	private void showMainWindow() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		new TimerWindow();
	}
}