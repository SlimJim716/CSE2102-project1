package gui;
import javax.swing.*;
import java.awt.event.*;

import prog.*;

public class MainMenuGUI implements ActionListener {
    JRadioButton createPatient = new JRadioButton("Create New Patient");
    JRadioButton deletePatient = new JRadioButton("Delete Patient");
    JRadioButton updatePatient = new JRadioButton("Update Patient Profile");
    JRadioButton displayAll = new JRadioButton("Find/Display Patient Profile");
    JButton selectOption = new JButton("Select");

    ButtonGroup choices = new ButtonGroup();

    public MainMenuGUI()
    {
        choices.add(createPatient);
        choices.add(deletePatient);
        choices.add(updatePatient);
        choices.add(displayAll);

        


    }
    
}
