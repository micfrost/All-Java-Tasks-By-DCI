package D59_Callable_Future.DC_T_2_callablefuture.DC;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

class SumCalculator implements Callable<Integer> {
    final int start;
    final int end;

    public SumCalculator(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public Integer call() {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }
}

public class SumMain {
    public static void main(String[] args) throws InterruptedException {
    
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        List<SumCalculator> calculators = new ArrayList<>();
        calculators.add(new SumCalculator(2, 100));
        calculators.add(new SumCalculator(101, 200));
        calculators.add(new SumCalculator(201, 300));

        List<Future<Integer>> futures = new ArrayList<>();
        for (SumCalculator calculator : calculators) {
            futures.add(executorService.submit(calculator));
        }

        for (int i = 0; i < calculators.size(); i++) {
            SumCalculator calculator = calculators.get(i);
            int result;
            try {
                result = futures.get(i).get();
                System.out.println("Sum of integers in range [" + calculator.start + ", " + calculator.end + "]: " + result);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.HOURS);
    }
}
