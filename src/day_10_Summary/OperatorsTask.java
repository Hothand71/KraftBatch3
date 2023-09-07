package day_10_Summary;

import java.util.Scanner;

public class OperatorsTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //task1
        //Yumurtalar 37.8 derece uzerinde ve 55-60 derece arasında
        //çalışması(kuluçkalanması) öngörülmüştür. Aşağıda ki
        //şartlara gore yumurtaların civciv olup olamayacağını
        //boolean bir değerle ifade edin.
        //sıcaklık 37.3 nem 54.
       /* double sicaklik;
        System.out.println("Sıcaklık giriniz=");
        sicaklik =sc.nextDouble();
        double nem;
        System.out.println("Nem giriniz=");
        nem = sc.nextDouble();
        boolean status;
        boolean nemaraligi= nem>=55 && nem<=60;
        status=sicaklik>37.8 && nemaraligi;

        System.out.println("status = " + status);*/
        //task2
        //kullanıcıdan bir sayı alın sayı hem 3 hem 5 bölünüyorsa veya
        //her ikisini de bölünmüyorsa false veren bir boolean kontrolü
        //sağlayın.

      /*  int sayi;
        System.out.println("Sayi giriniz=");
        sayi=sc.nextInt();
        boolean status;
        status = (sayi%3==5&&sayi%5==0)||(sayi%3==5||sayi%5==0);
        System.out.println("status = " + !status);*/

        //task3
        //Bir uygulama tasarlayın sizi hoş geldiniz mesajı ile karşılasın.
        //Size yaşadığınız şehrin nüfusunu sorsun. Eğer nüfus 1,5
        //milyondan fazla ve 10 milyondan az ise ve konuşulan dil
        //Türkçe ise liveInTur isimli boolean değeri true döndürsün.
        //Ve konsola «You live in Turkey true ?» ifadesini
        //değişken kullanarak yazdıralım.
        System.out.println("Hoş geldiniz");
        System.out.println("Nerede yaşıyorsunuz");



    }
}
