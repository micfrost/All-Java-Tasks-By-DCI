package D38_Static_Keyword.D38_CA2_Static_Example;

class Counter {

   static int count = 0;

    //    Constructor
    Counter() {
        count++;
        System.out.println(count);
    }
}

public class Main {
    public static void main(String[] args) {

        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();
    }
}
