package day_17_Methods;

import java.util.Random;
import java.util.Scanner;

public class Day_16_Summary {
    public static void main(String[] args) {
/*
        disLoop:        for (int i =0; i<3;i++){
                System.out.println("Dış loop");
        icLoop:        for (int j=0;j<2;j++){
                    if (j==1){continue disLoop;}
                    System.out.println("İç loop");
                }
                }
            System.out.println("Çıktım");

*/
    /*    Scanner sc = new Scanner(System.in);
        Random random= new Random();
        double para= random.nextInt(100000);
        System.out.println("Bankamıza hoş geldiniz");
        System.out.println("yapmak istediğiniz işlemi seçiniz?");
    firstLoop:    while (true){

            System.out.println("1 hesabımdaki parayı görme");
            System.out.println("2 para ekleme");
            System.out.println("3 kart iade");
            int x=sc.nextInt();

            if (x==1){
                System.out.println("Bankadaki para miktarınız:"+para);
            } else if (x==2){
                while (true){
                    System.out.println("Para ekleme sayfasına hoş geldiniz");
                    System.out.println("Yapmak istediğiniz işlemi seçiniz");
                    System.out.println("1 EFT");
                    System.out.println("2 Havale");
                    System.out.println("3 Bir önceki menüye dön");
                    System.out.println("4 Kartı iade et");
                    System.out.println("Seçim:");
                    int secim=sc.nextInt();
                   if (secim==1){
                        System.out.println("EFT YAPILDI");
                        continue;
                    } else if (secim==2) {
                        System.out.println("HAVALE YAPILDI");
                    } else if (secim==3) {
                        break;
                    } else if (secim==4) {
                        System.out.println("Kart iade ediliyor");
                        break firstLoop;
                    }


                }

            }
            else if (x==3){
                System.out.println("Kart iade ediliyor");

                break;
            } else System.out.println("Hatalı giriş yaptınız");

        }System.out.println("Hoşçakalın");

*/

        int i=0;
        for (;true;) {
            System.out.println("Hello forever");
            i++;
            if (i==10){break;}
        }
        System.out.println("Not forever");


    }

}
