package D34_LinkedHash_AND_TreeMap.D34_T1_TreeMap_StudentGradeTracker;

public class Student {

    //Instance Variables
    String studentName;
    Double gradeMath;
    Double gradeIT;
    Double gradeEnglish;
    Double aveGrades;

    // Parameters
    public Student(
            String studentName,
            Double gradeMath,
            Double gradeIT,
            Double gradeEnglish,
            Double aveGrades) {

        this.studentName = studentName;
        this.gradeMath = gradeMath;
        this.gradeIT = gradeIT;
        this.gradeEnglish = gradeEnglish;
        this.aveGrades=aveGrades;


    }

//    public double averageGrade() {
//        double ave = (gradeMath + gradeEnglish + gradeIT) / 3;
//        return ave;
//    }

    @Override
    public String toString() {
        return " , Name= " + studentName+ "\t" +
                ", Grade Math= " + gradeMath+ "\t" +
                ", Grade IT= " + gradeIT+ "\t" +
                ", Grade English= " + gradeEnglish+ "\t" +
                ", average grade: " + aveGrades;
    }
}
