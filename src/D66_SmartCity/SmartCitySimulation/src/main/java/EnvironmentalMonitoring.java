package D66_SmartCity.SmartCitySimulation.src.main.java;

public class EnvironmentalMonitoring implements Runnable {
    private Sensor airQualitySensor;
    private Sensor noiseSensor;
    private Sensor temperatureSensor;

    public EnvironmentalMonitoring() {
        airQualitySensor = new Sensor("Air Quality");
        noiseSensor = new Sensor("Noise Level");
        temperatureSensor = new Sensor("Temperature");
    }

    public void run() {
        // Simulate environmental monitoring
        while (true) {
            // Measure the environmental data
            airQualitySensor.measure();
            noiseSensor.measure();
            temperatureSensor.measure();

            // Display or process the measured data
            System.out.println("Air Quality: " + airQualitySensor.getCurrentValue() + " units");
            System.out.println("Noise Level: " + noiseSensor.getCurrentValue() + " decibels");
            System.out.println("Temperature: " + temperatureSensor.getCurrentValue() + " °C");

            // Add a delay to simulate monitoring at intervals (for example, every 5 seconds)
            try {
                Thread.sleep(5000); // Sleep for 5 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}