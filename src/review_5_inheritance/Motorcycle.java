package review_5_inheritance;

public class Motorcycle extends Vehicle {
int cc;
    public Motorcycle(String model){
        super(model);
    }
public void changeCcHp(int cc){
    this.cc=cc;
}
}
