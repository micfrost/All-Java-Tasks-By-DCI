package D27_MultidimensionalArrays.D27_T3_MultiArray_EvenNum;

public class CountingEvenNum {
    public int countEvenCalc(int[][] array) {
        int count=0;

        for (int[] row: array) {
            for (int num: row) {
                if(num%2==0)
                count++;
            }
        }
        return count;
    }

}