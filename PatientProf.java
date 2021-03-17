

public class PatientProf
{
    private String adminID = "default";
    private String firstName = "John";
    private String lastName = "Smith";
    private String address = "Nowhere";
    private String phone = "None";
    private float copay = 0;
    private String insuType = "default";
    private String patientType = "default";
    private MedCond medCondInfo;

    public PatientProf()
    {
        this.adminID = "default";
        this.firstName = "default";
        this.lastName = "default";
        this.address = "default";
        this.phone = "default";
        this.copay = 0;
        this.insuType = "default";
        this.patientType = "default";
        this.medCondInfo = new MedCond();
    }
    
    public PatientProf(String adminID, String firstName, String lastName, String address, String phone, float copay, String insuType, String patientType, MedCond medCondInfo)
    {
        this.adminID = adminID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.copay = copay;
        this.insuType = insuType;
        this.patientType = patientType;
        this.medCondInfo = medCondInfo;
        
    }

    public String getAdminID() {
        return this.adminID;
    }

    public void updateAdminID(String adminID) {
        this.adminID = adminID;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void updateFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void updateLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return this.address;
    }

    public void updateAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return this.phone;
    }

    public void updatePhone(String phone) {
        this.phone = phone;
    }

    public float getCopay() {
        return this.copay;
    }

    public void updateCopay(float copay) {
        this.copay = copay;
    }

    public String getInsuType() {
        return this.insuType;
    }

    public void updateInsuType(String insuType) {
        this.insuType = insuType;
    }

    public String getPatientType() {
        return this.patientType;
    }

    public void updatePatientType(String patientType) {
        this.patientType = patientType;
    }

    public MedCond getMedCondInfo(){
        return this.medCondInfo;
    }

    public void updateMedCondInfo(MedCond medCondInfo)
    {
        this.medCondInfo = medCondInfo;
    }

}