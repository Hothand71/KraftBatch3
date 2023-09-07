package day_7_aritmetic_operators;
import java.util.Scanner;
public class ScannerExample {
    public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);

       /* System.out.print("lütfen isminizi yazınız:");
        String ad=scan.nextLine();
        System.out.println("isminiz = " + ad);
        System.out.print("bir sayı giriniz");
        double sayi=scan.nextDouble();
        System.out.println("Girilen sayının karesi= " + sayi*sayi);
        int sayi2= scan.nextInt();
        System.out.println("Girilen sayının 5 fazlası: " + sayi2+5);
        System.out.println("yaşınız 21den büyük mü?");*/
       /* boolean deneme=scan.nextBoolean();
        System.out.println("yaşınız 21den"+deneme);*/
       /* System.out.print("Doğum yılınızı giriniz:");
        short dogumyili=scan.nextShort();
        System.out.println("Yaşınız:" + (-dogumyili));*/

        System.out.print("Fizik notu giriniz:");
        double fiz= scan.nextDouble();
        System.out.print("\nKimya notu giriniz:");
        double kim= scan.nextDouble();
        System.out.print("\nMatematik notu giriniz:");
        double mat= scan.nextDouble();
        System.out.println("\nNot ortalamanız="+((fiz+kim+mat)/3));



    }
}
