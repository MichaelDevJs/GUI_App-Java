package GUIPRACTICE;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class writeFiles extends JFrame {
    public writeFiles() {
        super();
        addComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void addComponents() {

        JPanel rootPanel = new JPanel();
        this.getContentPane().add(rootPanel);
        rootPanel.setLayout(new BorderLayout());
        rootPanel.setBackground(Color.BLUE);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("Input text here");
        final JTextField textPane = new JTextField(20);
        final String getText = textPane.getText();
        JButton button = new JButton();
        button = new JButton("Save Files");

        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                try {

                    FileWriter writer = new FileWriter("/Users/segunige/Desktop/code.txt");
                    writer.write("Inputed text from user is :" + textPane.getText());
                    writer.close();
                    System.out.println("Button clicked ,");
                    System.out.println(textPane.getText());
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });

        panel.add(label);
        panel.add(textPane);

        panel.add(button);

        rootPanel.add(panel, BorderLayout.CENTER);
    }

    public static void saveToText(String stringIn) throws IOException {
        FileWriter saveTo = new FileWriter("/Users/segunige/Desktop/code.txt");
        saveTo.write(stringIn);
        saveTo.close();
    }

}
