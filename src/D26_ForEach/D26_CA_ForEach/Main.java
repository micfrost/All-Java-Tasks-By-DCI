package D26_ForEach.D26_CA_ForEach;

public class Main {
    public static void main(String[] args) {

        String[] animals = {"cat", "dog", "elephant", "sloth"};
        int[] score = {125, 132, 95, 116, 154};

        display(animals);
        display(score);
        maximum(score);
    }

    public static void display(String[] animals) {
        for (String ani : animals) {
            System.out.print(ani + " ");
        }
        System.out.println();
    }

    public static void display(int[] array) {
        for (int arr : array) {
            System.out.print(arr + " ");
        }
        System.out.println();
    }

    public static int maximum(int[] array) {
        int maxSoFar = array[0];
        for (int arr : array) {
            if (arr > maxSoFar) {
                maxSoFar = arr;
            }
        }
        System.out.println("The maximum number is: " + maxSoFar );
        return maxSoFar;
    }
}
