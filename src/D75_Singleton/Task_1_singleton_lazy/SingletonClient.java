package D75_Singleton.Task_1_singleton_lazy;

class ZooSingletonExample {

//    Lazy initialization

    // Step 1
    private static ZooSingletonExample zoo;

    // Step 2
    private ZooSingletonExample() {
        System.out.println("Instance created");
    }

    // Step 3
    public static ZooSingletonExample getInstance() {
        if(zoo ==null){
            zoo = new ZooSingletonExample();}
        return zoo;
    }

    void displayMessage(){
        System.out.println("Woooaaahh");
    }

}

public class SingletonClient {
    public static void main(String[] args) {
        ZooSingletonExample zoo1 = ZooSingletonExample.getInstance();
        ZooSingletonExample zoo2 = ZooSingletonExample.getInstance();

        // Demonstrate that both instances are the same
        System.out.println("Are both instances the same? " + (zoo1 == zoo2));

        zoo1.displayMessage();
        zoo2.displayMessage();
    }
}
