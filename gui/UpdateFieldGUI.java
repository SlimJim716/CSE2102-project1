package gui;
import javax.swing.*;
import java.awt.event.*;
import prog.*;

public class UpdateFieldGUI implements ActionListener
{
    JFrame frame = new JFrame();
    JTextField newValue = new JTextField();
    JButton submitButton = new JButton("Submit");

    public PatientProfInterface intface;
    String fieldpicked;

    public UpdateFieldGUI(PatientProfInterface ui, String adminid, String lastname, String field)
    {
       intface = ui;
       fieldpicked = field;
       frame.setTitle("Update Field");

       JLabel adminlabel = new JLabel("Admin id: " + adminid);
       JLabel lastnamelabel = new JLabel("Last Name: " + lastname);
       JLabel valuelabel = new JLabel("New" + field);

       frame.add(adminlabel);
       frame.add(lastnamelabel);
       frame.add(valuelabel);
       frame.add(newValue);
       frame.add(submitButton);

       frame.setSize(300,300);
       frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.PAGE_AXIS));
       frame.setVisible(true);

       submitButton.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e)
    {
        
    }
}