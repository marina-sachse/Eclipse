package Übungen;

import java.awt.Color;

import javax.swing.JFrame;

public class Main extends JFrame{
	
	public Main() {
		//DragRechteck test = new DragRechteck();
		PingPong pong = new PingPong();
		
		add(pong);
		//add(test);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(250, 250);;
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
