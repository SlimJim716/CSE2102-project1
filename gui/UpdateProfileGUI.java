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

    public UpdateProfileGUI()
    {
        frame.setTitle("Update Profile");
        JLabel adminLabel = new JLabel("Admin ID");
        JLabel lnameLabel = new JLabel("Last Name");
        JLabel choicesLabel = new JLabel("Update Field");

        frame.add(adminLabel);
        frame.add(adminidBox);
        frame.add(lnameLabel);
        frame.add(lnameBox);
        frame.add(choicesLabel);
        frame.add(fieldsBox);
        frame.add(findButton);

        frame.setSize(300,200);
        frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.PAGE_AXIS));
        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent e)
    {
        //do stuff
    }

}