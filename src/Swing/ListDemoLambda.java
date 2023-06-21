package Swing;

// Demonstrate a simple JList.

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class ListDemoLambda {

    JList<String> jlst;
    JLabel jlab;
    JScrollPane jscrlp;

    // Create an array of names.
    String[] names = {"Sherry", "Jon", "Rachel", "Sasha",
                      "Josselyn", "Randy", "Tom", "Mary",
                      "Ken", "Andrew", "Matt", "Todd"};

    ListDemoLambda() {
        // Create a new JFrame container.
        JFrame jfrm = new JFrame("Jlist Demo");

        // Specify a flow layout;
        jfrm.setLayout(new FlowLayout());

        // Give frame an initial size.
        jfrm.setSize(200, 160);

        // Terminate program when user closes application.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JList.
        jlst = new JList<>(names);

        // Set list selection mode to single-selection.
//        jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Add list to scroll pane.
        jscrlp = new JScrollPane(jlst);

        // Set preferred size of scroll pane.
        jscrlp.setPreferredSize(new Dimension(120, 90));

        // Make a label that displays selection.
        jlab = new JLabel("Chose a name: ");

        // Add list selection handler.
        jlst.addListSelectionListener((le) -> {
            String str = "";
            // Get index of changed item.
            int[] idx = jlst.getSelectedIndices();

            // Display selection when its is selected.
            if(idx.length != 0) {
                for(int i=0; i < idx.length; i++)
                    str += names[idx[i]] + " ";
                jlab.setText("Current selection: " + str);
            }
            else // Otherwise, re-prompt.
                jlab.setText("Choose a name");
        });

        // Add list and label to content pane.
        jfrm.add(jscrlp);
        jfrm.add(jlab);

        // Display the frame.
        jfrm.setVisible(true);
    }
/*
    // Handle list selection events.
    public void valueChanged(ListSelectionEvent le) {
        String str = "";
        // Get index of changed item.
//        int idx = jlst.getSelectedIndex();
        int[] idx = jlst.getSelectedIndices();

        // Display selection when its is selected.
        if(idx.length != 0) {
            for(int i=0; i < idx.length; i++)
                str += names[idx[i]] + " ";
            jlab.setText("Current selection: " + str);
        }
        else // Otherwise, re-prompt.
            jlab.setText("Choose a name");
    }

 */

    public static void main(String[] args) {
        // Create frame on event dispatching thread.
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ListDemoLambda();
            }
        });
    }
}