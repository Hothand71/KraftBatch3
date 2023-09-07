package day_20_review;

import java.util.Scanner;

public class tasks1 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
      /*  System.out.println("Ebobunu bulmak istediğiniz 2 sayıyı giriniz:");
        while(true){
        System.out.println(ebobFinder(sc.nextInt(), sc.nextInt()));}*/
        //System.out.println(ekok(sc.nextInt(), sc.nextInt()));
        //System.out.println(primeNumber(sc.nextInt()));
        while (true) {

            System.out.println(ekok(sc.nextInt(), sc.nextInt()));
        }
    }
    public static int ekok(int x,int y){
        int result=1;
        int i=2;
        while (x>1||y>1){
            if(x%i==0||y%i==0){
                result=result*i;
            }
            if(x%i==0){
                x=x/i;
            }
            if(y%i==0){
                y=y/i;
            }
            if(x%i==0||y%i==0){
                continue;
            }else{
                i++;
            }
        }
        return result;
    }



    public static int ebobFinder(int count1,int count2){
        int min=Math.min(count1,count2);
        int ebob=1;
        for (int i = 2; i <= min; i++)
        {
            while(count1%i==0&&count2%i==0)
            {
                ebob=i;
                i++;
            }
        }return ebob;
    }

    public static boolean primeNumber(int count){
        boolean status = false;
        int j=0;
        for (int i = 2; i <= count; i++) {
            while (count%i==0){
                j++;
                    if (count==i&&j==1){status=true; break; }
                    else status=false; break ;
                }

            }
        return status;
        }

    public static int example(int con1,int con2){
        System.out.println("ilk sayının bölenleri ");
        for (int i = 2; i < con1; i++) {
            for (int j = 2; j < i ; j++) {
                if (!(con1%i==0)&&!(i%j==0)){
                    continue;
                }else
                   return j  ;
            }

        }return con2;
    }
    public static void timeConverter(int time) {
        while (true){

        int minutes = time/60;
        int second = time%60;
        int clock = minutes/60;
        if (time==0){break;}
        else if (clock>=1){
            System.out.println(clock+" Saat "+minutes%60+" Dakika "+second+" Saniye");
            break;
        }else if (minutes>=1&&clock<=0){
            System.out.println(minutes+" Dakika "+second+" Saniye");break;
        } else System.out.println(second+" Saniye") ;break;}}
    public static int timeConverter2(int time){
        Scanner sc = new Scanner(System.in);
        System.out.println("saniye giriniz\nÇıkış için '0'");
        time=sc.nextInt();
        int minutes = time/60;
        int second = time%60;
        int clock = minutes/60;
        if (time==0){return time;}
        else if (clock>=1){
            System.out.println(clock+" Saat "+minutes%60+" Dakika "+second+" Saniye");
            return (time);
        }else if (minutes>=1&&clock<=0){
            System.out.println(minutes+" Dakika "+second+" Saniye");return time;
        } else System.out.println(second+" Saniye") ;return time;}
    }

