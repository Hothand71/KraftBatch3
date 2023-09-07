package day_1_MyFirstProgram;

import java.util.Random;
import java.util.Scanner;

public class MyFirstProgram {
    public static void main(String[] args) {
       /* Random rd= new Random();
        Scanner sc=new Scanner(System.in);
        System.out.println("Oynumuza hoş geldiniz. 1 ile 20 arasında bir sayı tahmin ettik. bilmeye çalış 5 hakkınız var.");
        int tahminedilensayi=rd.nextInt(1,21);
        int sayac=0;

        while(true){
            int girilensayi= sc.nextInt();
            if (girilensayi==tahminedilensayi){
                System.out.println("Tebrikler doğru bildiniz sonuç:" + tahminedilensayi);
            break;}

             sayac++;
            if (girilensayi==999){
                sayac=0;
            }if (girilensayi==888){
                tahminedilensayi=sc.nextInt();
            }
            System.out.println("Yanlış deneme kalan hakkınız:"+(5-sayac));
            if (sayac==5){
                System.out.println("hakkınız doldu bilemediniz. Sonuç:" + tahminedilensayi + " idi");
                break;
            }
        }
*/
     /*   while (true) {
            Scanner sc = new Scanner(System.in);
            Random rd = new Random();
            System.out.println("Kelime giriniz");
            String girilenkelimemiz = sc.nextLine();
            while (girilenkelimemiz.length() <= 4) {
                System.out.println("girdiğiniz kelimenin harf sayısı 4den azdır 4den fazla harfli bir kelime giriniz");
                girilenkelimemiz = sc.nextLine();
            }

            int tahminedilenindex = rd.nextInt(0, girilenkelimemiz.length());
            int sayac = 0;
            System.out.println("girdiğiniz " + girilenkelimemiz + " kelimenizden bir harfi aklımızda tuttuk bilmeye çalışın 4 hakkınız var başarılar");
            while (true) {
                String girilenharf = sc.nextLine();
                sayac++;
                if (girilenharf.equals("hak verir misin please")){sayac=-6;
                    System.out.println("Tabiki buyrun");}
                if (girilenharf.equals(String.valueOf(girilenkelimemiz.charAt(tahminedilenindex)))) {
                    System.out.println("Tebrikler dogru harfi bildiniz. harfimiz:" + girilenharf);
                    break;
                } else if (sayac == 4) {
                    System.out.println("bilemediniz cevap=" + String.valueOf(girilenkelimemiz.charAt(tahminedilenindex)));
                    break;
                } else System.out.println("kalan hakkınız:" + (4 - sayac) + "\nfarklı harf giriniz:");

            }
        }
*/
        while (true) {
            Random rd = new Random();
            Scanner sc = new Scanner(System.in);

            int atakimigol = 0;
            int btakimigol = 0;
            System.out.println("Takım adı giriniz");
            String takimadi = sc.nextLine() + " takımı";
            System.out.println(takimadi + " ve B takımı arasında maç başladı");
            System.out.println("Ya şut at yazın gol atmaya çalışın veya defans yap yazıp gol yememeye çalışın");
            for (int i = 0; i < 8; i++) {
                if (i==6){
                    System.out.println("SON DAKİKALAR");
                }
                int tahminedilendeger = rd.nextInt(1, 101);
                String girilenkelime = sc.nextLine();
                if (girilenkelime.equals(" ")){break;}
                if (girilenkelime.equals("şut")) {
                    if (tahminedilendeger > 90) {
                        btakimigol++;
                        System.out.println("OLAMAZ GOL YEDİN");
                        System.out.println(atakimigol + "-" + btakimigol);
                    } else if (tahminedilendeger > 50) {
                        System.out.println("Goooooool!!!!");
                        atakimigol++;
                        System.out.println(atakimigol + "-" + btakimigol);
                    } else if (tahminedilendeger < 25) {
                        System.out.println("top direkten döndü cok yakındı!!!!!");
                        System.out.println(atakimigol + "-" + btakimigol);
                    } else System.out.println("Top outa gitti");
                }
                if (girilenkelime.equals("defans")) {
                    if (tahminedilendeger > 50) {
                        System.out.println("Defans başarılı top sahadan uzaklaştırıldı");
                        System.out.println(atakimigol + "-" + btakimigol);
                    } else if (tahminedilendeger < 25) {
                        System.out.println("Gol yedin olamaaaaz!!!! karşı takım 1 score kazandı");
                        btakimigol++;
                        System.out.println(atakimigol + "-" + btakimigol);
                    } else System.out.println("Kaleci topu tuttu");
                }
                if (girilenkelime.equals("pas")) {
                    if (tahminedilendeger > 50) {
                        System.out.println("Pas başarılı");
                    } else System.out.println("Pas atarken karşı oyuncu topu aldııııı");
                }
            }
            System.out.println("Maç sona erdii düüüüüüüüt");
            System.out.println(takimadi + " " + atakimigol + "-" + btakimigol + " B takımı");
            if (atakimigol > btakimigol) {
                System.out.println(takimadi + " kazandı");+


















            } else if (atakimigol < btakimigol) {
                System.out.println("B takımı kazandı");
            } else {
                System.out.println("Maç berabere bitti");
            }
        }

    }


    }

