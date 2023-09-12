package D38_Static_Keyword.D38_CA1_Static_Keyword;

class Student {
    int id;
    final String name;
    static String university = "RIT";

    static void changeUni() {
        university="Cambridge";
    }

    //    Constructor to initialize the variables
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name + " " + university);
    }
}


public class Main {
    public static void main(String[] args) {

//  final make names constant
        Student student1 = new Student(111, "Alice");
        Student student2 = new Student(222, "Joe");
        Student student3 = new Student(333, "Diana");

        System.out.println("- - -");
        System.out.println("STUDENTS");
        student1.display();
        student2.display();
        student3.display();

//   It is possible to change a value.
        System.out.println("- - -");
        System.out.println("STUDENTS CHANGED VARIABLE");
        Student.university = "EU";
        student1.display();
        student2.display();
        student3.display();

        //  changing by using a method
        System.out.println("- - -");
        System.out.println("STUDENTS CHANGED BY USING A METHOD");
   Student.changeUni();
        student1.display();
        student2.display();
        student3.display();

    }
}
