package D36_Encapsulation.D36_T1_Hospital;
public class Patient {
    private String patientId;
    private String patientName;
    private String dateOfBirth;
    public void displayPatientInfo(){
        System.out.println("PATIENT DETAILS");
        System.out.println("Patient Id: " + patientId);
        System.out.println("Patient name: " + patientName);
        System.out.println("Date of birth: " + dateOfBirth);
    }
    public Patient(String patientId, String patientName, String dateOfBirth) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.dateOfBirth = dateOfBirth;
    }
    public String getPatientId() {
        return patientId;
    }
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }
    public String getPatientName() {
        return patientName;
    }
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
