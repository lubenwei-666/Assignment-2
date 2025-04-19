package models;

public class Tablet extends WearableDevice {
    private String operatingSystem;

    
    // Updated constructor to match ComputingDevice parameters
    public Tablet(String modelName, double price, Manufacturer manufacturer, String id, String processor, int storage, String operatingSystem) {
        super(modelName, price, manufacturer, id, processor, storage);
        this.operatingSystem = operatingSystem;
    }

    // Updated getInsurancePremium method

    public double getInsurancePremium() {
        return 0.01 * getPrice();
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
    public String getOperatingSystem() {
        return operatingSystem;
    }
    public String toString() {
        return super.toString() + " Operating System: " + operatingSystem;
    }

    // New method connectToInternet
    public String connectToInternet() {
        return "Connects to the internet via Wi-Fi";
    }
}
