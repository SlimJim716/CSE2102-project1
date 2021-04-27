package gui;
import javax.swing.*;
import java.awt.event.*;

import prog.*;

public class CreateProfileGUI implements ActionListener
{
    JFrame frame = new JFrame();
    JTextField adminidbox = new JTextField();
    JTextField firstnamebox = new JTextField();
    JTextField lastnamebox = new JTextField();
    JTextField addressbox = new JTextField();
    JTextField phonebox = new JTextField();
    JTextField copaybox = new JTextField();

    String insur[] = {"Private", "Government"};
    JComboBox<String> insurbox = new JComboBox<String>(insur);

    String patientType[] = {"Pediatric", "Adult", "Senior"};
    JComboBox<String> patientTypeBox = new JComboBox<String>(patientType);

    JTextField contactBox = new JTextField();
    JTextField mdphoneBox = new JTextField();

    String allergies[] = {"None", "Food", "Medication", "Other"};
    JComboBox<String> allergiesbox = new JComboBox<String>(allergies);

    String illnesses[] = {"None", "CHD", "Diabetes", "Asthma", "Other"};
    JComboBox<String> illnessbox = new JComboBox<String>(illnesses);

    JButton submitButton = new JButton("Submit");

    public PatientProfInterface intface;

    public CreateProfileGUI(PatientProfInterface ui)
    {
        intface = ui;
        frame.setTitle("Create Profile");

        //add labels

        JLabel adminLabel = new JLabel("Admin ID");
        JLabel fnameLabel = new JLabel("First Name");
        JLabel lnameLabel = new JLabel("Last Name");
        JLabel addressLabel = new JLabel("Address");
        JLabel phoneLabel = new JLabel("Phone");
        JLabel copayLabel = new JLabel("Copay");
        JLabel insurLabel = new JLabel("Insur Type");
        JLabel patientLabel = new JLabel("Patient Type");
        JLabel mdcontactLabel = new JLabel("MD Contact");
        JLabel mdphoneLabel = new JLabel("MD Phone");
        JLabel allergiesLabel = new JLabel("Allergies");
        JLabel illnessLabel = new JLabel("Illnesses");
        

        //set bounds?

        //add everything
        frame.add(adminLabel);
        frame.add(adminidbox);

        frame.add(fnameLabel);
        frame.add(firstnamebox);

        frame.add(lnameLabel);
        frame.add(lastnamebox);

        frame.add(addressLabel);
        frame.add(addressbox);

        frame.add(phoneLabel);
        frame.add(phonebox);

        frame.add(copayLabel);
        frame.add(copaybox);

        frame.add(insurLabel);
        frame.add(insurbox);

        frame.add(patientLabel);
        frame.add(patientTypeBox);

        frame.add(mdcontactLabel);
        frame.add(contactBox);

        frame.add(mdphoneLabel);
        frame.add(mdphoneBox);

        frame.add(allergiesLabel);
        frame.add(allergiesbox);

        frame.add(illnessLabel);
        frame.add(illnessbox);

        frame.add(submitButton);

        frame.setSize(300,600);
        frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.PAGE_AXIS));
        frame.setVisible(true);

        submitButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        //wait for button press
        //when pressed, get all information collected in the jframe and call createnewpatient using that information and display confirmed gui
        this.intface.createNewPatientProf(adminidbox.getText(), firstnamebox.getText(), lastnamebox.getText(), addressbox.getText(), phonebox.getText(), copaybox.getText(), insurbox.getSelectedItem().toString(), patientTypeBox.getSelectedItem().toString(), contactBox.getText(), mdphoneBox.getText(), allergiesbox.getSelectedItem().toString(), illnessbox.getSelectedItem().toString());
        System.out.println("added");
        ConfirmedGUI confirmed = new ConfirmedGUI();
        frame.dispose();
        
    }


}