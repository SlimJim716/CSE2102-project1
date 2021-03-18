import java.util.Arrays;

public class PatientProfDB
{
    private int numPatient = 0;
    private int currentPatientIndex = 0;
    private String fileName;
    private PatientProf[] patientList;

    //unfinished ======================
    public PatientProfDB(String dbname)
    {
        //needs more in this
        this.fileName = dbname;
    }

    //append a new profile at the end of the patientList
    public void insertNewProfile(PatientProf profile)
    {
        this.patientList = Arrays.copyOf(this.patientList, this.numPatient + 1);
        this.numPatient++;
        this.patientList[this.numPatient - 1] = profile;
    }

    //method to search patient list for specific adminID and lastName. If present, return index of profile. If missing, returns -1.
    public int profileIndex(String id, String lname)
    {
        int found = -1;

        for(int i = 0; i < this.numPatient; i++)
        {
            if(this.patientList[i].getAdminID() == id && this.patientList[i].getLastName() == lname)
            {
                found = i;
                break;
            }
        }

        return found;
    }

    //looks for a profile. if present, returns the profile. if not, returns a empty one...?
    public PatientProf findProfile(String id, String lname)
    {
        int index = this.profileIndex(id, lname);
        if(index != -1)
        {
            return this.patientList[index];    
        }
        else
        { //didnt find anything
            //PatientProf temp = new PatientProf();
            //return temp;
            return null;
        }
    }

    //deletes a profile if present. Does not erase the last entry of patientlist entirely, but we decrement the numPatients so it appears we delete it.
    public boolean deleteProfile(String id, String lname)
    {
        int index = this.profileIndex(id, lname);
        if(index == -1) return false;
        else
        {
            for(int i = index; i < this.numPatient; i++)
            {
                this.patientList[i] = this.patientList[i + 1];
            }

            this.patientList[this.numPatient - 1] = null;
            this.numPatient--;
            return false;
        }
    }



    //unfinished =================================================================================

    //finds first instance of a profile with adminID id
    public PatientProf findFirstProfile(String id)
    {
        this.currentPatientIndex = 0;
        for(int i = 0; i < this.numPatient; i++)
        {
            if(this.patientList[i].getAdminID() == id)
            {
                this.currentPatientIndex = 0;
                return this.patientList[i];
            }
        }

        //if nothing found
        return null;
    }

    //finds next instance of a profile with adminID id, assuming we called findFirstProfile already
    public PatientProf findNextProfile(String id)
    {
        for(int i = this.currentPatientIndex; i < this.numPatient; i++)
        {
            if(this.patientList[i].getAdminID() == id)
            {
                this.currentPatientIndex = i;
                return this.patientList[i];
            }
        }

        //if nothing found
        return null;
    }

    //public void writeAllPatientProf()

    //public void initalizeDatabase()

}