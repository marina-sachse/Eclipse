package Übungen;

import java.awt.Dimension;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.SpinnerNumberModel;

public class Texteditor extends JFrame{
	
	private int style = 0;
	private int state;
	
	public Texteditor() {
		
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		Box mid = Box.createHorizontalBox();
		JPanel but = new JPanel();
		but.setLayout(new BoxLayout(but, BoxLayout.X_AXIS));
		
		JTextArea area = new JTextArea();
		JButton load = new JButton("Load");
		JButton save = new JButton("save");
		JLabel size = new JLabel("Font Size: ");
		JLabel type = new JLabel("Font Typ: ");
		JSpinner num = new JSpinner(new SpinnerNumberModel(12, 2, 30, 2));
		JCheckBox bold = new JCheckBox("bold");
		JCheckBox italic = new JCheckBox("italic");
		JFileChooser chooser = new JFileChooser("C:/Users/Marina/Documents/GitHub/Eclipse/P2_WS17_18/src");
		
		area.setPreferredSize(new Dimension(200, 100));
		
		num.addChangeListener(e->{
			float s = (int)num.getValue();
			Font f = area.getFont().deriveFont(s);
			area.setFont(f);
		});
		bold.addItemListener(e->{
			if(bold.isSelected()){
				style += Font.BOLD;	
			}
			else{
				style -= Font.BOLD;
			}
			area.setFont(area.getFont().deriveFont(style));
		});
		italic.addItemListener(e->{
			if(italic.isSelected()){
				style += Font.ITALIC;
				area.setFont(area.getFont().deriveFont(style));
			}
			else{
				style -= Font.ITALIC;
			}
			area.setFont(area.getFont().deriveFont(style));
		});
		
		load.addActionListener(l->{
			state = chooser.showOpenDialog(null);
			if(state == chooser.APPROVE_OPTION){
				File file = chooser.getSelectedFile();
				try {
					FileReader write = new FileReader(file);
					BufferedReader rd = new BufferedReader(write);
					String txt;
					while((txt = rd.readLine()) != null){
						area.append(txt + "\n");
					}
					rd.close();										
					/*Scanner scanner = new Scanner(file);
					while(scanner.hasNextLine()){
						area.append(scanner.nextLine() + "\n");
					}*/
				} catch (Exception e) {
					System.out.println("so nicht");
				}	
			}
		});
		
		save.addActionListener(s->{
			state = chooser.showSaveDialog(null);
			if(state == chooser.APPROVE_OPTION){
				File file = chooser.getSelectedFile();
				try {
					FileWriter write = new FileWriter(file);
					BufferedWriter bw = new BufferedWriter(write);
					bw.write(area.getText());
					bw.close();
					
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		});
		
		add(area);
		mid.add(Box.createVerticalStrut(15));
		mid.add(size);
		mid.add(num);
		mid.add(Box.createHorizontalStrut(15));
		mid.add(type);
		mid.add(bold);
		mid.add(italic);
		mid.add(Box.createVerticalStrut(15));
		add(mid);
		but.add(load);
		but.add(Box.createHorizontalStrut(15));
		but.add(save);
		add(but);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		new Texteditor();
	}

}
