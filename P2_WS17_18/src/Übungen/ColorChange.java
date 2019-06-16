package Übungen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ColorChange extends JFrame{
	
	private int r= 0;
	private int g = 0;
	private int b = 0;
	
	public ColorChange() {
		JPanel top = new JPanel();
		JPanel but = new JPanel(new GridLayout(3, 3));
		JSlider redS = new JSlider(0, 255, 0);
		JSlider blueS = new JSlider(0, 255, 0);
		JSlider greenS = new JSlider(0, 255, 0);
		JTextField redZ = new JTextField("0");
		JTextField greenZ = new JTextField("0");
		JTextField blueZ = new JTextField("0");
		
		top.setBackground(Color.BLACK);
		top.setPreferredSize(new Dimension(20, 100));
		
		redS.addChangeListener(e->{
			r = redS.getValue();
			top.setBackground(new Color(r, g, b));
			redZ.setText(String.valueOf(redS.getValue()));
		});
		redZ.addActionListener(e->{
			redS.setValue(Integer.parseInt(redZ.getText()));
		});
		greenS.addChangeListener(e->{
			g = greenS.getValue();
			top.setBackground(new Color(r, g, b));
			greenZ.setText(String.valueOf(greenS.getValue()));
		});
		greenZ.addActionListener(e->{
			greenS.setValue(Integer.parseInt(greenZ.getText()));
		});
		blueS.addChangeListener(e->{
			b = blueS.getValue();
			top.setBackground(new Color(r, g, b));
			blueZ.setText(String.valueOf(blueS.getValue()));
		});
		blueZ.addActionListener(e->{
			blueS.setValue(Integer.parseInt(blueZ.getText()));
		});
		
		but.add(new JLabel("ROT:"));
		but.add(redS);
		but.add(redZ);
		but.add(new JLabel("GRÜN:"));
		but.add(greenS);
		but.add(greenZ);
		but.add(new JLabel("BLAU:"));
		but.add(blueS);
		but.add(blueZ);
		
		add(top);
		add(but, BorderLayout.PAGE_END);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		new ColorChange();
	}

}
