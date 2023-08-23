package D27_MultidimensionalArrays.D27_T1_OneDimens_Array_ExamScore;

public class StudentExamAnalyzer {



    public void run(int[] array) {
        title();

        double aveStud = calculateAverage(array);
        System.out.printf("The average score of the students is: %.2f.\n", aveStud);

        int highestScoreStudent = findHighestScore(array);
        System.out.printf("The highest score is: %d.\n", highestScoreStudent);

        int numberOfStudentsAboveAverage = countAboveAverage(array);
        System.out.printf("The number of students who scored above the average: %d.\n", numberOfStudentsAboveAverage);

        double percStudentsAboveAverage = calculatePercentage(array);
        System.out.printf("The percentage of students who scored above the average: %.2f %%. \n", percStudentsAboveAverage);

    }


    private void title() {
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("Analyzing Student Exam Scores.");
        System.out.println("A program that analyzes student exam scores, calculates basic statistics, and provides insights into the data.");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - ");
    }

    private double calculateAverage(int[] arr) {
        int sum = 0;
        double ave;
        for (int element : arr
        ) {
            sum = sum + element;
        }
        return ave = 1.0 * sum / arr.length;
    }

    private int findHighestScore(int[] arr) {
        int currentHighest = 0;
        for (int element : arr) {
            if (element > currentHighest) {
                currentHighest = element;
            }
        }
        return currentHighest;

    }

    private int countAboveAverage(int[] arr) {
        double ave = calculateAverage(arr);
        int count = 0;
        for (int element : arr) {
            if (element > ave) {
                count++;
            }
        }
        return count;
    }

    private double calculatePercentage(int[] arr) {

        int countAbove = countAboveAverage(arr);
        int countAllStudents = arr.length;
        double percentage = 100.0 * countAbove / countAllStudents;
        return percentage;
    }

}
