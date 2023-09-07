package review_5_inheritance;

import java.util.Random;

public class Person {
    String name;
    String surname;
    String id;
    double salary;

    public Person(String name,String surname){
        this.name=name;
        this.surname=surname;
    }
    public void createId (){
        String id="";
        Random rd=new Random();
        for (int i = 0; i < 2; i++) {
            id+=this.name.charAt(i);
        }
        id+=rd.nextInt(1000,10000);
        this.id=id;
    }
    static {
        System.out.println("Person erişim sağlanıyor");
    }

}
