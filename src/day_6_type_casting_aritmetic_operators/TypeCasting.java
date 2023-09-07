package day_6_type_casting_aritmetic_operators;

public class TypeCasting {
    public static void main(String[] args) {
/*
        int y=10;//32 bit
        byte x=5;//8bit*/
    // y=x;// dogrudur cunku 8 bitlik bir veriyi 32bitlik bi verinin icerisine sıgdırıyor. //32 bitlik bir alana 8 bitlik veriyi genişleme widenning
    // x=y;// hata verir cunku 32 bitlik veriyi 8 bitin icine sıkıstıramaz.
        //bunun önüne gecmek icin conert ediyoruz
     /*   x=(byte)y;// bu veriyi byte olarak gör diyoruz //
        System.out.println(x);*/

      /*  int z=130;
        byte t;
        t=(byte) z;
        System.out.println(t);//-126 olarak cıkar*/

      /*  double x =100;
        int y;
        y=(int)x;
        System.out.println(y);*/

        //byte ,short ve int türündeki veriler ile işlem yapıldığında sonuç devamlı int'dir.
   /* byte x=2;
    byte y=2;
    // byte z; şeklinde olursa calısmaz
    int z;
        z=x+y;
        System.out.println(z);

        short a=5;
        short b=10;
        int c=a+b;*/
        //int,double,string,float,char

        /*int a=5, b=10, c=a+b;
        System.out.println(c);
        short  d= (short) c;
        System.out.println(d);*/


    }
}
