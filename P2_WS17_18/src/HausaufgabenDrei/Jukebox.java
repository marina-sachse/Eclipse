package HausaufgabenDrei;

import java.awt.FlowLayout;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JList;

public class Jukebox extends JFrame{
	
	private DefaultListModel<String> listModel;
	private JList<String> list;
	
	public Jukebox(){
		setTitle("Songs");
		setLayout(new FlowLayout());
		
		JButton add = new JButton("Add");
		JButton load = new JButton("Load");
		JButton save = new JButton("Save");
		listModel = new DefaultListModel<>();
		list = new JList<>(listModel);
		
		
		add.addActionListener(e ->{
			DialogFenster eingabe = new DialogFenster(listModel, new JFrame());			
		});	
		
		load.addActionListener(e ->{
			JFileChooser fileChooser = new JFileChooser(new File("src"));
			
			if(fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
				File file = fileChooser.getSelectedFile();
			
				try {
						Scanner scan = new Scanner(file);
					while (scan.hasNextLine()) {
						listModel.addElement(scan.nextLine());
					}
					scan.close();
				} catch (Exception a) {
					a.printStackTrace();
				}									
			}
		});
		
		save.addActionListener(e ->{
			JFileChooser fileChooser = new JFileChooser(new File("src"));

			if(fileChooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION){
				File file = fileChooser.getSelectedFile();
				
				try {
                    PrintWriter writer = new PrintWriter(file);
                    writer.println(list.getModel());
                    writer.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }								
			}
		});
		
		add(list);
		add(add);
		add(load);
		add(save);
		
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		new Jukebox();
	}
}
