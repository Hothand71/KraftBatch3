package day_4_TypeCasting;

public class EscapeSeq {
    public static void main(String[] args) {
        System.out.println("Benim adım \t  mustafa kemal");// \t tab
        System.out.println("\\b benim görevim backspace yapmak örneğin: Mustafa Kemal\b");// \b konuldugu yerden backspace yapar
        System.out.println("\\n görevi konulduğu noktadan yeni satıra geçer. örneğin: \nBenim adım \nmustafa kemal \nsoyadım \naltun");// enter basar gibi
        System.out.println("\\r metne satır başı yaptırır. örneğin: \n Benim adım mustafa\rkemal soyadım altun ");//konuldugu yeri satır başı yapar öncesi silinir


        System.out.println("\'Ankara\'");//'ankara';
        System.out.println("\"Ankara\"");//"ankara";
        System.out.println("\\Ankara\\");//\ankara\;

        System.out.print("Merhaba dostlar\n");
        System.out.println("\nHoşgeldiniz dostlar\n");

    //Concatination
        String str="Hello";
        String str2="World";
        String str3=str+" "+str2;
        System.out.println("str3 = " + str3);
        System.out.println("str3 = " + str3+100);
        String str4=str3+100;
        System.out.println("str4 = " + str4);//hello world100
        System.out.println("str4 = " + str4+40);//hello world10040

        int i=50;
        String str5=str+i;
        System.out.println("str5 = " + str5);//Hello50

        //----------

        int y=75;
        System.out.println(str+i+y);//Hello5075
        System.out.println(i+y+str);//125Hello
        System.out.println(i+y+str+i+y);//125Hello5075
        System.out.println(i+y+str+(y+i));//125Hello125
        String str6 = i+y+str;
        System.out.println("str6 = " + str6);//125Hello
        System.out.println(""+i+y+str);//5075Hello

        int sum = i+y;
        System.out.println(str+sum);//Hello125

        //empty string vs null string
        String s="";//empty
        String s1;
        s1=null;


    }
}
