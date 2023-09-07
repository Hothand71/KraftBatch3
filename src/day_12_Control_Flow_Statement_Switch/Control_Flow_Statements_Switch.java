package day_12_Control_Flow_Statement_Switch;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Control_Flow_Statements_Switch {
    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen gün sayısını giriniz");
        int x = sc.nextInt();
        int y=x%7;

        switch (y){
                case 0:
                System.out.println("Salı");
                break;
                case 1:
                System.out.println("Çarşamba");
                break;
                case 2:
                System.out.println("Perşembe");
                break;
                case 3:
                System.out.println("Cuma");
                break;
                case 4:
                System.out.println("Cumartesi");
                break;
                case 5:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("pazartesi");


        }
*/
        //hesap makinesi yapalım
        //kullanıcıdan 2 tane değer alın ve kullanıcıya yapmak istediği işlemi
        //sroun 1 toplama/2çıkarma/3çarpma/4bölme
        //buna göre ekrana sonuç döndüren programı yazınız
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Sayıyı giriniz:");
        double num1 =sc.nextDouble();
        System.out.println("2. Sayıyı giriniz");
        double num2 = sc.nextDouble();

        System.out.println("yapmak istediğiniz işlemi seçiniz:\n 1-toplama \n 2-çıkarma \n 3-çarpma \n 4-bölme");
        int sum=sc.nextInt();

        switch (sum){
                case 1:
                System.out.println(num1+num2);
                break;
                case 2:
                System.out.println(num1-num2);
                break;
                case 3:
                System.out.println(num1*num2);
                break;
                case 4:
                    if (num1==0){
                System.out.println("hatalı işlem");}
                    else System.out.println(num1/num2);
                break;
            default: System.out.println("yanlış işlem seçtiniz!!");

        }

    }
}
