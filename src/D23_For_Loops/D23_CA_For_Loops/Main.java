package D23_For_Loops.D23_CA_For_Loops;

public class Main {
    public static void main(String[] args) {
//        whileLoop();
//        forLoop();
//        continueCommand();
//        breakCommand();
//        whileAlwaysTrueBreak();
    }

    private static void forLoop() {
        System.out.println("--- For Loop ---");
        for (int i = 0; i < 5; i++) {
            System.out.println("i: " + i);
        }
    }
    private static void whileLoop() {
        System.out.println("--- While Loop ---");
        int counter = 0; //1. Declaring a variable
        while(counter < 10) { //2. Condition
            System.out.println(counter);
            counter++; // stopping the loop
        }
    }
    private static void whileAlwaysTrueBreak() {
        System.out.println("while Always True Break");
        int value = 0;
        boolean condition1 = true;

        while (condition1) {
            if(value==3) {
                break;
            }
            System.out.println("Hi! Time: " + value);
            value++;
        }
    }
    private static void breakCommand() {
        System.out.println("BREAK COMMAND");
        for (int n=0; n<10;n++) {
            if(n==4) {
                break;
            }
            System.out.println(n);
        }
    }
    private static void continueCommand() {
        System.out.println("CONTINUE COMMAND");
        for (int n=0; n<10;n++) {
            if(n==4) {
                System.out.println(" Here we are skipping one number with a continue commend");
                continue;
            }
            System.out.println(n);
        }
    }
}
