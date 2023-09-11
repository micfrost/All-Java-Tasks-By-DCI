package D37_Interfaces.D37_T2_OnlineCourses;

public class Main {
    public static void main(String[] args) {

        System.out.println("Online Courses");

        CourseManager courseManager = new CourseManager();

        OnlineCourse programmingCourse = new ProgrammingCourse(
                "The Best programming course",
                "Tim Burton");
        OnlineCourse mathCourse = new MathCourse(
                "The Only math course you need",
                "Bob Kayasky");

        courseManager.addCourse(programmingCourse);
        courseManager.addCourse(mathCourse);

        courseManager.enrollStudentToCourse("John Mankiet", programmingCourse);
        courseManager.enrollStudentToCourse("Bob Bobowic", programmingCourse);

        courseManager.enrollStudentToCourse("Ricky Matrio", mathCourse);
        courseManager.enrollStudentToCourse("Timossy Leppose", mathCourse);courseManager.enrollStudentToCourse("Sim ZttgZ", mathCourse);

        courseManager.displayAllCourseDetail();

    }
}
