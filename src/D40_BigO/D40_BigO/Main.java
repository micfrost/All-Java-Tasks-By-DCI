package D40_BigO.D40_BigO;
//import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = { 9, 7, 5, 3, 1, 2, 4, 6, 8, 10 };

        /*
         * Big O / Worst case = O(n)
         *
         * Omega Ω / Best case scenario = Ω(1);
         *
         * Theta θ / Average case scenario = O(n/2) = O(n)
         */

        linearSearch(arr, 9);

        int[] sortedArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println("\nBinary Search:");

        /*
         * Big O / Worst case = O(log2 n)
         *
         * Omega Ω / Best case scenario = Ω(1);
         *
         * Theta θ / Average case scenario = O(log n/2) = O(log n)
         */

        int indexOfLookUpNumber = binarySearch0(sortedArr, 0, 10, 1);

        System.out.println("Index of number: " + indexOfLookUpNumber);

    }

    static void linearSearch(int[] array, int lookUpNumber) {
        int step = 0;
        for (int num : array) {
            step++;

            if (num == lookUpNumber) {
                System.out.println("This number was found");
                System.out.println("\nNumber of steps: " + step);
                return;
            }
        }
        System.out.println("Number not found");
    }

    static int binarySearch0(int[] a, int fromIndex, int toIndex, int key) {
        int low = fromIndex;
        int high = toIndex - 1;

        int step = 0;

        while (low <= high) {
            step++;
            int mid = (low + high) >>> 1;
            int midVal = a[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else {
                System.out.println("\nNumber was found");
                System.out.println("Number of steps: " + step);
                return mid;} // key found
        }
        return -(low + 1); // key not found.
    }

    /*
     * static void binarySearch(int[] array, int lookUpNumber) { int startIndex = 0;
     * int endIndex = array.length - 1;
     *
     * int step = 0; while (startIndex <= endIndex) { step++;
     *
     * int middleIndex = (startIndex + endIndex) / 2; // Same as using Math.floor
     * int midVal = array[middleIndex];
     *
     * if (midVal < lookUpNumber) startIndex = middleIndex + 1; else if (midVal >
     * lookUpNumber) endIndex = middleIndex - 1; else return middleIndex; // key
     * found } System.out.println("Mid value is : " + ); return -(startIndex + 1);
     * // key not found. }
     */
}