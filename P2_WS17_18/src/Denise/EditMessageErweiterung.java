package Denise;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by Denise on 05.10.2017.
 */
public class EditMessageErweiterung extends JFrame {

    public EditMessageErweiterung() {

        Box box = Box.createVerticalBox();
        setContentPane(box);

        JTextArea textArea = new JTextArea(10, 10);
        JPanel mid = new JPanel();
        JPanel bottom = new JPanel();

        JLabel fontSizeLabel = new JLabel("Font Size");
        JSpinner fontSize = new JSpinner(new SpinnerNumberModel(12, 10, 20, 1));
        JLabel fontTypeLabel = new JLabel("Font Type");
        JCheckBox boldCheckbox = new JCheckBox("Bold");
        JCheckBox italicCheckbox = new JCheckBox("Italic");

        JButton load = new JButton("Load");
        JButton save = new JButton("Save");

        fontSize.addChangeListener(e -> {
            float number = (int) fontSize.getValue();
            Font font = textArea.getFont().deriveFont(number);
            textArea.setFont(font);
        });

        ChangeListener onCheckBoxChange = new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int style = 0;
                if (boldCheckbox.isSelected()) {
                    style += Font.BOLD;
                }
                if (italicCheckbox.isSelected()) {
                    style += Font.ITALIC;
                }
                textArea.setFont(textArea.getFont().deriveFont(style));
            }
        };
        boldCheckbox.addChangeListener(onCheckBoxChange);
        italicCheckbox.addChangeListener(onCheckBoxChange);

        save.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser(new File("src/d171005/Hausaufgaben"));
            if (fileChooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                try {
                    PrintWriter writer = new PrintWriter(file);
                    //FileWriter writer = new FileWriter(file);
                    writer.println(textArea.getText());
                    writer.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

        load.addActionListener(e ->  {
            JFileChooser fileChooser = new JFileChooser(new File("src/d171005/Hausaufgaben"));
            if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                try {
                    Scanner scanner = new Scanner(file);
                    textArea.setText("");
                    while (scanner.hasNext()) {
                        String line = scanner.nextLine();
                        textArea.append(line + "\n");
                    }
                    scanner.close();
                } catch (FileNotFoundException ex) {
                    System.out.println("Datei nicht gefunden");
                    ex.printStackTrace();
                }

            }
        });

        mid.add(fontSizeLabel);
        mid.add(fontSize);
        mid.add(fontTypeLabel);
        mid.add(boldCheckbox);
        mid.add(italicCheckbox);
        bottom.add(load);
        bottom.add(save);
        box.add(textArea);
        box.add(mid);
        box.add(bottom);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        pack();
        //    setResizable(false);
    }

    public static void main(String[] args) {
        new EditMessageErweiterung();
    }
}
