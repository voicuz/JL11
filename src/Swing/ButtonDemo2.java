package Swing;

// Demonstrate Lambda Expression with push button and handle action events.

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonDemo2 {

    JLabel jlab;

    ButtonDemo2() {
        // Create a new JFrame container.
        JFrame jfrm = new JFrame("A Button Example.");

        // Specify FlowLayout for the layout manager.
        jfrm.setLayout(new FlowLayout());

        // Give the frame an initial size.
        jfrm.setSize(220, 90);

        // Terminate the program when user closes the application.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make two buttons.
        JButton jbtnUp = new JButton("Up");
        JButton jbtnDown = new JButton("Down");
//        JButton jbtnX = new JButton("X");

        // Add action listeners.
        jbtnUp.addActionListener((ae) ->  jlab.setText("You pressed Up."));
        jbtnDown.addActionListener((ae) -> jlab.setText("You pressed Down."));
//        jbtnX.addActionListener(this);

        // Add the buttons to the content pane.
        jfrm.add(jbtnUp);
        jfrm.add(jbtnDown);
//        jfrm.add(jbtnX);

        // Create a label.
        jlab = new JLabel("Press a button.");

        // Add the label to frame.
        jfrm.add(jlab);

        // Display the frame.
        jfrm.setVisible(true);
    }

    /*
    // Handle button events.
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("Up"))
            jlab.setText("You pressed Up.");
        if(ae.getActionCommand().equals("Down"))
            jlab.setText("You pressed Down.");
    }

     */

    public static void main(String[] args) {
        // Create the frame on the event dispatching thread.
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ButtonDemo2();
            }
        });
    }
}
