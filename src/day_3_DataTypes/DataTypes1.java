package day_3_DataTypes;

public class DataTypes1 {
    /*
    Eğitim stratejilerimiz
    1-Tüm derslere katılmak
    2-Derslere katılım ortamımızı dikkatimizi dağıtacak unsurlardan arındırın.
    3-önce dinle --> Anla
    4-anladığımı kodlayacağım --> ögrenmiş olacağım
    5-not alın
    6-follow the topics day by day --> kacan dersleri mutlaka sonraki derse kadar dinle
    7-

    Zorluklarımız
    syntax | siz dizimi javanın yazım kuralları
    logic | mantıksal kodlama
    bol bol tekrar yapacagız kodlama da syntax hataları ortadan kalkacak
    zamanla logic gelişecek. Mantıksal yaklaşımımız gelişecek.
    KİMSE RAKİBİNİZ DEĞİL KENİDİNİZİ RAKİP EDİNECEKSİNİZ. BUGUN DÜNKÜ HALİNİZDEN İYİ OLMALI.


     */ //ve //tek satır not düsme

/*
    byte age; decleration etmek
    age =75; assign etmek

 */
    public static void main (String[] args) {
        String sayMyName = "Mustafa Kemal";
        System.out.println(sayMyName);
//java programlarının yürütülmesi için main method bir başlangıç noktasıdır.
        //Bir programda çok sayıda classlar olabilir en az bir tanesinde main method olmalıdır.
        //Main method olmazsa java- JVM programı execute etmez.
        // static public void main(String[] arg) {}
        //public static void main (String[] args) {} iki şekilde de yazılır mesela, farklı şekillerde de olur

        //decleration
        int number;
      //  String sayMyName;//her anlamlı kelimede baş harfler büyük ilk kelime kücük oluyor genelde

        //initialize or assigning
        number = 45;

        //Declaratio and assigning
        int number2 = 20;
        String syMySurname = "Altun";

        //example
        int num1,num2;
        int num3,num4 = 11022;
        int num5 = 7,num6 =8;

        System.out.println(num4+num5);
        //DataTypes
        //primitive types   //memory used   Range of values
        byte b;//               1 byte        -128 to 127
        short s;//              2 bytes       -32768 to 32767
        int i;//                4 bytes       -2147..... to 2147.....
        long l;//               8bytes        -....................  to ....................

        float f;//              4 bytes(32bit)       -.........
        double d;//             8 bytes(64bit)       -.........

        char c;//               2 bytes UTF-16 standardı geregi
        boolean bl;//           1bit


        b = -128;
        System.out.println(b);
        b = 127;
        System.out.println(b);
        s = 1000;
        s = -32768;
        s = 32767;
        System.out.println(s);
        i = -213468387; //uç değer değil dikkat edin
        i =2;
        System.out.println("i ="+i);
        l=3489554590080412784l;// int sınırlarını aşdığı için java L veya l ile sayının long tipinde bir değişkene
        //declare edileceğini belirtmemizi istiyor
        System.out.println(l);
        l=348955459;//burada ise int sınırlarını aşmadığı için hata vermiyor
        System.out.println(l);
        System.out.println("___________");

        //floating // decimal(ondalık) number default to double
        //float and double
        //expressing currency //banka hesaplarının gosteriminde kullanılan tipler
        //float 4byte | double 8 byte
        f=1.1234567f;
        d=1.234567;
        System.out.println("float ="+f+" "+"double ="+d);

        //Char
        char ch = 'A';
        System.out.println(ch);//a
        int ascii = ch;
        System.out.println("ascii ="+ascii);
    //    char chA = 65;
     //   int x = 65;

        char chA = 65;
        System.out.println("chA ="+chA);//A
        char cha = 97;
        System.out.println("chA = " + cha);//a
        char chZ =90;
        System.out.println("chZ = " + chZ);//Z
        char chz = 122;
        System.out.println("chz = " + chz);//z

        String A = "\u0041";
        System.out.println(A);

        //boolean ----- true ya da false
        bl=true;
        bl=false;
        System.out.println("bl ="+bl);



        int a = 10;
        int t = 20;
        boolean bln= a==t;
        System.out.println("bln ="+bln);//true


        int z = 30;
        bln = z == a+t;
        System.out.println("bln ="+bln);
    }
}
