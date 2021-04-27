package gui;
import javax.swing.*;
import java.awt.event.*;

import prog.*;

public class DisplayAllGUI implements ActionListener
{
    JFrame frame = new JFrame();
    JTextField adminidBox = new JTextField();
    JButton goButton = new JButton("GO");

    public PatientProfInterface intface;

    public DisplayAllGUI(PatientProfInterface ui)
    {
        intface = ui;
        frame.setTitle("Find All Profiles");
        JLabel adminLabel = new JLabel("Admin ID");

        frame.add(adminLabel);
        frame.add(adminidBox);
        frame.add(goButton);

        frame.setSize(300,110);
        frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.PAGE_AXIS));
        frame.setVisible(true);

        goButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        PatientProf pat = this.intface.getDB().findFirstProfile(adminidBox.getText());
        if(pat == null)
        {
            JDialog no = new JDialog(frame, "No Patients");
            JLabel label = new JLabel("There are no patients under this adminID");
            no.setModal(true);
            no.add(label);
            no.setSize(300,100);
            no.setVisible(true);
            frame.dispose();
        }
        else
        {
            new AllProfGUI(this.intface, pat);
            frame.dispose(); 
        }
    }
}