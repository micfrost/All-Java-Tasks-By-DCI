package D22_While.D22_T2_Do_While_Loops;

public class Main {
    public static void main(String[] args) {
        EvenNumberCounter.countAndDisplayEvens(10);
    }
    static class EvenNumberCounter {//    static class EvenNumberCounter {

        static void countAndDisplayEvens(int limit) {
            int i = 2;
            do {
                System.out.println(i);
                i = i + 2;
            } while (i <= limit);

        }
    }
}
