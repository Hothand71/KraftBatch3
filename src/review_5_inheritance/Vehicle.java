package review_5_inheritance;

public class Vehicle {
   private String model;
   private int maxSpeed;
   private String color;
    public Vehicle(String model){
        this.model=model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void start(){
        System.out.println("starting vehicle");
    }
    public void stop(){
        System.out.println("stopping vehicle");
    }


}
