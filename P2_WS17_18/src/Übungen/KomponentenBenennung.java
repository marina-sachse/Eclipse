package Übungen;

import java.awt.BorderLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class KomponentenBenennung extends JFrame{

	public KomponentenBenennung() {
		// TODO Auto-generated constructor stub
		JFrame frame = new JFrame("Feed Bean Exemple 3");
		JLabel name = new JLabel("Name:");
		//JLabel siteURL = new JLabel("Site URL:");
		JLabel feedURL = new JLabel("Feed URL:");
		JLabel feedTyp = new JLabel("Feed Typ:");
		JLabel customCheckInterval = new JLabel("Custom Check Interval:");
		JLabel interval = new JLabel("Interval:");
		JButton showFeedInformation = new JButton("Show Feed Information");
		JTextField clientJavaCom = new JTextField("clientJava.com");
		JTextField httpBlog = new JTextField("http://www.../bolg");
		JTextField httpRssXML = new JTextField("http://www.../rss.xml");
		JTextField four = new JTextField("4");
		JCheckBox check = new JCheckBox();
		String[] wahl = {"RSS_20", "RSS_21", "RSS_22"};
		JComboBox<String> choose = new JComboBox<String>(wahl);
		
		Box box = new Box(BoxLayout.Y_AXIS);
		box.add(name);
		box.add(new JLabel("Site URL:"));
		box.add(feedURL);
		box.add(feedTyp);
		box.add(customCheckInterval);
		box.add(interval);
		
		Box rigthBox= new Box(BoxLayout.Y_AXIS);
		rigthBox.add(clientJavaCom);
		rigthBox.add(httpBlog);
		rigthBox.add(httpRssXML);
		rigthBox.add(choose);
		rigthBox.add(check);
		rigthBox.add(four);
		
		add(box, BorderLayout.WEST);
		add(rigthBox, BorderLayout.EAST);
		add(showFeedInformation, BorderLayout.SOUTH);
		
		
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new KomponentenBenennung();
	}
}
