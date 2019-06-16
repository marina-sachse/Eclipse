package Übungen;

import java.awt.BorderLayout;

import javax.swing.Box;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;

public class Jukebox extends JFrame{

	public Jukebox() {
		DefaultListModel<Song> model = new DefaultListModel<>();
		JList<Song> list = new JList<>(model);
		JButton add = new JButton("add");
		JButton load = new JButton("Load");
		JButton save = new JButton("save");
		Box box = Box.createVerticalBox();
		
		add.addActionListener(e->{
			NeuerSong neu = new NeuerSong();
			Song song = neu.getSong();
			if(song != null){
				model.addElement(song);
			}			
		});
		
		box.add(add);
		box.add(load);
		box.add(save);
		add(list);
		add(box, BorderLayout.EAST);
			
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Jukebox();
	}
}
