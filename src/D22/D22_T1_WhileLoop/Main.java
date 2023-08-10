package D22.D22_T1_WhileLoop;

public class Main {
    public static void main(String[] args) {
        NumberCounter nCounter = new NumberCounter();
        nCounter.countAndDisplay(1, 10);
    }

    public static class NumberCounter {

        void countAndDisplay(int start, int end) {

            while (start <= end) {
                System.out.println(start);
                start ++;
            }
        }
    }

}
