package HausaufgabenDrei;

import java.awt.FlowLayout;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.ListModel;

public class DialogFenster extends JDialog {
	
	private Boolean isOkClicked;
	private DefaultListModel<String> listModel = new DefaultListModel<>();

	public DialogFenster(DefaultListModel <String> listModel, JFrame parent){
		super(parent, "Add Song", true);
		this.listModel = listModel;
		setLayout(new FlowLayout());
		JTextField titel = new JTextField("Titel eingeben", 10);
		JTextField time = new JTextField("L�nge eingeben", 10);
		JButton add = new JButton("Add");
		JButton cancel = new JButton("Cancel");
		add(titel);
		add(time);
		add(add);
		add(cancel);
		add.addActionListener(e ->{
			dispose();
			listModel.addElement(titel.getText());
			listModel.addElement(time.getText());
			isOkClicked = true;
		});
		cancel.addActionListener(e ->{
			dispose();
			isOkClicked = false;
		});
		
		pack();
		setVisible(true);	
	}
	
	
}
