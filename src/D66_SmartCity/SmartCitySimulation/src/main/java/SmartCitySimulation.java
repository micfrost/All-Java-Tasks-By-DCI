package D66_SmartCity.SmartCitySimulation.src.main.java;


//The main class of the simulation that starts and manages the different aspects of the smart city simulation.

public class SmartCitySimulation {
    public static void main(String[] args) {
        TrafficManagement trafficManagement = new TrafficManagement();
        SmartLighting smartLighting = new SmartLighting();
        EnvironmentalMonitoring environmentalMonitoring = new EnvironmentalMonitoring();

        // Start simulation components using multithreading
        Thread trafficThread = new Thread(trafficManagement);
        Thread lightingThread = new Thread(smartLighting);
        Thread monitoringThread = new Thread(environmentalMonitoring);


        trafficManagement.writeTrafficDataToCSV();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        trafficThread.start();
        lightingThread.start();
        monitoringThread.start();

        // Wait for threads to finish
        try {
            trafficThread.join();
            lightingThread.join();
            monitoringThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}