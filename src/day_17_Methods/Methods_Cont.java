package day_17_Methods;

import java.util.Scanner;

public class Methods_Cont {
    public static void main(String[] args) {
       // ortalama();
        buyuk();
    }
    // kullanıcıdan 2 adet sayı alın en büyük sayıyı ekrana yazdırın
    public static void buyuk() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. sayı:");
        int num1 = sc.nextInt();
        System.out.println("2. sayı:");
        int num2 = sc.nextInt();
        if (num1 >= num2) {
            System.out.println("Büyük sayı= " + num1);
        } else System.out.println("Büyük sayı= " + num2);
    }
    //kullanıcıdan 2 adet sayı alan ve bu sayı ile ortalamasını veren ortalama metodu yapınız.
    public static void ortalama(){
        Scanner sc =new Scanner(System.in);
        System.out.println("1. sayı:");
        int num1=sc.nextInt();
        System.out.println("2. sayı:");
        int num2=sc.nextInt();
        int ortalama=((num1+num2)/2);
        System.out.println("Ortalama = " + ortalama);

    }


    }

