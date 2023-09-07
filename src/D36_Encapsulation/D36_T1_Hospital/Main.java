package D36_Encapsulation.D36_T1_Hospital;

public class Main {

    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        hospital.addPatient(
                "1234",
                "John Smith",
                "10.04.2004");
        hospital.displayPatientList();

        hospital.addDoctor(
                "9876",
                "Thomas Electrosky",
                "20.14.19774");

        hospital.displayDoctorList();


        hospital.addAppointment(
                hospital.patientList.get(0),
                hospital.doctorList.get(0)
                , "12.10.2024", "17:00"
                );

        hospital.displayAppointmentList();
    }


}
