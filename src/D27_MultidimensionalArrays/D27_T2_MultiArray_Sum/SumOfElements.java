package D27_MultidimensionalArrays.D27_T2_MultiArray_Sum;

public class SumOfElements {

    public int sumCalc(int[][] array) {
        int sum=0;

        for (int[] row: array) {
            for (int num: row) {
                sum=sum+num;
            }
        }
        return sum;
    }

}
