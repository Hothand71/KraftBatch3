package review;

public class tasks2 {
    //task  //Kullanıcıdan bir dize sözcük alın ve yinelenen her karakteri kelimenizden
    //çıkartarak sonuç döndüren metodu yazınız. (Büyük küçük duyarlı)
    //Merhaba Merhab
    //Ananas Anas
    /*
    public static void main(String[] args) {
        System.out.println(repeaterStoper("Ananas"));
    }
    public static String repeaterStoper(String str){
        String result ="";
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            for (int j = 0; j < str.length(); j++) {
                if (c==str.charAt(j)&&!result.contains(String.valueOf(c))){
                    result+=c;
                }
            }
        }
        return result;
    }*/
//task //Kullanıcıdan bir kelime alan ve sonucunda yinelenen kelimeleri string
//olarak return eden methot yazınız.
//" Java " output:a
//" Javva " output:av
    /*
    public static void main(String[] args) {
        System.out.println(repeaterWordWriter("Derslerime cok calisiyorum"));
    }
    public static String repeaterWordWriter(String str){
        str=str.replace(" ","");
        String result="";
        for (int i = 0; i < str.length(); i++) {
            int counter=0;
            char c=str.charAt(i);
            for (int j = 0; j < str.length(); j++) {
                if (c==str.charAt(j)){
                    counter++;
                    if (counter>1&&!result.contains(String.valueOf(c))){
                        result+=c;
                    }
                }
            }
        }
        return result;
    }*/
//task //Kullanıcıdan bir kelime alın ve bu kelimenin içerindeki ünlü ve ünsüz harfleri
//ayrı ayrı ekrana yazan programı yazınız.
    /*
    public static void main(String[] args) {
        System.out.println(vowelsAndConsonants("Ankara"));
    }
    public static String vowelsAndConsonants(String str){
        String vowels="";
        String consonants="";
        str=str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char c =str.charAt(i);
            if ((c=='a'||c=='e'||c=='ı'||c=='i'||c=='o'||c=='ö'||c=='u'||c=='ü')&&(!vowels.contains(String.valueOf(c)))){
                vowels+=c;
            } else if (!consonants.contains(String.valueOf(c))&&!vowels.contains(String.valueOf(c))){consonants+=c;}
        }
        return "ünlü harfler:"+vowels+"\n"+"ünsüz harfler:"+consonants;
    }
*/
    //task  //Kullanıcıdan  min 3 harf olacak şekilde bir kelime alın ve bu kelimenin ilk 3
    //harfini kelimeden keserek sonuna ekleyin.
    //Merhaba habaMer
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("min 3 harf olacak şekilde kelime girin");
        System.out.println(firstThreeWord(sc.nextLine()));
    }
    public static String firstThreeWord(String str){
        if (str.length()<3){return "Hatalı giriş";}
        return str.substring(3)+str.substring(0,3);

    }*/
    //task Kullanıcıdan  min 3 harf olacak şekilde bir kelime alın ve bu kelimenin son 3
    //harfini kelimeden keserek kelimenin başına ekleyin.
    /*
    public static void main(String[] args) {
        System.out.println(lastOfThreeWordCutter("Merhaba"));
    }
public static String lastOfThreeWordCutter(String str){
        if (str.length()<3){
            return "HATALI GİRİŞ!";
        }
        return str.substring(str.length()-3)+str.substring(0,str.length()-3);
}*/
//Kullanıcıdan bir kelime alın ve bu kelimenin ilk benzersiz harfini bulun. (Büyük
//küçük harf gözardı edilecek.) Hiçbir harf benzersiz değil ise benzersiz harf yoktur
//ikazı versin.
/*
    public static void main(String[] args) {
        System.out.println(uniqueWord("karkas rotası"));
    }
    public static String uniqueWord(String str){
       String str2="";
       String str3="";
       str=str.replace(" ","");
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            str2=str.substring(i+1);
            str3=str.substring(0,i);
            if (!(str2.contains(String.valueOf(c)))&&!(str3.contains(String.valueOf(c)))){
                return String.valueOf(c);
            }
        }
        return "benzersiz karakter yoktur";
    }*/
    //Kullanıcıdan iki kelime alın ve bu kelimeler aynı harflerden oluşuyorsa(her harf
    //eşit sayıda içerecek,büyük küçük harf göz ardı edilecek) true oluşmuyorsa false
    //yazdırın. (anagram kelime ise)
    /*
    public static void main(String[] args) {
        System.out.println(anagramChecker("Selcuk", "Elyase"));

    }
    public static boolean anagramChecker(String str1,String str2){
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
      if (str1.length()>str2.length()||str2.length()>str1.length()){return false;}

        for (int i = str2.length(); i >0 ; i--) {
            String subStr1=str1.substring(0,i);
            String s=String.valueOf(subStr1.charAt(subStr1.length()-1));
            if (!str2.contains(s)){
                return false;
            }
        }
       return true;
    }*/
//Kullanıcıdan bir kelime alın ve ardı ardına tekrar eden harfleri döndüren metodu
//yazın.
    /*
    public static void main(String[] args) {
        System.out.println(ardiArdina("aabccccseeeeeefff"));
    }
    public static String ardiArdina(String str){
      String result="";
        for (int i = 1; i < str.length()-1; i++) {
            String subStr1=str.substring(i-1,i);
            String subStr2=str.substring(i+1,i+2);
            String s=String.valueOf(str.charAt(i));
            if ((subStr1.contains(s)||subStr2.contains(s))&&!result.contains(s)){
                result+=s;
            }
        }
        if (result.length()==0){
            return "ardı ardına tekrar eden harf yoktur";
        }
        return result;
    }*/
    //Kullanıcıdan 1 ila 4 harf olacak şekilde 2 kelime alın, 1. veya 2. kelimeyi
    //girdiğinde hatalı giriş yaparsa uyarı verin ve kullanıcıya düzeltme imkanı verin.
    //Her kelime için 3 kere hatalı giriş yaparsa programı sonlandırın. Kullanıcı doğru
    //giriş yaparsa 2 kelimeyi arada boşluk olacak şekilde sadece concat() metodu ile
    //birleştirerek yazdırın.
/*
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(firstAndSecond(sc.nextLine(), sc.nextLine()));

    }
    public static String firstAndSecond(String str1,String str2) {
        String result="";
        Scanner sc = new Scanner(System.in);
        int hataSayac = 0;
        while ((str1.length() >4 || str1.length() < 1) || (str2.length() > 4 || str2.length() < 1)) {
            hataSayac++;
            System.out.println("kelimeler hatalı lütfen geçerli kelimeler giriniz");
            if (hataSayac == 3) {
                return "Hatalı giriş";
            }
            str1 = sc.nextLine();
            str2=sc.nextLine();
        }
       result= str1.concat(" "+str2);
        return result;
    }
*/
//Kullanıcıdan bir kelime alın ve bu kelimenin ilk benzersiz harfini bulun. (Büyük
//küçük harf gözardı edilecek.) Hiçbir harf benzersiz değil ise benzersiz harf yoktur
//ikazı versin.
    /*
    public static void main(String[] args) {
        System.out.println(firstSpecialWord("Karkas rotası"));
    }
    public static char firstSpecialWord(String str){
        str= str.toLowerCase();
        str=str.replace(" ","");
        for (int i = 0; i <str.length(); i++) {
            String subStr=str.substring(0,i).concat(str.substring(i+1));
            char c =str.charAt(i);
            System.out.println(subStr);
            if (!subStr.contains(String.valueOf(c))){
                return c;
            }

        }
        System.out.println("hiçbir harf benzersiz değildir");
        return ' ';
    }*/
    //Kullanıcıdan bir kelime alın ve bu kelimenin tersten okunuşu kelime ile aynı ise
    //true değil ise false döndüren metot yazınız.
    /*
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while (true){
            System.out.println(tersoWord(sc.nextLine()));
        }

    }
    public static boolean tersoWord(String str){
        str=str.toLowerCase();
        String reStr="";
        for (int i = str.length()-1; i >=0 ; i--) {
            char c= str.charAt(i);
            reStr+=c;

        }
        if (reStr.equals(str)){
            return true;
        }
        return false;
    }*/
    //Kullanıcıdan bir input alın ve bu inputun içerisinde kaç adet sev bulunduğunu
    //ekrana yazdırın.
    /*
    public static void main(String[] args) {
        System.out.println(sevWordCount("Sev seni seveni , sevmek güzeldir."));
        System.out.println(sevWordCount("Sevmek veya sevmemek"));
        System.out.println(sevWordCount("Seni seviyorum"));
    }
    public static int sevWordCount(String str){

        int sayac=0;
        str=str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            while (str.contains("sev")){
               str=str.substring(0,str.lastIndexOf("sev"));
               sayac++;
            }
        }
        return sayac;
    }*/
    //Bursa ile Ankara kelimeli cümlenin içerinde aynı sayıda dönüyorsa true farklı
    //sayılarda dönüyorsa false yazdıran metodu yazınız.
    /*
    public static void main(String[] args) {
        System.out.println(ankaraAndBursa("Ankara ile Bursa arası 500 km."));
        System.out.println(ankaraAndBursa("Ankara Bursa kadar yeşil değil. Bursa bir başka. "));
        System.out.println(ankaraAndBursa("İstanbul çok uzak  "));
    }
    public static boolean ankaraAndBursa(String str){
        str=str.toLowerCase();
        if (!str.contains("ankara")||!str.contains("bursa")){return false;}
        while(str.contains("ankara")&&str.contains("bursa")){
            str=str.substring(str.lastIndexOf("ankara")+1,str.lastIndexOf("bursa"));
        }
      if (str.contains("ankara")||str.contains("bursa")){return false;}
        else return true;
    }*/
    //Kullanıcıdan bir kelime alın ve sonu acak ile bitiyorsa true bitmiyorsa false
    //döndüren metodu yazdırın.
    /*
    public static void main(String[] args) {
        System.out.println(lastOfAcak("Kullanacak "));
        System.out.println(lastOfAcak("Zamlanacak "));
        System.out.println(lastOfAcak("Farkındalık"));
        System.out.println(lastOfAcak("Farkında "));

    }
    public static boolean lastOfAcak(String str){
        String param="acak";
        str=str.toLowerCase();
        str=str.replace(" ","");
        if (str.lastIndexOf(param)==(str.length()-param.length())){return true;}
        return false;
    }
    */
    //Kullanıcıdan bir kelime alın ve bu kelimenin içerindeki harf sayılarını başına
    //yazarak ekrana döndürün.(büyük küçük harfler göz ardı edilecek)
    /*
    public static void main(String[] args) {
        System.out.println(wordCountWithWord("Merhaba"));
        System.out.println(wordCountWithWord("Seni seviyorum"));
    }
    public static String wordCountWithWord(String str){
        String result="";
        str=str.toLowerCase();
        str=str.replace(" ","");
        String str2=str;
        for (int i = 0; i < str.length(); i++) {
            int count=0;
            String s=String.valueOf(str.charAt(i));
            while(str2.contains(s)){
                count++;
                str2=str2.replaceFirst(s,"");
            }if (!result.contains(s)){
                result+=count+s;
            }
        }
        return result;
    }*/
    //Kullanıcıdan bir dize sözcük alın ve en çok harfi döndüren metodu yazınız.
    /*
    public static void main(String[] args) {
        System.out.println(tooMuchWord("eeemmmsssssssssshhhhhhhhhsss"));
        System.out.println(tooMuchWord("aaaaaaabbcccc"));
        System.out.println(tooMuchWord("Merhaba"));
    }
    public static String tooMuchWord(String str) {
        String result = "";
        str = str.toLowerCase();
        str = str.replace(" ", "");
        String strNew = str;
        int sayac2=0;
        for (int i = 0; i < str.length(); i++) {
            int sayac=0;
            String s= String.valueOf(str.charAt(i));
            while(strNew.contains(s)){
                sayac++;
               strNew= strNew.replaceFirst(s,"");
            }
            if (sayac>sayac2){
               sayac2=sayac;
                result=s;
            }
        }
        return result;
    }*/

}
