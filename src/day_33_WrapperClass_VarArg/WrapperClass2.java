package day_33_WrapperClass_VarArg;

public class WrapperClass2 {
    public static void main(String[] args) {
        System.out.println("Character.isDigit('a') = " + Character.isDigit('a'));
        System.out.println("Character.isAlphabetic('a') = " + Character.isAlphabetic('a'));
        System.out.println("Character.isAlphabetic('a') = " + Character.isAlphabetic('a'));
        System.out.println("Character.isLetter('a') = " + Character.isLetter('a'));
        System.out.println("Character.isLetter('a') = " + Character.isLetter('5'));
        System.out.println("Character.isLetterOrDigit('5') = " + Character.isLetterOrDigit('a'));
        System.out.println("Character.isLetterOrDigit('5') = " + Character.isLetterOrDigit('5'));

        System.out.println("Character.isLowerCase('a') = " + Character.isLowerCase('a'));
        System.out.println("Character.isLowerCase('B') = " + Character.isLowerCase('B'));
        System.out.println("Character.isLowerCase('C') = " + Character.isLowerCase('C'));
        System.out.println("Character.isLowerCase('b') = " + Character.isLowerCase('b'));

        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.SIZE = " + Integer.SIZE);
        System.out.println("Integer.min(100,10) = " + Integer.min(100, 10));
        System.out.println("Integer.max(100,10) = " + Integer.max(100, 10));
        System.out.println("Integer.sum(100,10) = " + Integer.sum(100, 10));

        //String değer içerisindeki gömülü kelimeyi bulunuz
            String str="^+!j4546*/-a_|v-:!a ???()&+";
            String s="";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i))){

            }
        }
        System.out.println("s = " + s);

        String str2 ="|''11'*>>///M++>,,_//*e%%&/'-~~&&r//%<>/)h*>%//'9a+%^^^((b*><###a678* +%&&/))<+J>>>" +
                ">**56a##v**||;;;~~a~>>> 4500001||<<İ**##n**--//+%^^s>><<|*478a12%%n*" +
                "*-<<|||>>012345679--a**//##++34r``~~((ı[234]+||";
        for (int i = 0; i < str2.length(); i++) {
            if (Character.isAlphabetic(str2.charAt(i)) || str2.charAt(i)==' '){
                s+=str2.charAt(i);
            }
        }
        System.out.println("s = " + s);


        //          strx
//        A number is a mathematical object used to count, measure, and label.
//        The original examples are the natural numbers 1, 2, 3, 4, and so forth.

//        task1 -- string içindeki sayıların toplamını alan bir method oluşturnuz
//        task2 -- string içindeki sayıları bir aray çinde döndüren bir method yazın



//          stry
//        A number is a mathematical object used to count, measure, and label.
//        The original examples are the natural numbers 1, 2, 3, 4, and so forth.[1]
//        Numbers can be represented in language with number words. More universally,
//        individual numbers can be represented by symbols, called numerals; for example,
//        "5" is a numeral that represents the number five. As only a relatively small
//        number of symbols can be memorized,
//        basic numerals are commonly organized in a numeral system,
//        which is an organized way to represent any number.

//        Task3 -- String içindeki toplam character/dijit character/alphabethic character/letter
//        character sayılarını yazdıran bir method oluşturun
    }
}
