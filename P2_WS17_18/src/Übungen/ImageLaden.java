package Übungen;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class ImageLaden extends JPanel{
	
	private BufferedImage img;
	private File file;
	
	public ImageLaden() {
		setLayout(new BorderLayout());
		JButton laden = new JButton("laden");
		
		laden.addActionListener(t->{
			JFileChooser chooser = new JFileChooser("C:/Users/Marina/Pictures/Camera Roll/Schnappschüsse");
			if(chooser.showOpenDialog(null)== chooser.APPROVE_OPTION){
					try {
					file = chooser.getSelectedFile();
					img = ImageIO.read(file);
					repaint();
				} catch (Exception e) {
					System.out.println("nein");
				}
			}
		});
		
		JMenuBar bar = new JMenuBar();
		JMenu menu = new JMenu("File");
		JMenu test = new JMenu("test");
		JMenuItem item = new JMenuItem("öffnen");
		JMenuItem test2 = new JMenuItem("test2");
		
		item.addActionListener(a->{
			JFileChooser chooser = new JFileChooser("C:/Users/Marina/Pictures/Camera Roll/Schnappschüsse");
			if(chooser.showOpenDialog(null)== chooser.APPROVE_OPTION){
					try {
					file = chooser.getSelectedFile();
					img = ImageIO.read(file);
					repaint();
				} catch (Exception e) {
					System.out.println("nein");
				}
			}
		});
		
		bar.add(menu);
		bar.add(test);
		test.add(test2);
		menu.add(item);
		add(bar);
		add(laden, BorderLayout.SOUTH);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, 0, 0, null);
	}
}
