package gui;
import javax.swing.*;
import java.awt.event.*;

import prog.*;

public class InitalizeGUI implements ActionListener{

    JFrame frame = new JFrame();
    JTextField path_field = new JTextField();

    String path;

    public InitalizeGUI()
    {
        //set title
        frame.setTitle("IPS");

        //make label for path and add bounds
        JLabel path_label = new JLabel("Enter DB path");
        path_label.setBounds(100,40,100,50);

        //create enter button
        JButton enter_button = new JButton("Enter");
        enter_button.setBounds(100, 120, 80, 20);

        //set bounds of text field
        path_field.setBounds(100, 80, 80, 20);

        //add everything to frame
        frame.add(path_label);
        frame.add(enter_button);
        frame.add(path_field);

        frame.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent windowEvent)
            {
                System.exit(0);
            }
        });

        

        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);

        enter_button.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e)
    {
        //do stuff
    }

    
}
