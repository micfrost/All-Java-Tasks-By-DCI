package D59_Callable_Future.DC_T_1_callablefuture.DC;

import java.util.Scanner;
import java.util.concurrent.*;

public class FactorialCalculator {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.err.println("Please enter a positive integer.");
        } else {


            ExecutorService executor = Executors.newSingleThreadExecutor();

            Callable<Long> factorialTask = new FactorialTask(n);

            Future<Long> future = executor.submit(factorialTask);

            System.out.println("Calculating the factorial of " + n + " in progress...");

            try {
                long result = future.get();
                System.out.println("Factorial of " + n + " is: " + result);
            } catch (Exception e) {
                System.out.println("An error occurred while calculating the factorial.");
            }

            executor.shutdown();
            executor.awaitTermination(30, TimeUnit.MINUTES);
        }
    }
}
class FactorialTask implements Callable<Long> {
    private int number;

    public FactorialTask(int number) {
        this.number = number;
    }

    @Override
    public Long call() throws Exception {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
