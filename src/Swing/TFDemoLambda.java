package Swing;

// Use a text field.

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TFDemoLambda {

    JTextField jtf;
    JButton jbtnRev;
    JLabel jlabPrompt, jlabContents;

    TFDemoLambda() {

        // Create a new JFrame container.
        JFrame jfrm = new JFrame("Use a Text Field");

        // Specify a FlowLayout for the layout manager.
        jfrm.setLayout(new FlowLayout());

        // Give the frame an initial size.
        jfrm.setSize(240, 120);

        // Terminate the program when user closes application.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a text field.
        jtf = new JTextField(10);

        // Set the action commands for text field.
        jtf.setActionCommand("myTF");

        // Create a Reverse button.
        jbtnRev = new JButton("Reverse");

        // Add action listeners.
        jtf.addActionListener((ae) -> jlabContents.setText("You pressed ENTER. Text is: " + jtf.getText()));
        jbtnRev.addActionListener((ae) -> {
            String orgStr = jtf.getText();
            String resStr = "";

            // Reverse string in text field.
            for(int i=orgStr.length()-1; i>=0; i--)
                resStr += orgStr.charAt(i);

            // Store reverse string in text field.
            jtf.setText(resStr);
        });

        // Create the labels.
        jlabPrompt = new JLabel("Enter text: ");
        jlabContents = new JLabel("");

        // Add components to content pane.
        jfrm.add(jlabPrompt);
        jfrm.add(jtf);
        jfrm.add(jbtnRev);
        jfrm.add(jlabContents);

        // Display the frame.
        jfrm.setVisible(true);
    }

    /*
    // Handle action events.
    public void actionPerformed(ActionEvent ae) {

        if(ae.getActionCommand().equals("Reverse")) {
            // The Reverse button was pressed.
            String orgStr = jtf.getText();
            String resStr = "";

            // Reverse string in text field.
            for(int i=orgStr.length()-1; i>=0; i--)
                resStr += orgStr.charAt(i);

            // Store reverse string in text field.
            jtf.setText(resStr);
        }
        // Enter is pressed while focus in the text field.
        if(ae.getActionCommand().equals("myTF"))
            jlabContents.setText("You pressed ENTER. Text is: " + jtf.getText());
    }

     */

    public static void main(String[] args) {
        // Create frame on event dispatching thread.
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TFDemoLambda();
            }
        });
    }
}
