package D66_SmartCity.SmartCitySimulation.src.main.java;

public class Vehicle {
    private String vehicleType;
    private String registrationNumber;


    public Vehicle(String vehicleType, String registrationNumber) {
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;

    }



    public String getVehicleType() {
        return vehicleType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String toString() {
        return "Vehicle Type: " + vehicleType + ", Registration Number: " + registrationNumber;
    }
}