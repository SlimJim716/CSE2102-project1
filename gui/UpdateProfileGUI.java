package gui;
import javax.swing.*;
import java.awt.event.*;
import prog.*;

public class UpdateProfileGUI implements ActionListener
{
    JFrame frame = new JFrame();
    JTextField adminidBox = new JTextField();
    JTextField lnameBox = new JTextField();
    JButton findButton = new JButton("Find");
    String choices[] = {"Address", "Phone", "Insurance Type", "Copay", "Patient Type"};
    JComboBox<String> fieldsBox = new JComboBox<String>(choices);
    JTextField value = new JTextField();

    public PatientProfInterface intface;

    public UpdateProfileGUI(PatientProfInterface ui)
    {
        intface = ui;
        frame.setTitle("Update Profile");
        JLabel adminLabel = new JLabel("Admin ID");
        JLabel lnameLabel = new JLabel("Last Name");
        JLabel choicesLabel = new JLabel("Update Field");
        JLabel newVal = new JLabel("Enter new value below");

        frame.add(adminLabel);
        frame.add(adminidBox);
        frame.add(lnameLabel);
        frame.add(lnameBox);
        frame.add(choicesLabel);
        frame.add(fieldsBox);
        frame.add(newVal);
        frame.add(value);
        frame.add(findButton);

        frame.setSize(300,250);
        frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.PAGE_AXIS));
        frame.setVisible(true);

        findButton.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e)
    {
        String adminid = adminidBox.getText();
        String lastname = lnameBox.getText();
        String choice = fieldsBox.getSelectedItem().toString();
        String val = value.getText();

        this.intface.updatePatientProf(adminid, lastname, choice, val);
        
        frame.dispose();


    }

}