package day_22_Class_and_Object;

public class MyFirstClass {
    public static void main(String[] args) {
        /*
        Person kullanici_1=new Person();
        kullanici_1.name="Kemal";

        Person kullanici_2=new Person();
        kullanici_2.name="Zafer";

        System.out.println(kullanici_1.name+" ile "+kullanici_2.name+" saklambaç oynuyorlardı");*/
        Car car_1=new Car();
        Car car_2=new Car();
        Car car_3=new Car();

        car_1.marka="Honda";
        car_1.renk="Sarı";
        car_1.model="CRV";
        car_1.hiz=360;

        car_2.marka="Mercedes";
        car_2.renk="Siyah";
        car_2.model="C200d";
        car_2.hiz=400;

        car_3.marka="Tofaş";
        car_3.renk="Beyaz";
        car_3.model="Şahin";
        car_3.hiz=180;



    }





}
