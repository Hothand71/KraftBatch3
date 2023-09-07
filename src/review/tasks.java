package review;

public class tasks {
    //task1
   /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(Length(sc.nextLine()));

    }
    public static int Length(String str){
       return str.length();
    }
*///task2
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("önce ad sonra soyad giriniz");
        System.out.println(karakterSayisi(sc.nextLine(), sc.nextLine() ));

    }
    public static int karakterSayisi(String str1,String str2){
        return (str1.concat(str2)).length();
    }
*///task3
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("önce ad sonra soyad giriniz");
        System.out.println(wordUpper(sc.nextLine(), sc.nextLine()));
    }
    public static String wordUpper(String str, String str1){
      return  str.concat(" "+str1).toUpperCase();
    }*/
    //task4
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(lastOfIndex(sc.nextLine()));
    }
    public static char lastOfIndex(String str){
       return str.charAt(str.length()-1);
    }*/
    //task5
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }*/
    //task6
   /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (i%2==0){
                System.out.print(str.toUpperCase().charAt(i));
            }else System.out.print(str.toLowerCase().charAt(i));
        }
    }
    */
    //task7
  /*  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kelime gir");
        String str1=sc.nextLine();
        System.out.println("Kelime gir");
        String str2=sc.nextLine();
        System.out.println("Kelime gir");
        String str3=sc.nextLine();
        int a= Math.max(str1.length(),Math.max(str2.length(),str3.length()));
        String max="";
        if (a==str1.length()){
            max=str1;
        } else if (a==str2.length()){
            max=str2;
        } else {
            max= str3;
        }
        String min="";
        int b= Math.min(str1.length(),Math.min(str2.length(),str3.length()));
        if (b==str1.length()){
            min=str1;
        } else if (b==str2.length()){
            min=str2;
        } else {min= str3;}
        String mid="";
        if (max.equals(str1)||min.equals(str1)){
            if (max.equals(str2)||min.equals(str2)){
                mid=str3;
            } else mid=str2;
        } else if (max.equals(str3)||min.equals(str3)) {
            if (max.equals(str2)||min.equals(str2)){
                mid=str1;
            }else mid=str2;
        }
   System.out.println(max.concat(" "+mid+" "+min));

    }*/
//task
  /*public static void main(String[] args) {
      System.out.println(trimM(" Kemal  "));
  }

    public static String trimM(String str){
        return str.trim();
    }
*/
//task2
 /* public static void main(String[] args) {
      String str="18/10/2022 20:50:55";
      System.out.println(str.replace("/", "").replace(":", "").replace(" ", ""));

  }*/
//task
 /* public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      String str1= sc.nextLine();
      String str2= sc.nextLine();
      System.out.println(str2.indexOf(str1.charAt(0)));
  }
  */
    //tasks
    /*
  public static void main(String[] args) {
      System.out.println(letterCheck(cumleGir()));
  }
    public static String cumleGir(){
      Scanner sc = new Scanner(System.in);
      String cumle=sc.nextLine();
      return cumle;
    }
    public static boolean letterCheck(String str){
      String str2="0123456789+*-/";
        for (int i = 0; i < str2.length(); i++) {

            for (int j = 0; j <str.length() ; j++) {
                if (str.charAt(j)==str2.charAt(i)){
                    System.out.println("Matematiğe ne kadar ilgili");
                    return true;
                }
            }
        }
        System.out.println("Matematiğe ilgili değil");
        return false;
    }*/
    //tasks
  /*
    public static void main(String[] args) {
        String str="javayı seviyor muyum";
        int result=0;
      for (int i = 0; i < str.length(); i++) {
        if (String.valueOf(str.charAt(i)).equalsIgnoreCase("y")){
          result++;
        }
      }
      System.out.println("y harfi sayısı:"+result);
    }

*/

    /* public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String str=sc.nextLine();
         String str2="";
         for (int i = 0; i < str.length(); i++) {
             if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'){
                 str2=str2+String.valueOf(str.charAt(i))+",";
             }
         }
         System.out.println(str2.length()-1);
     }
 *///task
/*
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Kullanıcı adı ve şifre giriniz");
       System.out.println(login(sc.nextLine(), sc.nextLine()));
   }
   public static String login(String str,String str2){
       if (str.isEmpty()==true||str2.isEmpty()==true){return "Password ve username alanı boş olamaz.";}
       else if (str2.length()<8) {return "password 8 karakterden az olamaz"; }
       else if (str.length()<3) {return "Username 3 karakterden az olamaz. "; }
       return "Giriş yapıldı";

   }
   */
    //TASK
    /*
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String str=sc.nextLine();
       System.out.println(lovelyPersonCheck(str));
   }
   public static String lovelyPersonCheck(String str){
       if (str.contains("sev")){
           return "ne hoş bir insan";
       }
       return null;
   }
*/
    //task
    /*
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("İsminizi giriniz:");
       String str=sc.nextLine();
       last3Repeater(str);

   }
   public static void last3Repeater(String str){
       for (int i = 0; i < 3; i++) {
           System.out.print(str.substring(str.length() - 3));
       }

   }
*/
    //task
   /*public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("İsminizi giriniz:");
       String str=sc.nextLine();
       System.out.println(middle3Repeater(str));
   }
   public static String middle3Repeater(String str){
     return   str.substring(str.length()/2-1,str.length()/2+2);
   }
   */
    //task
    /*
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("İsminizi giriniz:");
       String name=sc.nextLine();
       String surname=sc.nextLine();
       System.out.println(shorterName(name, surname));
   }
   public static String shorterName(String name,String surname){
       int min=Math.min(name.length(),surname.length());
       if (min==name.length()){
          return name+surname.substring(0,name.length());
       } else
         return surname+name.substring(0,surname.length());
   }
*/
    //task
   /*
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("İsminizi giriniz:");
       String name=sc.nextLine();
       String surname=sc.nextLine();
       System.out.println(reNamer(name, surname));
   }
   public static String reNamer(String name,String surname){
       if (surname.contains(name.substring(0,1))){
        return surname.replace(name.substring(0,1),"");
       }
       return surname;
   }
*//*
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("İsminizi giriniz:");
       String name=sc.nextLine();
       String surname=sc.nextLine();
       System.out.println(nickNamer(name, surname));

   }
   public static String nickNamer(String name,String surname){
       return name.toUpperCase().substring(0,3)+surname.toUpperCase().substring(0,3);
   }
   */
    //task
   /*
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("İsminizi giriniz:");
       String str1=sc.nextLine();
       String str2=sc.nextLine();
       System.out.println(firstAndLast(str1, str2));
   }
   public static String firstAndLast(String str1,String str2){
       if (str1.length()>str2.length()){
          return str2+str1+str2;
       }    else return str1+str2+str1;
   }
   */
    //task
    /*
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("İsminizi giriniz:");
       String str1=sc.nextLine();
       System.out.println(renameReverse(str1));
   }
   public static String renameReverse(String str1){
       String result="";
       for (int i = 1; i <= str1.length(); i++) {
         result+=str1.charAt(str1.length()-i);
       }
       return result;
   }
   */
    //task
 /*  public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("İsminizi giriniz:");
       String str1 = sc.nextLine();
       System.out.println(sesli(str1, "K"));
   }
   public static String sesli(String str,String param){
       String result="";
       for (int i = 0; i < str.length(); i++) {
           char a= str.charAt(i);
           if (a=='a'||a=='e'||a=='ü'){
               result+=param;
           }else
           result+=a;
       }
       return result;
   }*/
    // task
    /*
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println(top3String(sc.nextLine()));
   }
   public static String top3String(String str){
       String result="";
       if (str.length()<=3)
           return str;
       for (int i = 0; i < 3; i++) {
           result+=str.charAt(i);
       }
       return result;
   }*//*
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println(allSpaceHounder(sc.nextLine()));
   }
   public static String allSpaceHounder(String str){
      return "%"+str.replace(" ","%")+"%";
   }*/
    /*
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println(letterChanger(sc.nextLine(), sc.nextLine().charAt(0), sc.nextLine().charAt(0)));

   }
   public static String letterChanger(String str,char word,char param){
       String result="";
       int j=0;
       for (int i = 0; i < str.length(); i++) {
           if (str.charAt(i)==word&&j==0){
               result+=param;
               j++;
           }
           else result+=str.charAt(i);
       }
    return result;
   }*/
    /*
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println(threeTimeRepeater(sc.nextLine()));
   }
   public static String threeTimeRepeater(String str){
       String result="";
       for (int i = 0; i < str.length(); i++) {
           for (int j = 0; j < 3; j++) {
               result+=str.charAt(i);
           }
       }
       return result;
   }*/
    /*
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println(howManyWords(sc.nextLine(), sc.nextLine().charAt(0)));
   }
   public static int howManyWords(String str,char word){
       int result=0;
       for (int i = 0; i < str.length(); i++) {
           if (str.toLowerCase().charAt(i)==word){
               result++;
           }
       }
       return result;
   }*/
    /*
   public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.println(selectedWordDeleter(sc.nextLine(), sc.nextLine().charAt(0)));
   }
   public static String selectedWordDeleter(String str,char word){
       String result="";
       for (int i = 0; i < str.length(); i++) {
           if (str.charAt(i)!=word){
               result+=str.charAt(i);
           }
       }
       return result;
   }*/
    /*
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println(kinCheck(sc.nextLine()));
   }
   public static boolean kinCheck(String str){
       if (str.startsWith("kin")){
        return true;
       }
       else return false;

   }
    */
    /*
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println(wordFantesy(sc.nextLine(), sc.nextLine()));
   }
   public static String wordFantesy(String str,String str2){
       String result="";
       if (str.length()<=str2.length()){
           for (int i = 0; i < 2; i++) {
               result+=str;
           }
           for (int i = 0; i < 30; i++) {
               result+=str2;
           }
           for (int i = 0; i < 2; i++) {
               result+=str;
           }
       }
       else{ for (int i = 0; i < 2; i++) {
           result+=str2;
       }
       for (int i = 0; i < 30; i++) {
           result+=str;
       }
       for (int i = 0; i < 2; i++) {
           result+=str2;
       }}
       return result;
   }*//*
   public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.println(first5Words(sc.nextLine()));
   }
   public static String first5Words(String str){
       String dot="";
       if (str.length()>=5)
        return str.substring(0,5);
       else
           for (int i = 0; i < 5-str.length(); i++) {
               dot+=".";
           }
           return str+dot;
   }*/
    //Kullanıcıdan bir kelime alın ve bu kelimenin ilk 2 harfi sonunda yer alıyorsa true
    //almıyorsa false yazdırın.
    /*
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println(first2end2(sc.nextLine()));
   }
   public static boolean first2end2(String str){
       if (str.substring(0,2).equals(str.substring(str.length()-2)))
           return true;
       return false;
   }*/
    //Kullanıcının konsoldan ad ve soyad bilgilerini konsoldan alın
    //Ekrana "Soy isminiz ..(soyad).. dır."  Yazan metodu yazınız.
/*
   public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.println("Soy isminiz "+surnameFounder(sc.nextLine()).toUpperCase()+".");
   }
   public static String surnameFounder(String str){
       String str2=str.trim();
       for (int i = str2.length()-1; i >0 ; i--) {
           if (str2.charAt(i)==' '){
               return str2.substring(i+1);
           }
       }
       return str2;
   }
*/
    //Kullanıcıdan bir dize sözcük alın ve yinelenen her karakteri kelimenizden
    //çıkartarak sonuç döndüren metodu yazınız. (Büyük küçük duyarlı)
/*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println(oneTimeUsageWords(sc.nextLine()));
    }

    public static String oneTimeUsageWords(String str) {
        str=str.toLowerCase();
        str=str.replace(" ","");
        String result = String.valueOf(str.charAt(0));
        for (int i = 0; i < str.length(); i++) {
            int a=0;
            for (int j = 0; j < result.length(); j++) {
                if (result.charAt(j)==str.charAt(i)){
                    a++;
                }

            }
            if (a==0){result+=str.charAt(i);
            a=0;}else a=0;
        }
       
        return result;
    }
*/
   /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen bir sözcük girin: ");
        String word = sc.next();
        sc.close();
        String uniqueChars = "";
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (!uniqueChars.contains(String.valueOf(c))) {
                uniqueChars += c;
            }
        }

        System.out.println(uniqueChars);
    }
    public static String repeatWordCheck(String str) {
        return str;
    }
*/

}
