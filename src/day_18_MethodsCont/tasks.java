package day_18_MethodsCont;

import java.util.Scanner;

public class tasks {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        while (true)
        {
            System.out.println(bigOfThree());
            //System.out.println(grade(sc.nextInt(), sc.nextInt(), sc.nextInt()));
            //System.out.println(convertPozitif(sc.nextInt()));
            // System.out.println(primeNumber(sc.nextInt()));}
    }}



    public static boolean  primeNumber(int a){
        if (a==0 || a==1){
            return false;
        }else{
            for (int i = 2; i < a; i++) {
                if (a%i==0){
                    return false;
                }
            }
        }
        return true;

    }

    public static int convertPozitif(int a){
        if (a<0){
            a=a*(-1);
            return a;
        } else
            return a;
    }

    public static char grade(double not1,double not2,double not3) {
        int avarage = (int) ((not1 + not2 + not3) / 3);
        System.out.println("avarage = " + avarage);
        if (avarage  >= 76 && avarage<=100 ) {
            return ('A');
        } else if (avarage <= 75 && avarage >= 51) {
            return ('B');
        } else if (avarage > 0 && avarage <= 50) {
            return ('C');
        }else return('!');
    }

    public static int bigOfThree(){
        Scanner sc =new Scanner(System.in);
        System.out.println("3 sayı girin");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

       return (a>b ? (a>c ? a:c) :(b>c ? b:c));


    }
}
