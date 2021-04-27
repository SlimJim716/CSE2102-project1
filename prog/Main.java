package prog;
import gui.*;
//import gui.InitalizeGUI;
//import gui.MainMenuGUI;

public class Main
{
    public static void main(String[] args)
    {
        if(args.length != 2)
        {
            System.out.println("Usage is ./Main <cli || gui> <path/to/db/file/>");
            System.exit(0);  
        }
        else if(args[0].equals("cli"))
        {

            System.out.println("Starting...");

            String dbPath = args[1];
            PatientProfInterfaceCli face = new PatientProfInterfaceCli(dbPath);

            while(true)
            {
                face.getUserChoice();
            }
        }

        else if(args[0].equals("gui"))
        {
            //do gui stuff here
            System.out.println("the gui should start");
            String dbPath = args[1];
            //System.out.println(dbPath);
            PatientProfInterface face = new PatientProfInterface(dbPath);
            face.initDB();
            MainMenuGUI menu = new MainMenuGUI(face);
        }

        else
        {
            System.out.println("Usage is ./Main <cli || gui> <path/to/db/file/>");
            System.exit(0);  
        }
           
    }
}