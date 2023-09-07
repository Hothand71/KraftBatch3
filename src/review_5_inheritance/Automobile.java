package review_5_inheritance;

public class Automobile extends Vehicle{
    String radioBrand;
    int hp;
    public Automobile(String model){
        super(model);
    }
    public void start(){
        System.out.println("Automobile çalıştı");
    }
    public void changeHp(int hp){
        this.hp=hp;
    }
}
