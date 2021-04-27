package gui;
import javax.swing.*;
import java.awt.event.*;
import prog.*;

public class AllProfGUI implements ActionListener
{
    JFrame frame = new JFrame();
    JButton next = new JButton("Next");
    PatientProfInterface intface;
    PatientProf pro;

    public AllProfGUI(PatientProfInterface ui, PatientProf dude)
    {
        if(dude == null)
        {
            return;
        }
        frame.setTitle("Profile: " + dude.getLastName());
        intface = ui;
        pro = dude;

        String adminid = dude.getAdminID();
        JLabel adminLabel = new JLabel("Admin ID");
        JTextField adminField = new JTextField();
        adminField.setText(adminid);
        adminField.setEditable(false);
        frame.add(adminLabel);
        frame.add(adminField);

        String lname = dude.getLastName();
        JLabel lnameLabel = new JLabel("Last Name");
        JTextField lnameField = new JTextField();
        lnameField.setText(lname);
        lnameField.setEditable(false);
        frame.add(lnameLabel);
        frame.add(lnameField);

        String fname = dude.getFirstName();
        JLabel fnameLabel = new JLabel("First Name");
        JTextField fnameField = new JTextField();
        fnameField.setText(fname);
        fnameField.setEditable(false);
        frame.add(fnameLabel);
        frame.add(fnameField);

        String addr = dude.getAddress();
        JLabel addrLabel = new JLabel("Address");
        JTextField addrField = new JTextField();
        addrField.setText(addr);
        addrField.setEditable(false);
        frame.add(addrLabel);
        frame.add(addrField);

        String phone = dude.getPhone();
        JLabel phoneLabel = new JLabel("Phone");
        JTextField phoneField = new JTextField();
        phoneField.setText(phone);
        phoneField.setEditable(false);
        frame.add(phoneLabel);
        frame.add(phoneField);

        float cpay = dude.getCopay();
        JLabel cpayLabel = new JLabel("Copay");
        JTextField cpayField = new JTextField();
        cpayField.setText(String.valueOf(cpay));
        cpayField.setEditable(false);
        frame.add(cpayLabel);
        frame.add(cpayField);

        String insur = dude.getInsuType();
        JLabel insurLabel = new JLabel("Insurance Type");
        JTextField insurField = new JTextField();
        insurField.setText(insur);
        insurField.setEditable(false);
        cpayField.setEditable(false);
        frame.add(insurLabel);
        frame.add(insurField);

        String patient = dude.getPatientType();
        JLabel patientLabel = new JLabel("Patient Type");
        JTextField patientField = new JTextField();
        patientField.setText(patient);
        patientField.setEditable(false);
        frame.add(patientLabel);
        frame.add(patientField);

        String mdcon = dude.getMedCondInfo().getMdContact();
        JLabel mdconLabel = new JLabel("MD Contact");
        JTextField mdconField = new JTextField();
        mdconField.setText(mdcon);
        mdconField.setEditable(false);
        frame.add(mdconLabel);
        frame.add(mdconField);

        String mdph = dude.getMedCondInfo().getMdPhone();
        JLabel mdphLabel = new JLabel("MD Phone");
        JTextField mdphField = new JTextField();
        mdphField.setText(mdph);
        mdphField.setEditable(false);
        frame.add(mdphLabel);
        frame.add(mdphField);

        String allerg = dude.getMedCondInfo().getAlgType();
        JLabel allergLabel = new JLabel("Allergies");
        JTextField allergField = new JTextField();
        allergField.setText(allerg);
        allergField.setEditable(false);
        frame.add(allergLabel);
        frame.add(allergField);

        String ill = dude.getMedCondInfo().getIllType();
        JLabel illLabel = new JLabel("Illnesses");
        JTextField illField = new JTextField();
        illField.setText(ill);
        illField.setEditable(false);
        frame.add(illLabel);
        frame.add(illField);

        frame.add(next);
        next.addActionListener(this);
        
        frame.setSize(300,600);
        frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.PAGE_AXIS));
        frame.setVisible(true);


    }

    public void actionPerformed(ActionEvent e)
    {
        AllProfGUI nxt = new AllProfGUI(this.intface, this.intface.getDB().findNextProfile(this.pro.getAdminID()));
        frame.dispose();
    }

}