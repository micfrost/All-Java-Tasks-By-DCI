package D36_Encapsulation.D36_T1_Hospital;

public class Doctor {

    private String doctorId;
    private String doctorName;
    private String specialization;

    public void displayDoctorInfo(){
        System.out.println("DOCTOR DETAILS");
        System.out.println("Doctor Id: " + doctorId);
        System.out.println("Doctor name: " + doctorName);
        System.out.println("Specialization: " + specialization);
    }


    public Doctor(String doctorId, String doctorName, String specialization) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.specialization = specialization;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
