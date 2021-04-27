package gui;
import javax.swing.*;
import java.awt.event.*;

import prog.*;

public class ConfirmedGUI implements ActionListener
{
    JFrame frame = new JFrame();
    JButton okayButton = new JButton("Okay");
    JLabel okaylabel = new JLabel("Confirmed");

    public ConfirmedGUI()
    {
        frame.setTitle("Confirmed");

        frame.add(okaylabel);
        frame.add(okayButton);

        frame.setSize(200,100);
        frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.PAGE_AXIS));
        frame.setVisible(true);

        okayButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        frame.dispose();
    }

}