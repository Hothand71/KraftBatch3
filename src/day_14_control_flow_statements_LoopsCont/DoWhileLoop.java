package day_14_control_flow_statements_LoopsCont;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        /*int speed=100;
        do {
            System.out.println("say Hello");
            speed++;
        }while (speed<=105);*/
        Scanner sc =new Scanner(System.in);
        int i1;
        int number =5;
        do {
            System.out.println("Sayıyı tahmin et");
            i1=sc.nextInt();
        }while (i1!=number);
            System.out.println("Tebrikler bildiniz sayi"+i1);
    }
}
