package gui;
import javax.swing.*;
import java.awt.event.*;

import prog.*;

public class MainMenuGUI implements ActionListener {
    JFrame frame = new JFrame();
    JRadioButton createPatient = new JRadioButton("Create New Patient");
    JRadioButton deletePatient = new JRadioButton("Delete Patient");
    JRadioButton updatePatient = new JRadioButton("Update Patient Profile");
    JRadioButton findPatient = new JRadioButton("Find/Display Patient Profile");
    JRadioButton displayAll = new JRadioButton("Display All Profiles");
    JButton selectButton = new JButton("Select");


    ButtonGroup choices = new ButtonGroup();

    public MainMenuGUI()
    {
        choices.add(createPatient);
        choices.add(deletePatient);
        choices.add(updatePatient);
        choices.add(displayAll);
        choices.add(findPatient);

        frame.setTitle("Main Menu");
        createPatient.setBounds(50,50,150,20);
        deletePatient.setBounds(50,70,150,20);
        updatePatient.setBounds(50,90,150,20);
        findPatient.setBounds(50,110,180,20);
        displayAll.setBounds(50,130,150,20);
        selectButton.setBounds(50,160,150,50);     
        
        frame.add(createPatient);
        frame.add(deletePatient);
        frame.add(updatePatient);
        frame.add(displayAll);
        frame.add(selectButton);
        frame.add(findPatient);

        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent windowEvent)
            {
                System.exit(0);
            }
        });


    }

    public void actionPerformed(ActionEvent e)
    {
        
    }
    
}
