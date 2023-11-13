package D66_SmartCity.SmartCitySimulation.src.main.java;

import java.util.Random;

public class Sensor {
    private String sensorType;
    private double currentValue;

    public Sensor(String sensorType) {
        this.sensorType = sensorType;
        this.currentValue = 0.0;
    }

    // Simulate measuring data by generating random values
    public void measure() {
        Random rand = new Random();

        if ("Air Quality".equals(sensorType)) {
            currentValue = rand.nextDouble() * 100; // Random value between 0 and 100
        } else if ("Noise Level".equals(sensorType)) {
            currentValue = rand.nextDouble() * 150; // Random value between 0 and 150 (in decibels)
        } else if ("Temperature".equals(sensorType)) {
            currentValue = rand.nextDouble() * 80 - 40; // Random value between -40 and 40 degrees Celsius
        }
    }

    public double getCurrentValue() {
        return currentValue;
    }

    public String getSensorType() {
        return sensorType;
    }

    @Override
    public String toString() {
        return "Sensor Type: " + sensorType + ", Current Value: " + currentValue;
    }
}