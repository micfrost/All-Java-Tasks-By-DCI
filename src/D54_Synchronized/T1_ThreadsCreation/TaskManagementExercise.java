package D54_Synchronized.T1_ThreadsCreation;

class Worker extends Thread {
    String name;

    public Worker(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("Worker " + name + " is performing a task.");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Worker " + name + " has done a task successfully.");

    }
}

public class TaskManagementExercise {
    public static void main(String[] args) {
        System.out.println("- - -");
        System.out.println("A program that simulates a simple task management system with multiple workers (threads) performing tasks concurrently.");
        System.out.println("- - -");

        Worker worker1 = new Worker("Tom");
        Worker worker2 = new Worker("Bob");
        Worker worker3 = new Worker("Rin");
        Worker worker4 = new Worker("Win");
        Worker worker5 = new Worker("Sob");

        worker1.start();
        worker2.start();
        worker3.start();
        worker4.start();
        worker5.start();


    }
}
