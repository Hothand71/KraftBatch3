package day_20_review;

import java.util.Scanner;

public class BreakAndContinue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("bölünemeyen sayılar");
        for (int i = 1; i < a; i++) {
            if (i%3==0 && i%5==0){
                continue;
            }
            System.out.println(i);
        }
    }
}
