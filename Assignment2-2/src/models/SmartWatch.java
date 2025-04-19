package models;

import utils.Utilities;

public class SmartWatch extends WearableDevice{
    private String displayType = "LCD";

    public SmartWatch(String modelName,double price,Manufacturer manufacturer,String id,String material,String size,String displayType)
    {
        super(modelName,price,manufacturer,id,material,size);

        if ("AMOLED".equalsIgnoreCase(displayType) || "LCD".equalsIgnoreCase(displayType)||
                "LED".equalsIgnoreCase(displayType)|| "TFT".equalsIgnoreCase(displayType)) {
        this .displayType = displayType;
        }
        else{
            System.out.println("Display Type is not valid");;
        }
    }

    public String toString() {
        return super.toString() +
                "Display Type: " + displayType + "\n" +
                "Insurance Premium: " + getInsurancePremium() + "\n" +
                "internet connection: " + connectToInternet() + "\n";

    }

    public String getDisplayType() {
        return displayType;
    }

    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }

    public String connectToInternet() {
        return "Connected to internet";
    }

    public double getInsurancePremium() {
        return Utilities.toTwoDecimalPlaces(getPrice() * 0.06);
    }


}
