package D59_Callable_Future.DC_T_2_callablefuture.MJ;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

class SumCalculator implements Callable<Integer> {


    private int startNum;
    private int endNum;

    public int getStartNum() {
        return startNum;
    }

    public int getEndNum() {
        return endNum;
    }

    public SumCalculator(int startNum, int endNum) {
        this.startNum = startNum;
        this.endNum = endNum;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = startNum; i <= endNum; i++) {
            sum = sum + i;
        }


        return sum;
    }
}

public class SumMain {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(3);


        List<SumCalculator> sumCalculatorList = new ArrayList<>();
        sumCalculatorList.add(new SumCalculator(1,5));
        sumCalculatorList.add(new SumCalculator(6,10));
        sumCalculatorList.add(new SumCalculator(11,15));


        List<Future<Integer>> futureList = new ArrayList<>();
        for (SumCalculator sumCalculator: sumCalculatorList
             ) {
            Future<Integer> future = executorService.submit(sumCalculator);
            futureList.add(future);
        }


        for (int i = 0; i < sumCalculatorList.size(); i++) {
            try {
                System.out.println("Sum of integers for a range from "
                        + sumCalculatorList.get(i).getStartNum() + " to "
                        + sumCalculatorList.get(i).getEndNum() + " is : "
                        + futureList.get(i).get());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


        executorService.shutdown();
        executorService.awaitTermination(4, TimeUnit.HOURS);
    }
}
