package D36_Encapsulation.D36_T1_Hospital;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hospital Management System");
        System.out.println("A hospital management system that simulates various operations such as adding patients, assigning doctors, scheduling appointments, and managing medical records.");
        System.out.println(" - - - - - - - ");
        Hospital hospital = new Hospital();
        hospital.addPatient(
                "1234",
                "John Smith",
                "10.04.2004");
        System.out.println(" - - - - - - - ");
        hospital.displayPatientList();


        hospital.addDoctor(
                "9876",
                "Thomas Electrosky",
                "Oculist");
        System.out.println(" - - - - - - - ");
        hospital.displayDoctorList();


        hospital.addAppointment(
                hospital.getPatientList().get(0),
                hospital.getDoctorList().get(0),
                "12.10.2024",
                 "17:00"
                );
        System.out.println(" - - - - - - - ");
        hospital.displayAppointmentList();
        System.out.println(" - - - - - - - ");
    }


}
