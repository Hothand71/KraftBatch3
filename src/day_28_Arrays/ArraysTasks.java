package day_28_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysTasks {
    //bir method yazın ve int[] kabuö etsin length i 5den büyükse true döndürsün
    /*public static void main(String[] args) {
        int[] arry={1,2,3,4,5,6};
        int[] arry2={1,2,3,4,5};

        System.out.println(arrLengthCheck(arry));
        System.out.println(arrLengthCheck(arry2));
    }
    public static boolean arrLengthCheck(int[] arry){
        return arry.length>5;
    }*/

    //bir method yazın int array kabul etsin array in içinde 5 olup olmadığını kontrol etsin.
   //task
    /*
    public static void main(String[] args) {
        int[] arry={1,2,3,4,5,6};
        System.out.println(fiveCheck(arry));
    }
    public static boolean fiveCheck(int[] arry){
        for (int i = 0; i < arry.length; i++) {
            if (arry[i]==5){return true;}
        }
        return false;
    }
*/
    //bir method yazın ve 2 array kabul etsin ilk elemanları eşitse true döndürsün
   /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arry={sc.nextInt(), sc.nextInt()};
        System.out.println(equalsCheck(arry));
    }
    public static boolean equalsCheck(int[] arry) {
        if (arry[0] == arry[1]) {
return true;
        }
        return false;
    }*/
    //task
/*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arry1={1, 2};
        int[] arry2={2, 3};
        System.out.println(Arrays.toString(task(arry1, arry2)));
    }
    public static int[] task(int[] arry1,int[] arry2){
      //firstWay
       // int[] arry3={arry1[0],arry2[0]};
       // return arry3;
        //secondWay
        int[] arry4=new int[];
        arry4[0]=arry1[0];
        arry4[1]=arry2[0];
        return arry4;

    }*/
    //Int arrayin elemanlarının toplamını veren bir method yazın
  /*  public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arry={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(sumArray(arry)));
    }
    public static int[] sumArray(int[] arry){
        int[] sum={0};
        for (int i = 0; i < arry.length; i++) {
            sum[0]+=arry[i];
        }
        return sum ;
    }
    */
    /*
    public static void main(String[] args) {
        int[] arry1={2,3,4,50,6,7};
        int[] arry2={2,3,4,50};
        System.out.println(bigNumOfArr(arry1));
    }
    public static int bigNumOfArr(int[] arry){
        int max=0;
        for (int i = 1; i < arry.length ; i++) {
          if (arry[i-1]>arry[i]){
              max=arry[i-1];
          }
        }
        return max;*/
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        int sum = sumAtOddIndexes(numbers);
        System.out.println("Toplam: " + sum);
    }

    public static int sumAtOddIndexes(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 1) { // İndeks tek sayı ise
                sum += numbers[i];
            }
        }
        return sum;
    }
}





