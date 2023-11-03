package D62_PoorVersionCode.DC_T_4_StudManagSystem;

import java.util.ArrayList;

//          Instructions:
//        - Enhance the code by adding proper data validation for student information.
//        -	Implement the ability to remove students from the system.
//        -	Add user input for student management operations.
//        -	Extend the student class to include additional details like student ID, courses, and contact information.
//        -	Implement a search feature to find students by name, age, or other criteria.
//        -	Create a grading system or course enrollment system.
//        -	Add the ability to export student data to a file and import it from a file. (Optional)
//        -	Add error handling to gracefully handle exceptional cases.
//        -	Consider using data structures and algorithms to make the code more efficient and scalable.
//        -	Document the code and provide comments for clarity.

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class StudentManagementSystem {

    ArrayList<Student> students = new ArrayList<Student>();

    public void addStudent(String name, int age) {
        Student student = new Student(name, age);
        students.add(student);
        System.out.println("Student added successfully!");
    }
    public void listStudents() {
        System.out.println("Student List:");
        for (Student student : students) {
            System.out.println("Name: " + student.name);
            System.out.println("Age: " + student.age);
            System.out.println();
        }
    }

    public static void main(String[] args) {

        StudentManagementSystem sms = new StudentManagementSystem();

        sms.addStudent("Alice", 20);
        sms.addStudent("Bob", 22);
        sms.listStudents();
    }
}