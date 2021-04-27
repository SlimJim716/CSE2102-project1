package gui;
import javax.swing.*;
import java.awt.event.*;

import prog.*;

//class to delete a profile with gui
public class DeleteProfileGUI implements ActionListener
{
    JFrame frame = new JFrame();
    JTextField adminidBox = new JTextField();
    JTextField lnameBox = new JTextField();
    JButton deleteButton = new JButton("Delete");

    public PatientProfInterface intface;

    public DeleteProfileGUI(PatientProfInterface ui)
    {
        intface = ui;
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

        deleteButton.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e)
    {
        //if submit button is pressed, check to see if adminid and last name match a record and try to delete if so
        //if so, display confirmed gui
        //if not, display error
        if(this.intface.deletePatientProf(adminidBox.getText(), lnameBox.getText()))
        {
            ConfirmedGUI deleted = new ConfirmedGUI();
            frame.dispose();
        }
        else
        {
            ErrorGUI no = new ErrorGUI();
            frame.dispose();
        }
    }
}