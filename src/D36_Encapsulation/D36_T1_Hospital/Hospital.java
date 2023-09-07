package D36_Encapsulation.D36_T1_Hospital;

import java.util.ArrayList;

public class Hospital {

    private ArrayList<Patient> patientList;

    private ArrayList<Doctor> doctorList;

    private ArrayList<Appointment> appointmentList;

    public Hospital() {
        patientList = new ArrayList<>();
        doctorList = new ArrayList<>();
        appointmentList = new ArrayList<>();
    }

    public boolean addPatient(String patientId, String patientName, String dateOfBirth) {

        for (Patient patient : patientList) {
            if (patient.getPatientId().equals(patientId)) {
                return false;
            }
        }
        Patient patient = new Patient(patientId, patientName, dateOfBirth);
        patientList.add(patient);
        return true;
    }

    public void displayPatientList() {
        for (Patient patient : patientList
        ) {
            patient.displayPatientInfo();
        }
    }


    public boolean addDoctor(String doctorId, String doctorName, String specialization) {
        for (Doctor doctor : doctorList) {
            if (doctor.getDoctorId().equals(doctorId)) {
                return false;
            }
        }
        Doctor doctor = new Doctor(doctorId, doctorName, specialization);
        doctorList.add(doctor);
        return true;
    }

    public void displayDoctorList() {
        for (Doctor doctor : doctorList
        ) {
            doctor.displayDoctorInfo();
        }
    }


    public void addAppointment(Patient patient, Doctor doctor, String date, String time) {
        Appointment appointment = new Appointment(patient, doctor, date, time);
        appointmentList.add(appointment);
    }

    public void displayAppointmentList() {
        for (Appointment appointment : appointmentList
        ) {
            appointment.displayAppointmentInfo();
        }
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }

    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
    }
}
