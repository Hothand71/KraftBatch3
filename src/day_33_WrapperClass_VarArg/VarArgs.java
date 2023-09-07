package day_33_WrapperClass_VarArg;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        sum(5,10);
        sum(5,10,15);
        System.out.println(sum(3, 6, 9, 12, 15));
        System.out.println(concat("mus","tafa"," ","kem","al"));
        System.out.println(Arrays.toString(cevreHesapla(1, 5, 8, 5, 9, 6)));

    }
  /*  public static int sum(int a, int b){
        return  a+b;
    }
    public static int sum(int a, int b,int c){
        return  a+b+c;
    }
    public static int sum(int a, int b,int c,int d,int e){
        return  a+b+c+d+e;
    }*/
    public static int sum(int... sayılar){
        int result=0;
        for (int i = 0; i < sayılar.length; i++) {
            result+=sayılar[i];
        }
        return result;
    }
    public static String concat(String... kelimeler){
        String str="";
        for (String s:kelimeler){
            str+=s;
        }
        return str;
    }
    public static String[] cevreHesapla(int... cevre){
        String[] str=new String[2];
        int cevreToplam=0;
        for (int i = 0; i < cevre.length; i++) {
            cevreToplam+=cevre[i];
        }
        str[0]="bu bir "+cevre.length+"gendir";
        str[1]="cevre uzunlugu"+cevreToplam;
        return str;
    }
}
