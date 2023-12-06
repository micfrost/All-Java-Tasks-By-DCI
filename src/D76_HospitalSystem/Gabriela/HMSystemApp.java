package D76_HospitalSystem.Gabriela;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Patient {
    private static int idCounter = 1;
    private int patientId;
    private String name;
    private int age;
    private String gender;
    private String contactInfo;

    public Patient(String name, int age, String gender, String contactInfo) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.contactInfo = contactInfo;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getContactInfo() {
        return contactInfo;
    }
}

class Doctor {
    private static int idCounter = 1;
    private int doctorId;
    private String name;
    private List<String>availableTimeSlots;

    public Doctor(int doctorId, String name, List<String> availableTimeSlots) {
        this.doctorId = doctorId;
        this.name = name;
        this.availableTimeSlots = availableTimeSlots;

        availableTimeSlots.add("9:00 AM - 11:00 AM");
        availableTimeSlots.add("2:00 PM - 4:00 PM");
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public String getName() {
        return name;
    }

    public List<String> getAvailableTimeSlots() {
        return availableTimeSlots;
    }

    public void displayAvailableTimeSlots() {
        System.out.println("Available Time Slots for Dr. " + name + " : ");
        for(String timeSlot: availableTimeSlots) {
            System.out.println(timeSlot);
        }
    }
}

class Appointment {
    private Patient patient;
    private Doctor doctor;
    private String timeSlot;

    public Appointment(Patient patient, Doctor doctor, String timeSlot) {
        this.patient = patient;
        this.doctor = doctor;
        this.timeSlot = timeSlot;
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public String getTimeSlot() {
        return timeSlot;
    }
}

class Hospital {
    private Map<Integer, Patient> patients;
    private Map<Integer, Doctor> doctors;
    private List<Appointment> appointments;

    public Hospital() {
        this.patients = new HashMap<>();
        this.doctors = new HashMap<>();
        this.appointments= new ArrayList<>();
    }

    public Map<Integer, Doctor> getDoctors() {
        return doctors;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void registerPatient(String name, int age, String gender, String contactInfo) {
        Patient patient = new Patient(name, age, gender, contactInfo);
        patients.put(patient.getPatientId(), patient);
        System.out.println("Patient registered successfully. Patient ID: " + patient.getPatientId());
    }

    public boolean scheduleAppointment(int patientId, int doctorId, String timeSlot) {
        Patient patient = patients.get(patientId);
        Doctor doctor = doctors.get(doctorId);

        if (patient != null && doctor != null && doctor.getAvailableTimeSlots().contains(timeSlot)) {
            Appointment appointment = new Appointment(patient, doctor, timeSlot);
            appointments.add(appointment);
            doctor.getAvailableTimeSlots().remove(timeSlot);
            System.out.println("Appointment scheduled successfully.");
            return true;
        } else {
            System.out.println("Error scheduling appointment. Please check patient and doctor ID.");
            return false;
        }
    }

    public void displayPatientInformation(int patientId) {
        Patient patient = patients.get(patientId);
        if (patient != null) {
            System.out.println("Patient Information: ");
            System.out.println("ID: " + patient.getPatientId());
            System.out.println("Name: " + patient.getName());
            System.out.println("Age: " + patient.getAge());
            System.out.println("Gender: " + patient.getGender());
            System.out.println("Contact Info: " + patient.getContactInfo());
        } else {
            System.out.println("Patient not found. Please check ID. ");
        }
    }

    public void displayDoctorInformation(int doctorId) {
        Doctor doctor = doctors.get(doctorId);
        if(doctor != null) {
            System.out.println("Doctor Information: ");
            System.out.println("ID: " + doctor.getDoctorId());
            System.out.println("Name: " + doctor.getName());
            System.out.println("Available Time Slots: ");
            doctor.displayAvailableTimeSlots();
        } else {
            System.out.println("Doctor not found. Check the ID. ");
        }
    }

    public void displayAppointments() {
        System.out.println("Appointments: ");
        for(Appointment appointment : appointments) {
            System.out.println("Patient ID " + appointment.getPatient());
            System.out.println("Doctor ID " + appointment.getDoctor());
            System.out.println("Time Slot: " + appointment.getTimeSlot());
            System.out.println("------------------");
        }
    }
}
public class HMSystemApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hospital hospital = new Hospital();

        while (true) {
            System.out.println("Hospital Management System ");
            System.out.println("1. Register Patient ");
            System.out.println("2. Schedule Appointment ");
            System.out.println("3. Display patient information ");
            System.out.println("4. Display doctor information ");
            System.out.println("5. Display Appointments");
            System.out.println("6. Exit");

            System.out.println("Enter your choice");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    //Registration patient
                    System.out.println("Enter patient name: ");
                    String name = scanner.next();
                    System.out.println("Enter patient age: ");
                    int age = scanner.nextInt();
                    System.out.println("Enter patient gender: ");
                    String gender = scanner.next();
                    System.out.println("Enter patient contact information");
                    String contactInfo = scanner.next();

                    hospital.registerPatient(name, age, gender, contactInfo);
                    break;

                case 2:
                    //Schedule Appointments
                    System.out.println("Enter patient ID: ");
                    int patientId = scanner.nextInt();
                    System.out.println("Enter doctor ID: ");
                    int doctorId = scanner.nextInt();
                    System.out.println("Enter preferred time slot: ");
                    String timeSlot = scanner.next();

                    if (hospital.scheduleAppointment(patientId, doctorId, timeSlot)) {
                        System.out.println("Appointment schedule successfully.");
                    } else {
                        System.out.println("Error scheduling appointment. Please check IDs.");
                    }
                    break;

                case 3:
                    //Display Patient Information
                    System.out.println("Enter patient ID: ");
                    patientId = scanner.nextInt();
                    hospital.displayPatientInformation(patientId);
                    break;

                case 4:
                    //Display Doctor Information
                    System.out.println("Enter doctor ID: ");
                    doctorId = scanner.nextInt();
                    hospital.displayDoctorInformation(doctorId);
                    break;

                case 5:
                    //Display Appointments
                    hospital.displayAppointments();
                    break;

                case 6:
                    //Exit
                    System.out.println("Existing Hospital Management System. Goodbye! ");
                    System.exit(0);
                    scanner.close();
                    break;

                default:
                    System.out.println("Invalid choice. Please try again. ");
            }
        }
    }
}