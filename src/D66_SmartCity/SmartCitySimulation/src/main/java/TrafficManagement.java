package D66_SmartCity.SmartCitySimulation.src.main.java;

//Simulates smart traffic management, including traffic lights, congestion detection, and rerouting of vehicles.
// You can use a CSV file (traffic_data.csv) to represent traffic data.

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TrafficManagement implements Runnable {
    private List<Vehicle> vehicles;

    public TrafficManagement() {
        this.vehicles = new ArrayList<>();
    }

    public void run() {

        // Read traffic data from CSV
        readTrafficData();

        // Simulate traffic flow
        simulateTraffic();
    }

    String csvFile = "src//D66_SmartCity//SmartCitySimulation//src//resources//traffic_data.csv";

    private void readTrafficData() {
        String csvFile = "src//D66_SmartCity//SmartCitySimulation//src//resources//traffic_data.csv";

        try (CSVReader reader = new CSVReader(new FileReader(csvFile))) {
            String[] nextRecord;
            try {
                while ((nextRecord = reader.readNext()) != null) {
                    String vehicleType = nextRecord[0];
                    String registrationNumber = nextRecord[1];
                    Vehicle vehicle = new Vehicle(vehicleType, registrationNumber);
                    vehicles.add(vehicle);
                }
            } catch (CsvValidationException | IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    private void simulateTraffic() {
        // Simulate traffic flow, update vehicle positions, manage traffic lights, etc.
        // For example, moving vehicles, checking traffic conditions, adjusting traffic lights, etc.
        // This is a simplified example to show the structure.
        while (true) {
            for (Vehicle vehicle : vehicles) {

                // Print or use vehicle information
                System.out.println("Vehicle: " + vehicle.getVehicleType());
            }

            // Simulate at intervals (for example, every 10 seconds)
            try {
                Thread.sleep(10000); // Sleep for 10 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void writeTrafficDataToCSV() {
        String[] header = {"Vehicle Type", "Registration Number"};

        String[][] trafficData = {
                {"Car", "ABC123"},
                {"Bus", "XYZ789"},
                // Add more sample data as needed
        };

        String csvFile = "src//D66_SmartCity//SmartCitySimulation//src//resources//traffic_data.csv";

        try (FileWriter writer = new FileWriter(csvFile)) {
            // Write header
            writer.append(String.join(",", header));
            writer.append("\n");

            // Write data rows
            for (String[] data : trafficData) {
                writer.append(String.join(",", data));
                writer.append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
