package day_18_MethodsCont;

import java.util.Scanner;

public class Methods_Cont_2 {
    public static void okkaTokilo(){
        Scanner sc= new Scanner(System.in);
        System.out.println("okka ya cevirmek istediginiz kilogram degeri giriniz:");
        double kl = sc.nextDouble();
        System.out.println(kl/1.283+"okkadır");


    }


    public static void message(int a){

        System.out.println(a+" is here");
    }

    //task
    //Bir method yazın 2 sayı kabul etsin ve ilk sayıyı ikinci sayının üslü kuvveti yapıp sonuç versin .Math.pow(a,b)

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Sayı ve Kuvvet Giriniz");
       while(true) {
           kuvvet(sc.nextInt(), sc.nextInt());
       }}
    public static void kuvvet(int x,int y){
        System.out.println("Sonuç= "+Math.pow(x,y));
    }
}
