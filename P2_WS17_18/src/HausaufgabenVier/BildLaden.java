package HausaufgabenVier;

import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class BildLaden extends JFrame{
	
	public BildLaden() {

		JMenuBar bar = new JMenuBar();
		JMenu menu = new JMenu("File");
		JMenuItem item = new JMenuItem("Open");
		item.addActionListener(e-> laden());
		menu.add(item);
		bar.add(menu);
		setJMenuBar(bar);
		
		/*ZeichneBild bild = new ZeichneBild();
		add(bild);
*/		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setSize(300, 300);
		setVisible(true);
	}
	
	private void laden() {
		
		JFileChooser fileChooser = new JFileChooser(new File("C:/Users/Marina/Pictures/Camera Roll"));
		
		if(fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
			File file = fileChooser.getSelectedFile();
			
				try {
					Image image = ImageIO.read(file);
					ZeichneBild bild = new ZeichneBild(image);
					add(bild);
				} catch (Exception e) {
					e.printStackTrace();
				}
		}	
	}

	public static void main(String[] args) {
		
		new BildLaden();
	}

}
