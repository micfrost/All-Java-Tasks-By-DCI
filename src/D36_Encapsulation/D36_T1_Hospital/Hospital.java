package D36_Encapsulation.D36_T1_Hospital;

import java.util.ArrayList;

public class Hospital {

    ArrayList<Patient> patientList = new ArrayList<>();

    ArrayList<Doctor> doctorList = new ArrayList<>();

    ArrayList<Appointment> appointmentList = new ArrayList<>();


    public void addPatient(String patientId, String patientName, String dateOfBirth){
        Patient patient = new Patient(patientId, patientName, dateOfBirth);
        patientList.add(patient);
    }

    public void displayPatientList(){
        for (Patient patient:patientList
             ) {
            System.out.println();
            patient.displayPatientInfo();
        }
    }


    public void addDoctor(String doctorId, String doctorName, String specialization){
        Doctor doctor = new Doctor(doctorId, doctorName, specialization);
        doctorList.add(doctor);
    }

    public void displayDoctorList(){
        for (Doctor doctor:doctorList
        ) {
            System.out.println();
            doctor.displayDoctorInfo();
        }
    }


    public void addAppointment(Patient patient, Doctor doctor, String date, String time){
        Appointment appointment = new Appointment(patient, doctor, date, time);
        appointmentList.add(appointment);
    }

    public void displayAppointmentList(){
        for (Appointment appointment:appointmentList
        ) {
            appointment.displayAppointmentInfo();
        }
    }



}
