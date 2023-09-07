package day_21_Methods_Summary_And_Class_Object;

import com.sun.source.tree.NewArrayTree;
import java.util.Scanner;

public class Methods_Summary {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       //System.out.println("cevap: "+faktoriyel(sc.nextInt()));
       // System.out.println("basamak sayısı: "+basamakSayisi(sc.nextInt()));
        //System.out.println(mukemmelSayi(sc.nextInt()));
        System.out.println(binary(sc.nextInt()));
    }
    public static boolean binary(int count1){
        for (int i = 0; i <= count1 ; i++) {
            if (count1%10==1||count1%10==0){
                count1=count1/10;
                if (count1<2){return true;}
            }
        }
        return false;
    }




    public static void f(int x) {
        System.out.println(2*x+5);
    }
    public static double faktoriyel(int a){
        double result=1;
        for (int i = 1; i <= a; i++) {
            result=result*i;
        };return result;
    }
    public static int basamakSayisi(int x){
        int sayac=0;
        while (x>0){
            x=x/10;
            sayac++;

        }
            return sayac;
    }
    public static boolean mukemmelSayi(int count1){
        int result=0;
        for (int i =1; i < count1; i++) {
            if (count1%i==0){
                result=result+i;
            }
        }
        return result==count1;
    }
}
