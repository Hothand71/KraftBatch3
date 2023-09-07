package day_12_Control_Flow_Statement_Switch;

import java.util.Scanner;

public class Summary {
    public static void main(String[] args) {

       /* //kullanıcının girmiş olduğu sayının negatif mi pozitif mi olduğunu ekrana yazan programı yazınız
        Scanner sc =new Scanner(System.in);
        System.out.println("Sayı giriniz:");
        int num = sc.nextInt();
        if (num<0){

            System.out.println("girdiğiniz sayı negatiftir.");
        }
        else if (num==0){
            System.out.println("girdiğiniz sayı nötr");
        }
        else {
            System.out.println("girdiğiniz sayı pozitiftir.");
        }*/

       /* Scanner sc = new Scanner(System.in);
        System.out.println("Sayı giriniz");
        int num1 = sc.nextInt();
        System.out.println("Sayı giriniz");
        int num2 = sc.nextInt();
        System.out.println("Sayı giriniz");
        int num3 = sc.nextInt();

        if (num1>=num2&&num1>=num3){
            System.out.println("En büyük sayı:"+num1);
        }  else if (num2>=num1&&num2>=num3) {
            System.out.println("En büyük sayı:"+num2);
        }
        else {
            System.out.println("En büyük sayı:"+num3);
        }*/
        // öğrencinin vize sınavından aldığı notun %40
        //final sınavından aldığı notun %60'ı alınarak öğrencinin yıl
        // sonu notu hesaplanıyor
        //matematik sınavından yılsonu notu 50nin altında ise ekrana kaldınız
        //50 ve üzeri ise ekrana geçtiniz yazsın
    /*    Scanner sc = new Scanner(System.in);
        System.out.println("Vize notu giriniz");
        int vize =sc.nextInt();
        System.out.println("Final notu giriniz");
        int fnl = sc.nextInt();
        int not=((vize*40/100)+(fnl*60/100));
        if (not>=50){
            System.out.println("Geçtiniz");
        } else if (not<50){

            System.out.println("Büt notu giriniz");
            int but= sc.nextInt();
            if (but>=50){
                System.out.println("Geçtiniz");
            } else {
                System.out.println("Kaldınız");
            }
        }
*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Sayı giriniz");
        int sayi = sc.nextInt();
        int gun=sayi%7;
        if (gun==1){System.out.println("Pazartesi"); }
       else if (gun==2){System.out.println("Salı"); }
       else if (gun==3){System.out.println("Çarşamba"); }
       else if (gun==4){System.out.println("Perşembe"); }
       else if (gun==5){System.out.println("Cuma"); }
       else if (gun==6){System.out.println("Cumartesi"); }
       else if (gun==0){System.out.println("Pazar"); }


    }
}
