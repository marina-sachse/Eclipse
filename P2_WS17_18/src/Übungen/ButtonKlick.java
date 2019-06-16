package Übungen;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ButtonKlick extends JFrame{

	public ButtonKlick() {
		setLayout(new FlowLayout());
		JButton button = new JButton("klick mich");
		JTextField textfield = new JTextField(20);
		
		button.addActionListener(e->{
			if(textfield.getText().length() >= 3){
				button.setText(textfield.getText());
			}
			else{
				button.setText("zu kurz");
			}
		});
		
		add(textfield);
		add(button);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ButtonKlick();
	}

}
