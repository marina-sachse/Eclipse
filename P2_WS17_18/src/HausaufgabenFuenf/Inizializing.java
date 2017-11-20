package HausaufgabenFuenf;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JWindow;
import javax.swing.Timer;

public class Inizializing extends JWindow{
	
	private Timer timer;
	private int counter;
	
	public Inizializing() {

		
		JTextField iniz = new JTextField("inizializing");
		add(iniz);
		timer = new Timer(20, (e)->{
			counter++;
			if(counter == 100){
				
				MainFrame();
				timer.stop();
			}
			
		});

		getContentPane().setBackground(Color.YELLOW);
		
		setSize(200, 200);
		setVisible(true);
	}
	
	private void MainFrame(){
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		new Inizializing();
	}

}
