public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Starting...");

        String dbPath = "C:/Users/Jimmy/Desktop/java_database.txt";
        PatientProfInterface face = new PatientProfInterface(dbPath);

        while(true)
        {
            face.getUserChoice();
        }
           
    }
}