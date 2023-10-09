package D26_ForEach.D26_CA_ForEach;

public class Main {
    public static void main(String[] args) {

        String[] animals = {"cat", "dog", "elephant", "sloth"};
        int[] score = {125, 132, 95, 116, 154};

        display(animals);
        //        String highestScore = maximum(animals);
        //        System.out.println("The maximum String is: " + highestScore);

        display(score);

        int longestWord = maximum(score);
        System.out.println("The maximum number is: " + longestWord);

        int lowestScore = minimum(score);
        System.out.println("The minimum number is: " + lowestScore);
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
        return maxSoFar;
    }

    //    public static String maximum(String[] array) {
    //        int maxSoFarLength = array[0].length();
    //        int index = 0;
    //        for (String arr : array) {
    //            if (arr.length() > maxSoFarLength) {
    //                maxSoFar = arr.length();
    //            }
    //            index++;
    //        }
    //        return array[maxSoFar];
    //    }

    public static int minimum(int[] array) {
        int minSoFar = array[0];
        for (int arr : array) {
            if (arr < minSoFar) {
                minSoFar = arr;
            }
        }
        return minSoFar;
    }
}
