package D27_MultidimensionalArrays2D.D27_T3_MultiArray_EvenNum;

public class Main {

    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {3, 4}};

        CountingEvenNum countingEvenNum = new CountingEvenNum();
        int countEvenNum = countingEvenNum.countEvenCalc(arr);

        System.out.printf("The count of even numbers is: %d.\n", countEvenNum);
    }
}
