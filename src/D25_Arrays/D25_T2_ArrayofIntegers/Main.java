package D25_Arrays.D25_T2_ArrayofIntegers;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {16, 8, 23, 35, 11, 6, 19};

        System.out.println("\nThe elements of the array are: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println("\n\nDC_T_1_ReantrantLock_Inside Java program that performs the tasks: ");
//      Calculate the sum of all integers in the array.
        int sum = 0;
        for (int number : numbers) {
            sum = sum + number;
        }
        System.out.println("The sum of integers in the array: " + sum);

//      Find and display the maximum value in the array.
        int maxValue = 0;
        for (int number : numbers) {
            if (number > maxValue) {
                maxValue = number;
            }
        }
        System.out.println("The maximum value in the array: " + maxValue);

//      Find and display the minimum value in the array.
        int minValue = numbers[0];
        for (int number : numbers) {
            if (number < minValue) {
                minValue = number;
            }
        }
        System.out.println("The minimum value in the array: " + minValue);

//      Calculate and display the average value of the integers in the array.
        double average = sum / numbers.length;
        System.out.println("The average value of the integers in the array: " + average);


    }
}
