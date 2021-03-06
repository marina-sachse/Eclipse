package �bungen;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.Timer;

public class LadeProgressbar extends JWindow{
	
	private JProgressBar bar;
	private JLabel text;
	private Timer time;
	private int count;
	
	public LadeProgressbar() {
		bar = new JProgressBar();
		time = new Timer(20, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				bar.setStringPainted(true);
				bar.setValue(count);
				bar.setBackground(Color.RED);
				if(count == 100){
					showMain();
					time.stop();
					dispose();
				}
			}
		});
		time.start();
	
		add(bar);
		setSize(200, 200);
		setVisible(true);
	}
	
	public void showMain(){
		JFrame frame = new JFrame();
		frame.getContentPane().setBackground(Color.GREEN);
		
		text = new JLabel("geladen");
		
		frame.add(text);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 200);;
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LadeProgressbar();
	}

}
