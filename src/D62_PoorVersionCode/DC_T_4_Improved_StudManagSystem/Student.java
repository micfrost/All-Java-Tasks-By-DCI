package D62_PoorVersionCode.DC_T_4_Improved_StudManagSystem;

import java.time.LocalDate;

public class Student {
    private String name;
    private LocalDate dateOfBirth;
    private int studentId;
    private Courses courses;

    public Student(String name, LocalDate dateOfBirth, int studentId) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.studentId = studentId;
        this.courses = new Courses();
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getStudentId() {
        return studentId;
    }

    public Courses getCourses() {
        return courses;
    }
}
