package Übungen;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JSpinner;

public class MyFrame extends JFrame{
	
	public MyFrame() {
		// TODO Auto-generated constructor stub
		JPanel first = new JPanel();
		first.add(new JButton("hi"));
		first.add(new JLabel("Klick den Knopf"));
		setLayout(new GridLayout(2, 2));
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		menuBar.add(new JMenu("Datei"));
		
		JPanel second = new JPanel();
		JPanel third = new JPanel();
		JPanel forth = new JPanel();
		
		forth.add(new JSpinner());
		add(first);
		add(second);
		add(third);
		add(forth);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame();
	}

}
