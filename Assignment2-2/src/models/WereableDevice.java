package models;

public class WereableDevice extends Technology{

    private String material;

    private String size;


    public WereableDevice(String modelName,double price,Manufacturer manufacturer,String id,String material,String size){
        super(modelName,price,manufacturer,id);
        this.material = material;
        this.size = size;
    }

    public String toString(){
        return "Material: " + material + "\n" +
                "Size: " + size + "\n";
    }

    public String getSize(){
        return size;
    }

    public void setSize(String size){
        this.size = size;
    }

    public String getMaterial(){
        return material;
    }

    public void setMaterial(String material){
        this.material = material;
    }
}
