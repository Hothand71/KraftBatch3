package day_24_StringClassCont;

import java.util.Locale;
import java.util.Scanner;

public class StringTasksCont {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

    }


    public String trim(String str){
        return str.trim();
    }
    public static String dateStamp(String str){
        //way1
        String repl =str.replace("/","");
        String repl2= repl.replace(":","");
        String replace = repl2.replace(" ","");
        return replace;
        //way2
    }
    public static String datestamp2(String str){
        return str.replace("/","").replace(":","").replace(" ","");
    }
    public static int findFirstCharInSecond(String str,String str2){
       return str2.indexOf(str.charAt(0));
    }
    public static boolean a(String str){
       return true;
    }
    public static int findMySelectedIndex(String str){
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='y'||str.charAt(i)=='Y') {count++;}
         //way2 if (str.toLowerCase().charAt(i)=='y'){count++;}
        }
      //  return count;
        //way3
      return   str.length()-str.replace("y","").replace("Y", "").length();
    }
    public static String sesliOut(String str){
        String kelime="";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'){
                kelime+=str.charAt(i);
            }
        }
        return kelime;
    }
    public static void searchWord(String str){
     if (str.contains("sev")){
         System.out.println("ne güzel bir insan");
     }
     else {
         System.out.println("ok");
     }
    }
    public static String last3Word(String str,int j){
        String holder ="";
        for (int i = 0; i < j; i++) {
           holder +=str.substring(2,3);
        }
       return holder;
    }




    }

