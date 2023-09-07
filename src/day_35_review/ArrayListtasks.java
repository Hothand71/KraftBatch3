package day_35_review;

import java.util.ArrayList;

public class ArrayListtasks {
    public static void main(String[] args) {
        ArrayList<String> fruitsInBasket= new ArrayList<>();
        fruitsInBasket.add("elma");
        fruitsInBasket.add("armut");
        fruitsInBasket.add("kayısı");
        fruitsInBasket.add("üzüm");
        fruitsInBasket.add("erik");

        ArrayList<String> fruitsInPlate= new ArrayList<>();

        fruitsInPlate.add("armut");
        fruitsInPlate.add("kayısı");
        fruitsInPlate.add("üzüm");

        fruitsInBasket.removeAll(fruitsInPlate);
        System.out.println("fruitsInBasket = " + fruitsInBasket);

        ArrayList<Integer> listOfNums=new ArrayList<>();
        listOfNums.add(5);
        listOfNums.add(10);
        listOfNums.add(15);
        listOfNums.add(20);
        listOfNums.add(25);
        listOfNums.add(100);
        listOfNums.add(250);
        listOfNums.add(500);
        printListNumbers(listOfNums);


    }

    public static void printListNumbers(ArrayList<Integer> nums){
        for (Integer I:nums
             ) {
            System.out.print(I+" ");
        }
    }

}
