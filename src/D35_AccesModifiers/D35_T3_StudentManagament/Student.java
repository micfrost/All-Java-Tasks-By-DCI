package D35_AccesModifiers.D35_T3_StudentManagament;

public class Student {
    protected String name;
    protected int studentID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
}
