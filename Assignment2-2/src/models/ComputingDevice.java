package models;

public class ComputingDevice extends Technology{

    private int storage;

    private String processor;

    public ComputingDevice(String modelName, double price, Manufacturer manufacturer, String id, String processor, int storage){
        super(modelName, price, manufacturer, id);
        this.storage = storage;
        this.processor = processor;
    }

    public int getStorage() {
        return storage;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String toString() {
        return "ComputingDevice{" +
                "storage=" + storage +
                ", processor='" + processor + '\'' +
                ", modelName='" + getModelName() + '\'' +
                ", price=" + getPrice() +
                ", manufacturer=" + getManufacturer() +
                ", id='" + getId() + '\'' +
                '}';
    }

}
