package HausaufgabenEins;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Drei extends JFrame{
	JCheckBox bold, italic;
	JLabel type, size;
	JButton save, load;
	JSpinner spinner;
	JTextArea text;
	JPanel hor, ver1, ver2;
	
	public Drei (){
		setTitle("Edit Massenger");
		
		hor = new JPanel();
		hor.setLayout(new BoxLayout(hor, BoxLayout.Y_AXIS));
		text = new JTextArea("hier Text", 10, 20);
		hor.add(text);
		hor.add(Box.createVerticalStrut(20));
		ver1 = new JPanel();
			ver1.setLayout(new BoxLayout(ver1, BoxLayout.X_AXIS));
			ver1.add(Box.createHorizontalStrut(10));
			size = new JLabel("Font Size:");
			ver1.add(size);
			ver1.add(Box.createHorizontalStrut(10));
			spinner = new JSpinner(new SpinnerNumberModel(12, 2, 50, 1));
			ver1.add(spinner);
			ver1.add(Box.createHorizontalStrut(30));
			type = new JLabel("Font Type:");
			ver1.add(type);
			ver1.add(Box.createHorizontalStrut(10));
			bold = new JCheckBox("Bold");
			ver1.add(bold);
			ver1.add(Box.createHorizontalStrut(10));
			italic = new JCheckBox("Italic");
			ver1.add(italic);
			ver1.add(Box.createHorizontalStrut(10));
			
		hor.add(ver1);
		hor.add(Box.createVerticalStrut(20));
		ver2 = new JPanel();
			ver2.setLayout(new BoxLayout(ver2, BoxLayout.X_AXIS));
			ver2.add(Box.createHorizontalGlue());
			load = new JButton("load");
			load.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					int fontSize = (int) spinner.getValue();
					Font oldFont = text.getFont();
					Font newFont;
					if(bold.isSelected() && italic.isSelected()){
						newFont = oldFont.deriveFont(Font.BOLD | Font.ITALIC, (float)fontSize);
						text.setFont(newFont);
					}	
					else if(bold.isSelected()){
						newFont = oldFont.deriveFont(Font.BOLD, (float)fontSize);
						text.setFont(newFont);
					}	
					else if(italic.isSelected()){
						newFont = oldFont.deriveFont(Font.ITALIC, (float)fontSize);
						text.setFont(newFont);
					}	
					else
						newFont = oldFont.deriveFont(Font.PLAIN, (float)fontSize);
						text.setFont(newFont);
					
					
				}
			});
			ver2.add(load);
			ver2.add(Box.createHorizontalStrut(10));
			save = new JButton("save");
			save.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					Font saveFont = text.getFont();
					spinner.setValue(saveFont.getSize());
				}
			});
			ver2.add(save);
			ver2.add(Box.createHorizontalStrut(10));
		hor.add(ver2);	
		hor.add(Box.createVerticalStrut(10));
		add(hor);
				
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
	}
	public static void main(String[] args) {
		new Drei();
	}
}

