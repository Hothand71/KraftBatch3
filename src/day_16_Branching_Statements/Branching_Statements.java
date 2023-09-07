package day_16_Branching_Statements;

import java.util.Random;
import java.util.Scanner;

public class Branching_Statements {
    public static void main(String[] args) {/*
        for(int i =0; i<4; i++){

            for (int j=0;j<70;j++){
            if (j==3){
                break;
            }
            System.out.println((j+1)+". iç döngü");
            }
            System.out.println((i+1)+". dış döngü");
        }*/


        //1. kullanıcıdan sonsuz sayıda sayı girmesini isteyin -1
        //girer ise sistemden çıkış sağlasın

        //2. 0dan 10 a kadar bilgisayara bir sayı tutturun ve kullanıcıdan 4 hakda bunu bilmesini isteyin
        //kullanıcı bilirse "bildiniz tebrikler" yazdırın ve sistemden çıkın
        //bilemez şse 4ç hakkından sonra "maalesef bilemediniz tuttuğum sayı...dı" diyerek sistemden çıksın

        //
       /* Scanner sc=new Scanner(System.in);
        boolean a =true;
        int b;
        while(a){

                  b=sc.nextInt();

                    for (int i=0;i<=50;i++){
                        if (b==-1){
                            a=false;
                            break;
                        }
                    }
        }*/
        //
     /*   Scanner sc =new Scanner(System.in);

        for (int i=0;i<20;i++){
            Random random = new Random();
            int x =random.nextInt(10)+1;
            System.out.print( " "+x);
       }

*/
   /*     Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Sayı giriniz");
            int num1=sc.nextInt();
            System.out.println("Sayı giriniz");
            int num2=sc.nextInt();
            System.out.println("Toplam:"+(num1+num2));
            if ((num1+num2)==50) {
                break;
            }


        }
*/    /*  Scanner sc =new Scanner(System.in);
        while (true) {
            System.out.println("1. sayıyı girin:");
            double num1 = sc.nextInt();
            System.out.println("1. sayıyı girin:");
            double num2 = sc.nextInt();
            System.out.println("İşlem seçiniz");
            System.out.println(" 1-toplama 2-Çıkarma 3-çarpma 4-bölme 5-çıkış ");
            int stat = sc.nextInt();
            if (stat==1){
                System.out.println("Sonuç="+(num1+num2));
            }
            else if (stat==2){
                System.out.println("Sonuç="+(num1-num2));
            }
            else if (stat==3){
                System.out.println("Sonuç="+(num1*num2));
            }
            else if (stat==4){
                if (num2==0){  System.out.println("Geçersiz değer!!");}
                else
                System.out.println("Sonuç= "+(num1/num2));
            }
            else if (stat==5){
                    System.out.println("Çıkış yapılıyor...");
                    break;
            }
*///0dan 10 10 dahil değil kadar olan sayıları ekrana yazdıran 3 ve 7 haric sayıları yazdırın
        for (int i=0;i<10;i++){
            if (i==3||i==7){continue;}
            System.out.print(i+" ");

        }





        }



    }

