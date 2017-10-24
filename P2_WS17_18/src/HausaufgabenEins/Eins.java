package HausaufgabenEins;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;


public class Eins extends JFrame {
	
	private int guess;
	
	public Eins() {
		setTitle("Ratespiel");
		
		JButton right = new JButton("Stimmt's?");
		JButton number = new JButton("neue Zahl");
		JTextField tipp = new JTextField(10);
		JLabel answer = new JLabel("Rate eine Zahl zwischen 0 und 99");
		JPanel panel = new JPanel(new FlowLayout());
		
		guess = (int)(Math.random()* 99);
		
		right.addActionListener(e-> {
			if(Integer.parseInt(tipp.getText()) == guess){
				answer.setText("Richtig");
			}
			
			else if(Integer.parseInt(tipp.getText()) < guess){
				answer.setText(tipp.getText() + " ist zu klein");
			}
			
			else{
				answer.setText(tipp.getText() + " ist zu groß");
			}
				
		});
		
		number.addActionListener(e-> {
			guess = (int)(Math.random()* 99);
		});
	
		panel.add(tipp);
		panel.add(right);
		add(answer, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		add(number, BorderLayout.SOUTH);
		
		
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}


	public static void main(String[] args) {
		
		new Eins();
		
	}

}
