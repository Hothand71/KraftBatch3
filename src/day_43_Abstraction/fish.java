package day_43_Abstraction;

public class fish extends Animal{
    @Override
    public void eat() {
        System.out.println("balıklar küçük balıkları yer");
    }

    @Override
    public void move() {
        System.out.println("balıklar yüzer");
    }
}
