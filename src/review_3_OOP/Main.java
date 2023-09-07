package review_3_OOP;

import java.util.Random;
import java.util.Scanner;

public class Main {

/*
    public static void main(String[] args) {
        Daire daire1=new Daire();
        Daire daire2=new Daire();
        daire2.yaricap=15;
        daire1.yaricap=10;
        System.out.println(daire1.alanHesapla(daire1.yaricap));
        System.out.println(daire2.alanHesapla(40));
        System.out.println(daire1.cevreHesapla(15));
        System.out.println(daire2.cevreHesapla(18));

    }*/
/*public static void main(String[] args) {
  //  Car car_1=new Car("Honda",15500);
  //  Car car_4=new Car();
   Car car= new Car("Honda");
    System.out.println(car.model);
    modelDegistir(car,"Tofaş");
    System.out.println(car.model);


}
public static Car modelDegistir(Car car,String model){
    car.model=model;
    return car;
}*/
    /*
public static void main(String[] args) {
    Square kare_1=new Square();
    kare_1.sideLength=2;
    System.out.println("kare_1.calcuatePerimeter() = " + kare_1.calcuatePerimeter());
    System.out.println("kare_1.calculateArea() = " + kare_1.calculateArea());
    Square kare_2=new Square(3);
    System.out.println("kare_2.getSideLength = " + kare_2.getSideLength);
    System.out.println("kare_2.calcuateArea = " + kare_2.calcuateArea);
}*/
    /*
public static void main(String[] args) {
    Pencil pencil_1=new Pencil("Red",8,true);
    pencil_1.write();
    pencil_1.delete();
    Pencil pencil_2 =new Pencil("Yellow",15);
    pencil_2.write();
    pencil_2.delete();
    Pencil pencil_3 =new Pencil("Blue");
    pencil_3.write();
    pencil_3.delete();

}*/
    /*
public static void main(String[] args) {
    Cat cat_1=new Cat("blue",true,true,true);
    cat_1.sleep();
    cat_1.food();
    cat_1.run();
}
*/
    /*
public static void main(String[] args) {
KraftBank mustafa=new KraftBank(11,"Mustafa Kemal Altun",true);
    System.out.println(mustafa.getAccountInfo());
mustafa.addMoney(5000);
    System.out.println(mustafa.getAccountInfo());
addMoney(mustafa,-49);
    System.out.println(mustafa.getAccountInfo());
    KraftBank.bankName="KrafttechBank";

    KraftBank kemal=new KraftBank(12,"Mustafa Kemal Altun",true);
    System.out.println(kemal.getAccountInfo());

}
public static void addMoney(KraftBank kraftBank,double money){
    kraftBank.addMoney(money);
}*/
    /*
public static void main(String[] args) {
    Flower flower=new Flower();
    flower.setRenk("Kırmızı");
    flower.setBoy(85);
    System.out.println(flower.getBoy());
    System.out.println(flower.getRenk());
}
*/
public static void main(String[] args) {
    Random rd=new Random();
    Scanner sc=new Scanner(System.in);
ArtvinBank cem=new ArtvinBank(rd.nextInt(0,100),"Cem Akyıldız",true);
ArtvinBank kemal=new ArtvinBank(rd.nextInt(0,100),"Mustafa Kemal Altun",false);
    System.out.println(cem.getCustomerId() + cem.getCustomerFullName() + cem.isSms() + cem.getCustomerToken());
    System.out.println(kemal.getCustomerId() + kemal.getCustomerFullName() + kemal.isSms() + kemal.getCustomerToken());
    cem.setCustomerFullNamePass(sc.nextLine(), sc.nextLine());
    System.out.println(cem.getCustomerId() + cem.getCustomerFullName() + cem.isSms() + cem.getCustomerToken());

}
}
