public class D17_T1_Comparing {
    public static void main(String[] args) {

        int val0 = Integer.parseInt(args[0]);
        int val1 = Integer.parseInt(args[1]);
        int val2 = Integer.parseInt(args[2]);

        System.out.println("The numbers: " + val0 + " " + val1 + " " + val2);

        if (val0 > val1 && val0 > val2) {
            System.out.println("The biggest out of the three numbers is " + val0);
            if (val0 > (val1 + val2)) {
                System.out.println(val0 + " is bigger than the sum of " + val1 + " + " + val2 + " (" + (val1+val2) + ")");
            } else {
                System.out.println(val0 + " is not bigger than the sum of " + val1 + " + " + val2);
            }

        } else if (val1 > val0 && val1 > val2) {
            System.out.println("The biggest out of the three numbers is " + val1);
            if (val1 > (val0 + val2)) {
                System.out.println(val1 + " is bigger than the sum of " + val0 + " + " + val2 + " (" + (val0+val2) + ")");
            } else {
                System.out.println(val1 + " is not bigger than the sum of " + val0 + " + " + val2);
            }

        } else if (val2 > val0 && val2 > val1) {
            System.out.println("The biggest out of the three numbers is " + val2);
            if (val2 > (val0 + val1)) {
                System.out.println(val2 + " is bigger than the sum of " + val0 + " + " + val1 + " (" + (val0+val1) + ")");
            } else {
                System.out.println(val2 + " is not bigger than the sum of " + val0 + " + " + val1);
            }

        } else {
            System.out.println("something went wrong");
        }

    }
}

//Task 1 - Comparing value against the sum of other two values
//Create a class called Task1 inside the src/main/java folder. Create the main method in it.
//You should receive three arguments in the main method: all integer numbers. Since the arguments received by the main method are always String, you should parse the string into an int, like it was done in the previous lessons.
//    int value=Integer.parseInt("10");
//Your first task is to find which of the numbers is the biggest. Print the value on the screen.
//args: 10 4 5: The biggest out of the three numbers is 10
//args: 10 15 8: The biggest out of the three numbers is 15
//args: 10 15 32: The biggest out of the three numbers is 32
//Your next step is to check whether the biggest number is bigger or not than the sum of the other two numbers.
//Your final outputs should look similar to the ones below: