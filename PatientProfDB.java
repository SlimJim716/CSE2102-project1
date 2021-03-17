import java.util.Arrays;

public class PatientProfDB
{
    private int numPatient = 0;
    private int currentPatientIndex = 0;
    private String fileName;
    private PatientProf[] patientList;

    public PatientProfDB(String dbname)
    {
        //needs more in this
        this.fileName = dbname;
    }

    public void insertNewProfile(PatientProf profile)
    {
        this.patientList = Arrays.copyOf(this.patientList, this.numPatient + 1);
        this.numPatient++;
        this.patientList[this.numPatient - 1] = profile;
    }

    public PatientProf findProfile(String id, String lname)
    {
        PatientProf found = new PatientProf();
        for(int i = 0; i < this.numPatient; i++)
        {
            if(this.patientList[i].getAdminID() == id && this.patientList[i].getLastName() == lname)
            {
                found = this.patientList[i];
                break;
            }
        }

        return found;
    }




}