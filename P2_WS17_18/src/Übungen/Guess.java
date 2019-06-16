package Übungen;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Guess extends JFrame{
	
	private int num = (int)(Math.random()*99);
	
	public Guess() {
		setLayout(new GridLayout(3, 1));
		JLabel text = new JLabel("Rate eine Zahl zwischen 1 und 100");
		JTextField tipp = new JTextField(10);
		JButton check = new JButton("stimmt?");
		JButton other = new JButton("neue Zahl");
		JPanel middel = new JPanel();
		
		check.addActionListener(e->{
			if(tipp.getText().equals(String.valueOf(num))){
				text.setText("richtig!");
			}
			else if(Integer.parseInt(tipp.getText()) < num){
				text.setText("zu klein");
			}
			else{
				text.setText("zu groß");
			}
		});
		other.addActionListener(e->{
			num = (int)(Math.random()*99);
			text.setText("Rate eine Zahl zwischen 1 und 100");
		});
		
		middel.add(tipp);
		middel.add(check);
		add(text);
		add(middel);
		add(other);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		new Guess();
	}

}
