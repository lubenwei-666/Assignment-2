package models;

import utils.Utilities;

public class Technology {

    private double price =20;

    private  String id="unknown";

    private String modelName="unknown";

    private Manufacturer manufacturer;

    public Technology(String modelName, double price,Manufacturer manufacturer,String id) {
        this.modelName = modelName;
        this.price = price;
        this.manufacturer = manufacturer;
        this.id = id;
    }

    public void setPrice (double price)
    {
        this.price = price;
    }

    public String getModelName() {
        return modelName;
    }

    public String getId(){
        return id;
    }

    public void setManufactor(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getInsurancePremium() {
            return price * 0.07;
        }


        public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String connectToInternet() {
        return "Connected to the internet via Companion App";
    }

    public void setId(String id){
        this.id = id;
    }

    public double getPrice(){
        return Utilities.toTwoDecimalPlaces(price);
    }

    public Manufacturer getManufacturer(){
        return manufacturer;
    }

    public String toString() {
        return "id" + id + "\n" +
                "Model Name: " + modelName + "\n" +
                "Price: " + price + "\n" +
                "Manufacturer: " + manufacturer.getManufacturerName() + "\n";
    }


}
