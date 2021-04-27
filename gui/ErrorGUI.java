package gui;
import javax.swing.*;
import java.awt.event.*;

import prog.*;

public class ErrorGUI implements ActionListener
{
    JFrame frame = new JFrame();
    JButton okayButton = new JButton("Okay");
    JLabel oopslabel = new JLabel("Action could not be performed.");
    JLabel ouchlabel = new JLabel("Either patient does not exist, or you do not have privledge to perform this action");

    public ErrorGUI()
    {
        frame.setTitle("Confirmed");

        frame.add(oopslabel);
        frame.add(ouchlabel);
        frame.add(okayButton);

        frame.setSize(500,100);
        frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.PAGE_AXIS));
        frame.setVisible(true);

        okayButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        frame.dispose();
    }

}