package D59_Callable_Future.DC_T_1_callablefuture.MJ;


import java.util.Scanner;
import java.util.concurrent.*;

class CalcFactorial implements Callable<Integer> {


    @Override
    public Integer call() throws Exception {
        Scanner scanner = new Scanner(System.in);

        boolean validInput = false;
        while (!validInput) {
            System.out.println("- - - ");
            System.out.println("Enter a positive integer.");
            try {

                int n = Integer.parseInt(scanner.nextLine());


                if (n < 0) {
                    System.out.println("Error: The number should be non-negative.");
                    continue;
                }


                int factorial = 1;
                for (int i = 1; i <= n; i++) {

                    if (Integer.MAX_VALUE / i < factorial) {
                        System.out.println("Error: The result of factorial too big.");

                        return -2; // Return -2 to indicate that the result is too large
                    }
                    factorial = factorial * i;
                }

                validInput = true;
                System.out.println("The factorial calculation is in progress . . .");
                Thread.sleep(2000);

//            System.out.println("Factorial is: " + factorial);
                return factorial;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. ");

            }  }

            return null;
        }
    }




public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        try {

            Future<Integer> future1 = executorService.submit(new CalcFactorial());

            Integer thread1 = future1.get();

            if (thread1 > 0) {
                System.out.println("Factorial is: " + thread1);
            }


        } catch (NullPointerException e) {
            System.out.println("Oh no + " + e);
        } finally {
            executorService.shutdown();
            executorService.awaitTermination(1, TimeUnit.HOURS);

            System.out.println("- - - ");
            System.out.println("The program has ended successfully.");
        }
    }
}

