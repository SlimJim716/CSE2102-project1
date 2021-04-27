package gui;
import javax.swing.*;

import java.awt.event.*;

import prog.*;

//main menu of the GUI
public class MainMenuGUI implements ActionListener {
    
    //add components that need to be accessed
    JFrame frame = new JFrame();
    JRadioButton createPatient = new JRadioButton("Create New Patient");
    JRadioButton deletePatient = new JRadioButton("Delete Patient");
    JRadioButton updatePatient = new JRadioButton("Update Patient Profile");
    JRadioButton findPatient = new JRadioButton("Find/Display Patient Profile");
    JRadioButton displayAll = new JRadioButton("Display All Profiles");
    JButton selectButton = new JButton("Select");

    //groups radio buttons
    ButtonGroup choices = new ButtonGroup();

    public PatientProfInterface intface;

    public MainMenuGUI(PatientProfInterface ui)
    {
        intface = ui;
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


        //method to close the program is this window is closed
        frame.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent windowEvent)
            {
                intface.writeToDB();
                System.exit(0);
            }
        });

        selectButton.addActionListener(this);
    }

    //check for button press
    //based on which radio button is selected, call the corresponding gui window to appear
    public void actionPerformed(ActionEvent e)
    {
        if(createPatient.isSelected())
        {
            CreateProfileGUI create = new CreateProfileGUI(this.intface);
        }

        else if(deletePatient.isSelected())
        {
            DeleteProfileGUI delete = new DeleteProfileGUI(this.intface);
        }

        else if(updatePatient.isSelected())
        {
            UpdateProfileGUI update = new UpdateProfileGUI(this.intface);
        }

        else if(findPatient.isSelected())
        {
            FindProfileGUI find = new FindProfileGUI(this.intface);
        }

        else if(displayAll.isSelected())
        {
            DisplayAllGUI all = new DisplayAllGUI(this.intface);
        }

        else
        {
            System.out.println("oops");
        }
        
    }
    
}
