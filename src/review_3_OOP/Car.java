package review_3_OOP;

import java.util.Random;

public class Car {
    String model;
    int km;
   static Random rd= new Random();
    public Car(){
        System.out.println(this +"Obje oluşturuldu...");
    }
    public Car(String model,int km){
        if (model==null){
            model="boş bırakılmış ";
        }
        this.model=model;
        this.km=km;
        System.out.println("model ve km objesi oluşturuldu...");
    }
    public Car(String model){
        this("",rd.nextInt(0,10000));
        this.model=model;
        System.out.println("model objesi oluşturuldu...");
    }

}
