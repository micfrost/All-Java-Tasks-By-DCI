package D27_MultidimensionalArrays2D.D27_T2_MultiArray_Sum;

public class Main {
    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {3, 4}};

        SumOfElements sumOfElements = new SumOfElements();
        int sumMy = sumOfElements.sumCalc(arr);

        System.out.printf("The sum of all elements in a given 2D array is: %d \n", sumMy);
    }
}
