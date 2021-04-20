package prog;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Starting...");

        String dbPath = "C:/Users/Jimmy/Desktop/java_database.txt";
        PatientProfInterfaceCli face = new PatientProfInterfaceCli(dbPath);

        while(true)
        {
            face.getUserChoice();
        }
           
    }
}