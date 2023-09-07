package review;

import java.util.Scanner;

public class Person {
   static String name1;
    String name;
    String surname;
    int age;
    double height;
    double weight;

    public String eat(){
    return "Yemek ye";
    }
    public String sleep(){
    return "Uyu";
    }
    public double bodyMassIndex(){
        return (height/(weight*weight));
    }
    public static void isimAta(){
        Scanner sc= new Scanner(System.in);
                name1+=sc.nextLine();
    }

}
