package day_8_operatorsCont;
import java.util.Scanner;

public class equal_relationalOpe {
    public static void main(String[] args) {
        //Task
        Scanner sc = new Scanner(System.in);
        //kullanıcıdan bir sayı alın
        //sayı tek sayı mı olduğunu bir boolean değişkeni ile kontrol edin
      /*  Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz:");
        int sayi= sc.nextInt();
        boolean b= !(sayi%2==0);
        System.out.println("Girdiğiniz sayı tek midir=" + b);*/
//Task
        //kullanıcıdan gunlık aldıgı kolari sorulsun
        //aldıgı kalori kilosunun 30katı kadarsa kişinin kilolu oldugunu
        //dogrulayan bir boolean kontrolu sağlayın.
      /*  System.out.println("Günlük aldığınız kolari miktarı nedir");
        double v=sc.nextDouble();
        System.out.println("lütfen kilonuzu girin");
        int k = sc.nextInt();
        boolean status = v/k >=30;
        System.out.println("status = " + status);*/

        //task4
        //kullanıcıdan 2 sayı alınız ve
        //sayıların farklarının cift olduğunu
        //kontrol eden bir boolean değişken tanımlayınız.
        System.out.println("Birinci sayıyı giriniz:");
        int i = sc.nextInt();
        System.out.println("İkinci sayıyı giriniz:");
        int i2 = sc.nextInt();
        boolean status = (i-i2)%2==0;
        System.out.println("status = " + status);

        //task5 ödev
        //kullanıcıdan 3 sayı alınız ve
        //sayıların ortalamalarının tek sayı olup olmadığını
        //bir boolean değişkenle kontrol edin


    }
}
