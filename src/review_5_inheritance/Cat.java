package review_5_inheritance;

public class Cat extends Animal{
    public Cat(){
        super();
        System.out.println("Cat");
    }
    public static void main(String[] args) {
        Cat cat1= new Cat();
    }
}
