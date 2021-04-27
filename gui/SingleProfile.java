package gui;
import javax.swing.*;
import java.awt.event.*;
import prog.*;

//class to display a single profile with read only information
public class SingleProfile implements ActionListener
{
    JFrame frame = new JFrame();
    JButton okay = new JButton("Okay");

    public SingleProfile(String adminid, String fname, String lname, String addr, String phone,
                            float cpay, String insur, String patient, String mdcon,
                            String mdph, String allerg, String ill)
    {
        //take each value from the contructor and put it into its own field
        frame.setTitle("Profile: " + lname);

        JLabel adminLabel = new JLabel("Admin ID");
        JTextField adminField = new JTextField();
        adminField.setText(adminid);
        adminField.setEditable(false);
        frame.add(adminLabel);
        frame.add(adminField);

        JLabel lnameLabel = new JLabel("Last Name");
        JTextField lnameField = new JTextField();
        lnameField.setText(lname);
        lnameField.setEditable(false);
        frame.add(lnameLabel);
        frame.add(lnameField);

        JLabel fnameLabel = new JLabel("First Name");
        JTextField fnameField = new JTextField();
        fnameField.setText(fname);
        fnameField.setEditable(false);
        frame.add(fnameLabel);
        frame.add(fnameField);

        JLabel addrLabel = new JLabel("Address");
        JTextField addrField = new JTextField();
        addrField.setText(addr);
        addrField.setEditable(false);
        frame.add(addrLabel);
        frame.add(addrField);

        JLabel phoneLabel = new JLabel("Phone");
        JTextField phoneField = new JTextField();
        phoneField.setText(phone);
        phoneField.setEditable(false);
        frame.add(phoneLabel);
        frame.add(phoneField);

        JLabel cpayLabel = new JLabel("Copay");
        JTextField cpayField = new JTextField();
        cpayField.setText(String.valueOf(cpay));
        cpayField.setEditable(false);
        frame.add(cpayLabel);
        frame.add(cpayField);

        JLabel insurLabel = new JLabel("Insurance Type");
        JTextField insurField = new JTextField();
        insurField.setText(insur);
        insurField.setEditable(false);
        cpayField.setEditable(false);
        frame.add(insurLabel);
        frame.add(insurField);

        JLabel patientLabel = new JLabel("Patient Type");
        JTextField patientField = new JTextField();
        patientField.setText(patient);
        patientField.setEditable(false);
        frame.add(patientLabel);
        frame.add(patientField);

        JLabel mdconLabel = new JLabel("MD Contact");
        JTextField mdconField = new JTextField();
        mdconField.setText(mdcon);
        mdconField.setEditable(false);
        frame.add(mdconLabel);
        frame.add(mdconField);

        JLabel mdphLabel = new JLabel("MD Phone");
        JTextField mdphField = new JTextField();
        mdphField.setText(mdph);
        mdphField.setEditable(false);
        frame.add(mdphLabel);
        frame.add(mdphField);

        JLabel allergLabel = new JLabel("Allergies");
        JTextField allergField = new JTextField();
        allergField.setText(allerg);
        allergField.setEditable(false);
        frame.add(allergLabel);
        frame.add(allergField);

        JLabel illLabel = new JLabel("Illnesses");
        JTextField illField = new JTextField();
        illField.setText(ill);
        illField.setEditable(false);
        frame.add(illLabel);
        frame.add(illField);

        frame.add(okay);
        okay.addActionListener(this);
        
        frame.setSize(300,600);
        frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.PAGE_AXIS));
        frame.setVisible(true);


    }

    public void actionPerformed(ActionEvent e)
    {
        //dispose of window when okay is clicked
        frame.dispose();
    }

}