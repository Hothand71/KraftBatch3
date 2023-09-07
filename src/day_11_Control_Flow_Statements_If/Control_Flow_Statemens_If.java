package day_11_Control_Flow_Statements_If;

import java.util.Scanner;

public class Control_Flow_Statemens_If {
    public static void main(String[] args) {
       /* int x =5;
        if (x>5){

            System.out.println("X 5 den büyüktür");

        }
        if (x==5){
            System.out.println("X 5e eşit");
        }
        else {
            System.out.println("X 5e eşit veya 5den kücük");
        }
      System.out.println("Hi I am elfo!");*/

     /*   int sayi;

        System.out.println("Lütfen 1 ila 100 arasında sayı giriniz:");
        sayi = sc.nextInt();
        if (sayi>50&&sayi<80) {
            sayi =sayi*10;
            System.out.println("Ortalama bir not");
        }*/
        //kullanıcıdan bir sayı alın bu sayı tek ise ekrana bu sayı tekdir yazdırın.
       /* Scanner sc = new Scanner(System.in);
        int sayi;
        System.out.println("Sayı giriniz:");
        sayi=sc.nextInt();
        if (sayi%2==1){System.out.println("Bu sayı tekdir");}*/
      /*  Scanner sc = new Scanner(System.in);
    System.out.println("Bir sayı giriniz:");
        int sayi= sc.nextInt();
        if (sayi%2==0){
            System.out.println("Girdiğiniz sayı çifttir.");
        }
        else {
            System.out.println("Sayı tekdir.");
        }
                */

        //kullanıcıdan 2 ayı alın vew büyük sayıyı ekrana yazdırın
      /*  Scanner sc =new Scanner(System.in);
        System.out.println("1. sayıyı giriniz");
        int num1=sc.nextInt();
        System.out.println("2. sayıyı giriniz");
        int num2=sc.nextInt();

        if (num1>num2){
            System.out.println(num1);
        }
        else {
            System.out.println(num2);}*/

        //kullanıcıdan 2 sayı alın ilk sayı ikinci sayıya tam olarak bölünebiliyor ise
        //ekrana sayı1 sayı2ye tam bölünebiliyor
        //tam bölünemiyorsa ekrana tam bölünme sağlanamad kalan ... yazdırın

     /*   Scanner sc = new Scanner(System.in);
        System.out.println("1. sayıyı giriniz:");
        int num1=sc.nextInt();
        System.out.println("2. sayıyı giriniz:");
        int num2=sc.nextInt();
        if (num1%num2==0){
            System.out.println("Sayılar tam bölünebiliyor");

        }else {
            int kalan=num1%num2;
            System.out.println("Tam bölünme sağlanamadı: Kalan("+kalan+")");


        }*/
            //kullanıcıdan üçgenin iç açılarını isteyin(ücgenin iç açıları toplamı 180)
            //aldığınız değerleri karşılaştırarak dik üçgen olup olmadığını kontrol ediniz.
            //dik üçgen ise girilen bu değerler ile dik üçgen oluşturulabilir
            //dik üçgen değilse bu bir dik üçgen değildir yazdırın
     /*   Scanner sc = new Scanner(System.in);
        System.out.println("1.açıyı girin:");
        int num1=sc.nextInt();
        System.out.println("2.açıyı girin:");
        int num2=sc.nextInt();
        System.out.println("3.açıyı girin:");
        int num3=sc.nextInt();
if (num1+num2+num3==180) {
    if (num1 == 90 || num2 == 90 || num3 == 90) {
        System.out.println("Girilen bu değerler ile dik üçgen oluşturulabilir");
    } else {
        System.out.println("Dik üçgen değildir");
    }

}
else {
    System.out.println("Girdiğiniz değerlerle üçgen oluşturulamaz lütfen değerleri kontrol ediniz");
}

*/


        //kullanıcıdan vize+final bot ortalamasını alın ve ortalama 50 ve üzeri 70in altında ise ortalama ile geçtiniz
        //orta ile geçtiniz
        //70 ve üzeri 85 altı ise iyi ile geçtiniz
        //85 üzeri ise pekiyi ile geçtiniz
        //50nin altında ise kaldınız yazdıran programı yazınız.

        Scanner sc = new Scanner(System.in);
        System.out.println("Vize notu:");
        int vize= sc.nextInt();
        System.out.println("Final notu:");
        int fin= sc.nextInt();
        int ortalama= (vize+fin)/2;
        if (ortalama<50){
            System.out.println("Kaldınız");
        } else if (ortalama>=50&&ortalama<70){
            System.out.println("Orta ile geçtiniz");
        } else if (ortalama>=70&&ortalama<85){
            System.out.println("Iyi ile geçtiniz");
        }else{
            System.out.println("Iyi ile geçtiniz");
        }


    }
}
