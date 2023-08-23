package D27_MultidimensionalArrays.D27_CA;

public class Main {
    public static void main(String[] args) {
        System.out.println("- - - - -  - - - - -");
        String name = "John";
        int age = 34;
        double afterOneYear = 35.0;

        System.out.printf("My name is %s amd I am %d years old, and after half year %.2f\n", name, age, afterOneYear);
        System.out.println("- - - - -  - - - - -");



        String[][] colors = {
                {"redish", "blue", "black", "light yellow"},
                {"white", "grey", "purple"},
                {"white", "grey", "purple"},
                {"green", "yellow", "pink"}
        };

        for (int i = 0; i < colors.length; i++) {
            System.out.print("Array No. : " + i + ". ");
            for (int j = 0; j < 1; j++) {
                System.out.print("Length: " + colors[i].length + ".");
            }
            System.out.println();
        }
        System.out.println("- - - - -  - - - - -");

        for (int i = 0; i < colors.length; i++) {

            for (int j = 0; j < colors[i].length; j++) {
                System.out.printf("%s\t", colors[i][j]);
            }
            System.out.println();
        }
        System.out.println("- - - - -  - - - - -");

        int [][] arr = {{1,2}, {3,4}};

        for(int i=0; i<2; i++) {
            for(int j=0; j<2; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
