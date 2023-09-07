package review_2;

public class wrapperClass {

    public static void main(String[] args) {
        /*
        int x=5;
        Integer y = 15;
        Character c = '5';
        Character c1 = 's';
        System.out.println(y.toString()+y);
        System.out.println(y+y);
        String strNum="125";
        Integer z=Integer.parseInt(strNum);
        System.out.println(z);
        Integer integer=Integer.valueOf(strNum);
        System.out.println(integer);
        //Character.isDigit() char değeri sayı mı diye kontrol eder true flase döndürür
        System.out.println(Character.isDigit(c)); //true
        System.out.println(Character.isDigit(c1));//false
        //Character.isLetter() char değeri harf mi diye kontrol eder true flase döndürür
        System.out.println(Character.isLetter(c));//false
        System.out.println(Character.isLetter(c1));//true
        //Character.isAlphabetic de letter ile aynı ama tüm alfabeleri kapsıyor. letter sadece latin alfabesini kapsıyor.
        //şu an ikiside tüm alfabeleri kapsıyor

*/;
        String str = "^+!j4546*/-a_|v-:!a ???()&+";
        String str2 ="|''11'*>>///M++>,,_//*e%%&/'-~~&&r//%<>/)h*>%//'9a+%^^^((b*><###a678* +%&&/))<+J>>>" +
                ">**56a##v**||;;;~~a~>>> 4500001||<<İ**##n**--//+%^^s>><<|*478a12%%n*" +
                "*-<<|||>>012345679--a**//##++34r``~~((ı[234]+||";
        String resultStr="";
        String resultStr2="";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))){resultStr+=str.charAt(i);}
        }for (int i = 0; i < str2.length(); i++) {
            if (Character.isLetter(str2.charAt(i))||str2.charAt(i)==' '){resultStr2+=str2.charAt(i);}
        }
        System.out.println(resultStr);
        System.out.println(resultStr2);


    }

}
