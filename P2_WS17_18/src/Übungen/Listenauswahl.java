package Übungen;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class Listenauswahl extends JFrame{

	public Listenauswahl() {
		setLayout(new FlowLayout());
		
		JList<String> choose = new JList<>(new String []{"blue", "green", "yellow", 
				"red", "black", "gray", "white", "orange", "purple"});
		JList<String> chosen = new JList<>();
		chosen.setPreferredSize(new Dimension(100, 120));
		JButton copy = new JButton("cpoy");
		JScrollPane scroll = new JScrollPane(choose);
		
		copy.addActionListener(e->{
			chosen.setListData(choose.getSelectedValuesList().toArray(new String[0]));
		});
		
		add(scroll);
		add(copy);
		add(chosen);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Listenauswahl();
	}

}
