package review;

public class String_Class_Method {
    public static void main(String[] args) {
        String str1 ="Merhaba Ben Java Öğreniyorum";


        //Length(uzunluk) seçili string değerin uzunlugunu verir terim sayısını. empty ise 0 verir e 1 den baslayan bi sayı ile
        System.out.println(str1.length());

        //CharAt() seçili charı getirir sadece.
        System.out.println(str1.charAt(3));
        System.out.println(str1.charAt(str1.length()-1));

        //toLowerCase() string değeri komple küçük harfle değerlendirir
        System.out.println(str1.toLowerCase());
        System.out.println(str1);

        //toUpperCase() string değeri büyük harfli halde değerlendirir
        System.out.println(str1.toUpperCase());
        System.out.println("- - - - -- - -- - - -");

        //concat(birleştirmek) çağrılan iki stringi birleşmiş halini değerlendirir.
        String str2="fsociety";
        System.out.println(str1.concat(" "+"-"+str2));

        //contains() (içerir) Bir string değer içinde başka bir string değeri aratırken
        //kullanabileceğimiz bir method dur. Boolean değer döndürür. Eğer
        //aratılan string değeri bulursa true bulamazsa false döndürür.

        System.out.println(str1.toLowerCase().contains("java"));//true
        if ((str1.toLowerCase().contains("ben"))){
            System.out.println("ne kadar 'ben'cil");
        }
      if (str1.toLowerCase().contains(" ")==true){
          System.out.println("cümlede boşluk var");
      }
      if (str2.toLowerCase().contains(" ")==false){
            System.out.println("cümlede boşluk yok");
        }
      System.out.println("- - - - - - - - - - ");

      //trim(budamak) String değerin önündeki ve arkasındaki boşlukları alır. Ve stringin yeni halini
        //döndürür. Dikkat edin! String in önünde ve arkasında bir boşluk varsa length
        //kısalacaktır.
        //Ancak string değerin ilk ve son karekteri arasındaki boşlukları almaz.

        String str3=" kemal kemal kemal ";
        System.out.println(str3);
        String str4=str3.trim();
        System.out.println(str4);

        //replace() kelimelerin yerlerini değiştirir.

        System.out.println(str1.toLowerCase().replace("java","html"));
        System.out.println(str1);

        //indexOf() yazdıgımız kelimenin string içindeki kısmının başındaki index numarasını verir eğer bulamazsa -1 döndürür
        String str5="javayı seviyor muyum";
        System.out.println(str5.indexOf("sev"));
        str5="javayı sev sev seviyor muyum";
        System.out.println(str5.indexOf("sev"));


        //equals()  equalsIgnorecase() ignore aldırmamak/ equals eşittir demek/
        //2 string in değerlerinin aynı olup olmadığını kontrol eder. Tam bir
        //eşleşme söz konusu ise true döndürür.Aksi halde false döndürür.

            String equ1="aman aman";
            String equ2="amanda aman";
            String equ3="AmandA aMan";
            String equ4= new String("aman aman");

        System.out.println(equ1.equals(equ2));//false
        System.out.println(equ1.equals(equ1));//true
        if (equ3.equalsIgnoreCase(equ2)){System.out.println(true);}//true
        if (equ1.equals(equ4)){System.out.println(true);}//true
        if (equ1!=equ4){System.out.println(false);}//false

        //starsWith()endsWithsString değerin başındanve sonundan karakterkontrolü yapar.Eşleştirme yaptığı hersıralama için truedöndürürken.
        // Sıralamadakarakteri bulamazsa falsedöndürür. Boşluklara/duyarlı olduğuna dikkat//edin. Çünkü boşlukta birkarakterdir.

        String yazi="Merhaba arkadaşlar bu java çok eğlenceli gerçekten";

        System.out.println(yazi.startsWith("M"));//true
        System.out.println(yazi.startsWith("er"));//false
        System.out.println(yazi.endsWith("ten"));//true
        System.out.println(yazi.startsWith("mer"));//false
        System.out.println(yazi.toLowerCase().startsWith("mer"));//true

        //substring() Girilen index numarasından itibaren stringin sonuna kadar olan bölümü döndürür.
        //Eğer son index değeri de girilirse ona kadar olan bölümü döndürür.

        System.out.println(yazi.substring(1,4));//erh
        System.out.println(yazi.substring(0,yazi.length()/2));//Merhaba arkadaşlar bu jav




    }


}
