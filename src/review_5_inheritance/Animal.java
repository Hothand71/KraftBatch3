package review_5_inheritance;

public class Animal {
      int a=0;
      String cins="tekir";
public Animal(){
    System.out.println("Animal");
}public Animal(String cins){
    this.cins=cins;
        System.out.println("Animal");

    }

    public static void main(String[] args) {
        Animal cat1=new Animal();
    }


}


