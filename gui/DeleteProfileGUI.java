package gui;
import javax.swing.*;
import java.awt.event.*;

import prog.*;

public class DeleteProfileGUI implements ActionListener
{
    JFrame frame = new JFrame();
    JTextField adminidBox = new JTextField();
    JTextField lnameBox = new JTextField();
    JButton deleteButton = new JButton("Delete");

    public DeleteProfileGUI()
    {
        frame.setTitle("Delete Profile");
        JLabel adminLabel = new JLabel("Admin ID");
        JLabel lnameLabel = new JLabel("Last Name");

        frame.add(adminLabel);
        frame.add(adminidBox);
        frame.add(lnameLabel);
        frame.add(lnameBox);
        frame.add(deleteButton);

        frame.setSize(300,150);
        frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.PAGE_AXIS));
        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent e)
    {
        //do stuff
    }
}