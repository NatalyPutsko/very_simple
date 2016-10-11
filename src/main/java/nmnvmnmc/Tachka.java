package nmnvmnmc;

public class Tachka {
    private String model;
    private String brand;
    private float volume;


    public Tachka (String model, String brand, float volume){
        this.model=model;
        this.brand=brand;
        this.volume=volume;
            }

    public String setModel() {
        return model;
    }
    public String setBrand(){
        return brand;
    }
    public float setVolume(){
        return volume;
    }
    public String getModel() {
        return model;
    }
    public String getBrand(){
        return brand;
    }
    public float getVolume(){
        return volume;
    }
    public Tachka(){
        this.model= "Lanos";
        this.brand= "ZAZ";
        this.volume= 1.5f;
    }

}
