package D57_Semaphore.DC_T_1_PrintingJo.DC_T_1_MJ_PrintingJob;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;


public class PrintJobSchedulingExercise {
    private Semaphore printerSemathor = new Semaphore(0);
    private List<String> printJobs = new ArrayList<>();

    public static void main(String[] args) {

        PrintJobSchedulingExercise printJobExercise = new PrintJobSchedulingExercise();

        PrintJob printJobRed = printJobExercise.new PrintJob();
        printJobRed.start();
        PrintJob printJobBlue = printJobExercise.new PrintJob();
        printJobBlue.start();
        PrintJob printJobGreen = printJobExercise.new PrintJob();
        printJobGreen.start();


        Printer printer1 = printJobExercise.new Printer();
        printer1.start();
        Printer printer2 = printJobExercise.new Printer();
        printer2.start();
        Printer printer3 = printJobExercise.new Printer();
        printer3.start();


    }

    class PrintJob extends Thread {
        @Override
        public void run() {

            try {
                printerSemathor.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


            System.out.println("Printing is going to be done in 5 sek.");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Printing done");

        }
    }


    class Printer extends Thread {

        @Override
        public void run() {
            System.out.println(" - - - Printer is ready for a new task in 2 sek.");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(" - - - Printer is ready for a new task");
            printerSemathor.release();
        }
    }


}
