package Swing;

// A simple Swing program.

import javax.swing.*;
import java.awt.*;

public class SwingDemo {

    SwingDemo() {

        // Create a new JFrame container.
        JFrame jfrm = new JFrame("A Simple Swing Application.");

        // Give the frame an initial size.
        jfrm.setSize(275, 100);

        // Terminate the program when user closes application.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a text-based label.
        JLabel jlab = new JLabel(" GUI programming with Swing.");

        // Add label to content pane.
        jfrm.add(jlab, BorderLayout.EAST);

        // Display the frame.
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        // Create the frame on event dispatching thread.
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingDemo();
            }
        });
    }
}
