package gui;
import javax.swing.*;
import java.awt.event.*;
import prog.*;

public class FindProfileGUI implements ActionListener
{
    JFrame frame = new JFrame();
    JTextField adminidBox = new JTextField();
    JTextField lnameBox = new JTextField();
    JButton goButton = new JButton("GO");

    public PatientProfInterface intface;

    public FindProfileGUI(PatientProfInterface ui)
    {
        intface = ui;
        frame.setTitle("Find Profile");
        JLabel adminLabel = new JLabel("Admin ID");
        JLabel lnameLabel = new JLabel("Last Name");

        frame.add(adminLabel);
        frame.add(adminidBox);
        frame.add(lnameLabel);
        frame.add(lnameBox);
        frame.add(goButton);

        frame.setSize(300,150);
        frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.PAGE_AXIS));
        frame.setVisible(true);

        goButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        PatientProf man = this.intface.findPatientProf(adminidBox.getText(), lnameBox.getText());
        if(man != null)
        {
            SingleProfile proffile = new SingleProfile(man.getAdminID(), man.getFirstName(), man.getLastName(), man.getAddress(), man.getPhone(), man.getCopay(), man.getInsuType(), man.getPatientType(), man.getMedCondInfo().getMdContact(), man.getMedCondInfo().getMdPhone(), man.getMedCondInfo().getAlgType(), man.getMedCondInfo().getIllType());
        }

        else
        {
            ErrorGUI bad = new ErrorGUI();
        }

        frame.dispose();

    }

}