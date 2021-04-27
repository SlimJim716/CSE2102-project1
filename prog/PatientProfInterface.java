package prog;
import java.util.Scanner;

import gui.ConfirmedGUI;
import gui.ErrorGUI;
public class PatientProfInterface
{

    private String file;
    private PatientProfDB db;

    //init interface with clean db every time
    public PatientProfInterface(String file)
    {
        this.file = file;
        this.db = new PatientProfDB(file);
    }

    public PatientProfDB getDB()
    {
        return this.db;
    }

    //present the user with a menu and record their choice
    /*
    public void getUserChoice()
    {
        System.out.println("==============================");
        System.out.println("");
        System.out.println("Please choose an option below:");
        System.out.println("0. Exit\n" + 
                            "1. Enter a new PatientProf\n" + 
                            "2. Delete A patient by Name and adminID\n" + 
                            "3. Find and display a PatientProf by Name and adminID\n" +
                            "4. PatientProf Modifications\n" + 
                            "5. Display all profiles\n" + 
                            "6. Write to database\n" + 
                            "7. Initalize database\n");
        
        Scanner in = new Scanner(System.in);
        while(!in.hasNextInt())
        {
            System.out.print("Please enter number menu option: ");
            in.nextLine();
        }
        int choice = in.nextInt();
        in.nextLine();

        switch(choice)
        {
            case 0:
                System.out.println("Bye.");
                in.close();
                System.exit(0);
                break;
            case 1:
                this.createNewPatientProf();
                break;
            case 2:
                this.deletePatientProf();
                break;
            case 3:
                this.findPatientProf();
                break;
            case 4:
                this.updatePatientProf();
                break;
            case 5:
                this.displayAllPatientProf();
                break;
            case 6:
                this.writeToDB();
                break;
            case 7:
                this.initDB();
                break;
            default:
                System.out.println("Not a valid option");
                break;
        }
        //in.close();
    }
*/
    //deletes a patient profile
    public boolean deletePatientProf(String adminid, String last)
    {
        System.out.print("Please enter a patient last name: ");
        String patient = last;
        System.out.print("Please enter your adminID: ");
        String id = adminid;

    
        if(this.db.deleteProfile(id, patient))
        {
            return true;
        }
        else
        {
            return false;
        }

        //in.close();
    }

    //finds patient profile specified
    public PatientProf findPatientProf(String adminid, String lname)
    {
        System.out.print("Please enter a patient last name: ");
        String patient = lname;

        System.out.print("Please enter an admin ID: ");
        String id = adminid;

        PatientProf dude = this.db.findProfile(id, patient);
        if(dude == null)
        {
            return null;
        }
        else
        {
            return dude;
        }

        //in.close();
    }

    //allows user to pick attributes to update a patient profile
    public void updatePatientProf(String adminid, String last, String choice, String value)
    {
        System.out.print("Enter a patient last name: ");
        String patient = last;

        System.out.print("Enter admin ID: ");
        String id = adminid;

        PatientProf dude = this.db.findProfile(id, patient);

        if(dude == null)
        {
            ErrorGUI bad = new ErrorGUI();
            return;
            //in.close();
        }

        System.out.println("Patient found. Please choose an option below:");
        
        switch(choice)
        {
            case "Address":
                dude.updateAddress(value);
                break;
            case "Phone":
                dude.updatePhone(value);
                break;
            case "Insurance Type":
                dude.updateInsuType(value);
                break;
            case "Copay":
                dude.updateCopay(Integer.parseInt(value));
                break;
            case "Patient Type":
                dude.updatePatientType(value);
                break;
        }

        ConfirmedGUI confm = new ConfirmedGUI();
        //in.close();
        
    }

    //displays a certain profile based on adminID and last name
    public void displayPatientProf(PatientProf patient)
    {
        System.out.println("AdminID: " + patient.getAdminID());
        System.out.println("First Name: " + patient.getFirstName());
        System.out.println("Last Name: " + patient.getLastName());
        System.out.println("Address: " + patient.getAddress());
        System.out.println("Phone: " + patient.getPhone());
        System.out.println("Copay: : " + patient.getCopay());
        System.out.println("Insu Type: " + patient.getInsuType());
        System.out.println("Patient Type: " + patient.getPatientType());
        System.out.println("Medical Conditions ======== ");
        System.out.println("MD Contact: " + patient.getMedCondInfo().getMdContact());
        System.out.println("MD Phone: " + patient.getMedCondInfo().getMdPhone());
        System.out.println("Alergy Type: " + patient.getMedCondInfo().getAlgType());
        System.out.println("Illness Type: " + patient.getMedCondInfo().getIllType());
    }

    //displays all profiles belonging to adminID specified, one at a time.
    public void displayAllPatientProf()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter an admin ID: ");
        String id = in.nextLine();

        PatientProf cur = this.db.findFirstProfile(id);

        if(cur == null)
        {
            System.out.println("No patients!");
            //in.close();
            return;
        }

        do
        {
            this.displayPatientProf(cur);
            cur = this.db.findNextProfile(id);
            System.out.println("Press any key for next patient");
            in.nextLine();
        } while(cur != null);

        System.out.println("End of patients list...");
        //in.close();
    }

    //saves database
    public void writeToDB()
    {
        System.out.println("Saving to database file: " + this.file);
        this.db.writeAllPatientProf();
    }

    //loads database
    public void initDB()
    {
        System.out.println("Loading database file: " + this.file);
        this.db.initalizeDatabase();
    }

    //prompts user for all info needed to make a patient profile, and adds it to memory.
    public void createNewPatientProf(String admin, String first, String last, String address, String phone, String cpay, String insurance, String patType, String mdcon, String mdph, String allerg, String ill)
    {

        System.out.print("adminID: ");
        String adminid = admin;

        System.out.print("First Name: ");
        String fname = first;

        System.out.print("Last Name: ");
        String lname = last;

        System.out.print("Address: ");
        String addr = address;

        System.out.print("Phone: ");
        String phn = phone;

        System.out.print("Copay: ");
        int pay = Integer.parseInt(cpay);

        System.out.print("Insu Type: ");
        String insu = insurance;

        System.out.print("Patient Type: ");
        String type = patType;

        MedCond meds = this.createNewMedCond(mdcon, mdph, allerg, ill);

        PatientProf newPatient = new PatientProf(adminid, fname, lname, addr, phn, pay, insu, type, meds);

        this.db.insertNewProfile(newPatient);

        System.out.println("Patient Added!");

        //in.close();

    }

    //asks user for all info needed to make a new med condition, adds it to a patient profile.
    public MedCond createNewMedCond(String mdcon, String mdphn, String allerg, String illness)
    {
        System.out.println("Please enter patient Medical condition information");
    
        System.out.print("MD Contact: ");
        String contact = mdcon;
        
        System.out.print("MD Phone: ");
        String mdphone = mdphn;

        System.out.print("Allergy Type: ");
        String alg = allerg;

        System.out.print("Illness Type: ");
        String ill = illness;

        //in.close();

        return new MedCond(contact, mdphone, alg, ill);
    }
}
