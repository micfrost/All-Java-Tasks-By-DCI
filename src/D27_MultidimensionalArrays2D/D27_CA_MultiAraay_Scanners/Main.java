package D27_MultidimensionalArrays2D.D27_CA_MultiAraay_Scanners;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("- - - - -  - - - - -");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int numRows = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the number of columns: ");
        int numColumns = Integer.parseInt(scanner.nextLine());

        int[][] arr = new int[numRows][numColumns];

        for (int[] row: arr) {
            for (int num: row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("- - - - - - - - - -");


        for (int i = 0; i <numRows; i++) {

            for (int j = 0; j < numColumns; j++) {
                arr[i][j]= j+1+(i*numColumns);

                System.out.print(arr[i][j] + " \t");
            }

            System.out.println();
        }
        System.out.println("- - - - - - - - - -");

//        for (int[] rows: arr) {
//            for (int num: rows) {
//
//                System.out.print(num+10 + " ");
//            }
//            System.out.println();
//        }
//        System.out.println("- - - - - - - - - -");

    }
}
