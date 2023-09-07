package day_34_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList5 {
    //contains() containsall() /copy
    public static void main(String[] args) {
        ArrayList<String> weekDays=new ArrayList<>();

        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");

        System.out.println("weekDays = " + weekDays);

        ArrayList<String> allDays= new ArrayList<>(weekDays);//way of copy 1
        ArrayList<String> allDays2= new ArrayList<>();
        System.out.println("allDays = " + allDays);

        allDays2.addAll(weekDays);//way of copy 2
        System.out.println("allDays = " + allDays2);

     // both way above is copying values, not copying of referance
     //yukarıdaki her iki yolda listler içindeki elementleri kopyalıyor referansları değil.

        List<String> strings= allDays2.subList(2,4);
        System.out.println("allDays2 = " + strings);

        strings.add("merhaba");
        System.out.println("strings = " + strings);//strings = [Wednesday, Thursday, merhaba]
        System.out.println("allDays2 = " + allDays2);//allDays2 = [Monday, Tuesday, Wednesday, Thursday, merhaba, Friday]

        ArrayList<String> alldays3 = new ArrayList<>(allDays2.subList(2,4));
        System.out.println("alldays3 = " + alldays3);
        alldays3.add("Merhaba");
        System.out.println("allDays2 = " + allDays2);
        System.out.println("alldays3 = " + alldays3);

        allDays.add("Saturday");
        allDays.add("Sunday");
        System.out.println("allDays = " + allDays);

        System.out.println("allDays.contains(\"Thursday\") = " + allDays.contains("Thursday"));
        System.out.println("allDays.contains(\"Thursday\") = " + allDays.containsAll(weekDays));
        if (allDays.contains("Thursday")){
            allDays.indexOf("Thursday");
        }

    }
}
