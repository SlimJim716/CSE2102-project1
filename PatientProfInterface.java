import java.util.Scanner;
public class PatientProfInterface 
{
    //private String sessionID;


    //public static void PatientProfInterface(String file)

    //present the user with a menu and record their choice
    public static void getUserChoice()
    {
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
        int choice = in.nextInt();

        switch(choice)
        {
            case 0:
                System.out.println("Bye.");
                System.exit(0);
                break;
            case 1:
                createNewPatientProf();
                break;
            case 2:
                deletePatientProf();
                break;
            case 3:
                findPatientProf();
                break;
            case 4:
                updatePatientProf();
                break;
            case 5:
                displayAllPatientProf();
                break;
            case 6:
                writeToDB();
                break;
            case 7:
                initDB();
                break;
        }
    }

    //public static void deletePatientProf()

    //public static void findPatientProf()

    //public static void updatePatientProf()

    //public static void displayPatientProf()

    //public static void displayAllPatientProf()

    //public static void writeToDB()

    //public static void initDB()

    //public static void createNewPatientProf()

    //public static void createNewMedCond()


    
    //============================
    //MAIN BELOW
    //============================

    public static void main(String[] args)
    {
        System.out.println("main");
    }
}
