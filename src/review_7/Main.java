package review_7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
  /*  C c=new C();
    c.start();
    B b=new B();
    b.start();
    A a=new A();
    a.start();*/
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Pazartesi");
        arrayList.add("Salı");
        arrayList.add("Çarşamba");
        arrayList.add("Perşembe");
        arrayList.add("Cuma");
        arrayList.add("Cumartesi");
        arrayList.add("Pazar");
        System.out.println(arrayList);
        System.out.println(kaydirmaMiktar(arrayList, 1));
        System.out.println(kaydirmaMiktar(arrayList, 4));


    }

    public static ArrayList<String> kaydirmaMiktar(ArrayList<String> arry,int param){
        for (int i = 0; i < param; i++) {
            arry.add(0,arry.get(arry.size()-1));
             arry.remove(arry.size()-1);
        }
        return arry;
    }
}
