package review_2;

public class arrays_task2 {
    //Split() method ile bir string i
    //parçalara ayırıp bir array a
    //assign edebiliriz
    /*
    public static void main(String[] args) {
        String str="merhaba java insanları";
        String str2="merhaba java insanları";

        String[] sArry=str.split(" ");
        String[] sArry2=str2.split("");
        System.out.println(Arrays.toString(sArry));
        System.out.println(Arrays.toString(sArry2));
    }
*/
    //substring gibi ama arrayler için olanı//aralığın kopyası copyOfRange();
    /*
    public static void main(String[] args) {
        String str="merhaba java insanları";
        String str2="merhaba java insanları";

        String[] strArray={"yunus","murat","ali","ekrem","mustafa","osman"};
        String[] strArray2= Arrays.copyOfRange(strArray,3,strArray.length);
        System.out.println(Arrays.toString(strArray2));
        System.out.println(Arrays.toString(Arrays.copyOfRange(strArray, 3, strArray.length)));
    }
*//*
    //sort() kücükten büyüğe sıralar//Arraydeki sayısal elementleri ascending yani artan şekilde sıralar
    public static void main(String[] args) {
        int[] arry={7,6,1,9,45,10,65,3,8};
        System.out.println(Arrays.toString(arry));
        Arrays.sort(arry);
        System.out.println(Arrays.toString(arry));
        Arrays.sort(arry,0,5);
        System.out.println(Arrays.toString(arry));
    }*/

    //fill() Arraydeki elementleri parametre olarak belirtilen değerle doldurur.
    /*
    public static void main(String[] args) {
        int[] arry = new int[5];
        arry[0]=8;
        arry[1]=9;
        arry[2]=5;
        arry[3]=7;
        arry[4]=4;
        System.out.println(Arrays.toString(arry));
        Arrays.fill(arry,0,2,777);
        System.out.println(Arrays.toString(arry));
        Arrays.fill(arry,1,2,111);
        System.out.println(Arrays.toString(arry));
    }*///tasks
    //«merhaba java insanları bugün nasılsınız» gibi bir cümleyi her kelime bir
    //element olacak şekilde bir array a dönüştüren bir method yazın.
    /*
    public static void main(String[] args) {
        System.out.println(Arrays.toString(allWordArry("merhaba java insanları bugün nasılsınız")));
    }
    public static String[] allWordArry(String arr){
        String[] arry=arr.split(" ");
        return arry;
    }*/
    //«kayısı, armut, üzüm, çilek, nar» cümlesinde ki meyve isimlerini her biri bir
    //element olacak şekilde bir array a atın. Elementlerden 5 den az harfi olan
    //varsa onun yerine armut atayın.
    /*
    public static void main(String[] args) {
        System.out.println(Arrays.toString(allWordArry("kayısı, armut, üzüm, çilek, nar")));
    }
    public static String[] allWordArry(String str){
        String[] arry=str.split(", ");
        for (int i = 0; i < arry.length; i++) {
            if (arry[i].length()<5){
                Arrays.fill(arry,i,i+1,"armut");
            }
        }
        return arry;
    }*/
    //«elma, armut, üzüm, çilek, nar» cümlesinde ki meyve isimlerini her biri bir
    //element olacak şekilde bir array a atın. İlk ve son idexi swaping yapın.
   /*
    public static void main(String[] args) {
        String str="elma, armut, üzüm, çilek, nar";
        String[] arry= str.split(", ");
        String str2=arry[arry.length-1];//way1
        arry[arry.length-1]=arry[0];
        arry[0]=str2;
        System.out.println(Arrays.toString(arry));
        str2=arry[0];//way2
        Arrays.fill(arry,0,1,arry[arry.length-1]);
        Arrays.fill(arry,arry.length-1,arry.length,str2);
        System.out.println(Arrays.toString(arry));
    }*/
    //«merhaba java insanları bugün nasılsınız» gibi bir cümlenin ikinci kelimesinin
    //harflerinden bir döndüren method yazın.
    /*
    public static void main(String[] args) {
        System.out.println(Arrays.toString(ikinciKelimeyiDondur("merhaba java insanları bugün nasılsınız")));
    }
    public static String[] ikinciKelimeyiDondur(String str){
        String[] arr=str.split(" ");
        String[] result=arr[1].split("");
        return result;
    }*/
    //Bir method yazın int n parametre olarak alsın. n değeri kadar sayıları sıralı bir
    //biçimde bir array içine yerleştirsin. n = 5  Exm: [0,1,2,3,4]
    /*
    public static void main(String[] args) {
        System.out.println(Arrays.toString(parametricArray(5)));
    }
    public static int[] parametricArray(int n){
        int[] arry=new int[n];
        for (int i = 0; i < n; i++) {
            arry[i]=i;
        }
        return arry;
    }*/
    //Bir sayı dizisinin en büyük veen küçük element lerinin aritmetik ortalamasını
    //veren bir method yazın.
    /*
    public static void main(String[] args) {
        int[] arry={7,6,1,9,45,10,65,3,8};
        System.out.println(maxAndMinAvarage(arry));

    }
    public static int maxAndMinAvarage(int[] arry){
        int max=arry[0];
        int min=arry[0];
        for (int i = 0; i < arry.length; i++) {
            if (arry[i]>max){
                max=arry[i];
            }if (arry[i]<min){
                min=arry[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
        return (max+min)/2;
    }*/
    //Bir sayı dizisinin en küçük harfi ne ise sayı dizisini onunla dolduran bir
    //method yazın.
    /*
    public static void main(String[] args) {
        int[] arry={7,6,1,9,45,10,65,3,8};
        System.out.println(Arrays.toString(littleCountMachine(arry)));
    }
    public static int[] littleCountMachine(int[] arry){
        int min=arry[0];
        for (int j : arry) {
            if (j < min) {
                min = j;
            }
        }
        int[] result=new int[arry.length];
        for (int i = 0; i < arry.length; i++) {
            result[i]=min;
        }
        return result;
    }*/
    //Bir sayı dizisinin en küçük harfi ne ise sayı dizisini (en büyük değer hariç)
    //onunla dolduran bir method yazın.
    /*
    public static void main(String[] args) {
        int[] arry={7,6,1,9,45,10,65,65,65,8};
        System.out.println(Arrays.toString(enBuyukHaricEnKucuk(arry)));
    }
    public static int[] enBuyukHaricEnKucuk(int[] arr){
        int min=arr[0];
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min=arr[i];
            }if (arr[i]>max){
                max=arr[i];
            }
        }
        int[] result=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=max){
                result[i]=min;
            }else result[i]=max;
        }
        return result;
    }*/
    //«merhaba java insanları bugün nasılsınız» cümlesini [merhaba, java,
    //insanları] ve [bugün, nasılsınız] şeklinde 2 ayrı array a convert edin.
    /*
    public static void main(String[] args) {
        String str="merhaba java insanları bugün nasılsınız";
        String[] arr=str.split(" ");
        String[] arry= Arrays.copyOfRange(arr,0,3);
        String[] arry2= Arrays.copyOfRange(arr,3,arr.length);
        System.out.println(Arrays.toString(arry));
        System.out.println(Arrays.toString(arry2));
    }*/
  /*  public static void main(String[] args) {
        int[][] numbers = new int[5][3];

        numbers[0][0]=10;
        numbers[0][1]=20;
        numbers[0][2]=30;

        numbers[1][0]=15;
        numbers[1][1]=125;
        numbers[1][2]=5;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println();
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j]+" ");
            }
        }

        int[][] numbers2 = new int[4][];
        numbers2[0]=new int[4];
        numbers2[1]=new int[3];
        numbers2[0][0]=10;
        numbers2[0][1]=20;
        numbers2[0][2]=30;
        numbers2[0][3]=300;

        numbers2[1][0]=15;
        numbers2[1][1]=125;
        numbers2[1][2]=5;
        for (int i = 0; i < numbers2.length; i++) {
            System.out.println();
            for (int j = 0; j < numbers2[i].length; j++) {
                System.out.print(numbers2[i][j]+" ");
            }
    }
}*/
    /*
    public static void main(String[] args) {
        int[][] number={{100,110,120,130},{115,125,165}};
        for (int i = 0; i < number.length; i++) {
            System.out.println();
            for (int j = 0; j < number[i].length; j++) {
                System.out.print("|"+number[i][j]+"|");
            }
        }*/
    //Array’in içerisindeki tüm sayıların toplamını veren metodu yazınız..
    /*
    public static void main(String[] args) {
    int[] arry={5,6,9,5,1,5,6,43,52};
        System.out.println(arrySum(arry));
    }
    public static int arrySum(int[] arr){
        int result=0;
        for (int i:arr
             ) {
            result+=i;
        }
        return result;
    }*/
    // Array’in içerisindeki tüm çift sayıların toplamını veren metodu yazınız.
    /*
    public static void main(String[] args) {
        int[] arry={5,6,9,5,1,5,6,4,5};
        System.out.println(sumArryOfDouble(arry));
    }
    public static int sumArryOfDouble(int[] arr){
        int result=0;
        for (int i:arr
             ) {
            if (i%2==0){result+=i;}

        }
        return result;
    }*/
    //Array’in içerisindeki tüm 3 sayılarının toplamını veren metodu yazınız.
    /*
    public static void main(String[] args) {
        int[] arry= new int[8];
        arry[0]=3;
        arry[1]=2;
        arry[2]=1;
        arry[3]=3;
        arry[4]=5;
        arry[5]=2;
        arry[6]=3;
        arry[7]=3;
        System.out.println(allThreeCountsOnArry(arry));
    }
    public static int allThreeCountsOnArry(int[] arry){
        int result=0;
        for (int i:arry
             ) {
            if (i==3){
                result+=i;
            }
        }
        return result;
    }*/
    //Array’in içerisindeki en büyük ve en küçük sayıyı bulan metodu yazınız. (Arrays.sort kullanılmayacak)
    /*
    public static void main(String[] args) {
        int[] arry={5,96,9,54,85,5,6,56,9,8,5,5};
        System.out.println(arraysOfMaxAndMin(arry));
    }
    public static String arraysOfMaxAndMin(int[] arry){
        int min=arry[0];
        int max=arry[0];
        for (int i:arry
             ) {
            if (min>i){min=i;}
        if (max<i){max=i;}
        }
        return "en küçük değer:"+min+"\n"+"en büyük değer:"+max;
    }*/
    //Array’in içerisindeki en küçük sayıyı tüm indekslere atayan bir metod yazınız.(Arrays.sort ve Arrays.fill kullanılmayacak)
    /*
    public static void main(String[] args) {
        int[] arry={5,96,9,54,85,5,6,56,9,8,5,5};
        System.out.println(Arrays.toString(theSmallestArry(arry)));
    }
    public static int[] theSmallestArry(int[] arr){
        int min=arr[0];
        for (int i:arr
             ) {
            if (min>i){min=i;}
        }
        Arrays.fill(arr, min);
        return arr;
    }*/
    //2 adet integer sayı alan ve arasındaki sayıları indekslere atayan metodu yazınız.
    /*
    public static void main(String[] args) {
        System.out.println(Arrays.toString(numbersBetweenParameters(5, 18)));
    }
    public static int[] numbersBetweenParameters(int param1,int param2){
        int max=Math.max(param1,param2);
        int min=Math.min(param1,param2);
        int[] arry=new int[max+1-min];
        for (int i = 0; i < arry.length; i++) {
            arry[i]=min;
            min++;
        }
        return arry;
    }*/
    //2 adet array kabul eden ve sonucunda bu 2 array’in verileri ile birlikte tek bir array
    //oluşturan metodu yazınız.
    /*
    public static void main(String[] args) {
        int[] arry={5,96,9,54,85};
        int[] arry2={11,6,56,9,8,5,11};
        System.out.println(Arrays.toString(arrySumToArry(arry, arry2)));
    }
    public static int[] arrySumToArry(int[] arr1,int[] arr2){

       int[] result=new int[arr1.length+ arr2.length];
        for (int i = 0; i < arr1.length+arr2.length; i++) {
            if (!(i>=arr1.length)){result[i]=arr1[i];}
            else result[i]=arr2[i- arr1.length];
        }
        return result;
    }*/
    //2 array kabul eden, ilk array in içerindeki tüm sayılar ikinci arrayin içinde yer alıyorsa true
    //yer almıyorsa false yazdıran metodu yazınız.
    /*
    public static void main(String[] args) {
      int[] arry1={5,4,3,2,1};
      int[] arry2={1,2,3,4,5,7,9};
      int[] arry3={5,4,3,2,1,7,5};
      int[] arry4={1,2,3,4,5};
        System.out.println(firstArraysElementsCheck(arry1, arry2));
        System.out.println(firstArraysElementsCheck(arry3, arry4));
    }
    public static boolean firstArraysElementsCheck(int[] arr,int[] arr2){
        String str=Arrays.toString(arr2);
        for (int i = 0; i < arr.length; i++) {
            String s= String.valueOf(arr[i]);
            if (!str.contains(s)){return false;}
        }
        return true;
    }*/
    //Array’in içerisindeki sayıları ters çevirerek yeni bir array oluşturan metodu yazınız
    /*
    public static void main(String[] args) {
        int[] arry={5,4,3,2,1};
        System.out.println(Arrays.toString(tersArryBuilder(arry)));
    }
    public static int[] tersArryBuilder(int[] arr){
        int[] result=new int[arr.length];
        int k=0;
        for (int i = arr.length-1; i >= 0; i--) {
            result[k]=arr[i];
            k++;
        }
        return result;
    }*/
    //Boyutu 10 olan bir array oluşturun ve içerisine Random sınıfını kullanarak 0-100 arasında
    //rasgele sayılar atayın ve ekrana bu verileri yazdıran metodu yazınız.
/*
    public static void main(String[] args) {
        int[] arry=new int[10];
        System.out.println(randomArray(arry));

    }
    public static String randomArray(int[] arr){
    Random random= new Random();
        for (int i = 0; i < arr.length; i++) {
            int count=random.nextInt(0,101);
            arr[i]=count;
        }
        return Arrays.toString(arr);
    }*/
    //Boyutu 500 olan bir array oluşturun ve içerisine Random sınıfını kullanarak 50-80
    //arasında rasgele sayılar atayın.
    /*
    public static void main(String[] args) {
        int[] arry=new int[500];
        System.out.println(random500Arrays(arry));
    }
    public static String random500Arrays(int[] arry){
        Random random=new Random();
        for (int i = 0; i < arry.length; i++) {
            int rd=random.nextInt(50,81);
            arry[i]=rd;
        }
        return Arrays.toString(arry);
    }*/
    //Boyutu 500 olan bir array oluşturun ve içerisine Random sınıfını kullanarak 120-140
    //arasında rasgele sayılar atayın.  Oluşturduğunuz Array içerisindeki en büyük 2. sayıyı bulun.
    /*
    public static void main(String[] args) {
        int[] arry=new int[500];
        System.out.println(biggerSecond(arry));
    }
    public static int biggerSecond(int[] arr){
        Random random=new Random();
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            int count=random.nextInt(120,141);
            arr[i]=count;
            if (max<arr[i]){
                max=arr[i];
            }
        }int result=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>result&&arr[i]!=max){
                result=arr[i];
            }
        }
        return result;
    }*/
    // Array’in içerisinde ard arda 3 adet sıralı sayı var ise true döndüren metodu yazınız.
    /*
    public static void main(String[] args) {
        int[] arry={2,3,3,4,5,6,5,6,3};
        int[] arry1={2,4,5,8,8};
        int[] arry2={1,2,3};
        int[] arry3={1,2};
        System.out.println(siraliArrayCheck(arry));
        System.out.println(siraliArrayCheck(arry1));
        System.out.println(siraliArrayCheck(arry2));
        System.out.println(siraliArrayCheck(arry3));

    }
    public static boolean siraliArrayCheck(int[] arr){
        for (int i = 0; i < arr.length-2; i++) {
            if (arr[i]==arr[i+1]-1&&arr[i+1]==arr[i+2]-1){return true;}
        }
        return false;
    }
*/
    //Örnek 15: Array’in içerindeki eşi olmayan yalnız sayıları bulan ve bunları ekrana yazdıran metodu
    //yazınız. (sağında veya solunda aynı sayı yoksa yalnızdır.)
    /*
    public static void main(String[] args) {
    int[] arry={2,3,3,4,5,6,5,6,3};
    int[] arry2={2,2,5,8,8};
    int[] arry3={2,2,3};
    int[] arry4={1,2};
        System.out.println(aloneNumbers(arry));
        System.out.println(aloneNumbers(arry2));
        System.out.println(aloneNumbers(arry3));
        System.out.println(aloneNumbers(arry4));

    }
    public static String aloneNumbers(int[] arr){
    String resultString="";
        for (int i = 0; i < arr.length; i++) {
            if ((i==0)&&(arr[i]!=arr[1])){
                resultString+=arr[i];}
            else if (((i!=arr.length-1)&&i!=0)&&(arr[i]!=arr[i-1]&&arr[i]!=arr[i+1])){
                if (!resultString.contains(String.valueOf(arr[i]))){resultString+=arr[i];}
            } else if (i==arr.length-1&&arr[i]!=arr[i-1]){
                if (!resultString.contains(String.valueOf(arr[i]))){resultString+=arr[i];}
            }
        }
       String[] result=resultString.split("");
        return Arrays.toString(result).replace("[","").replace("]","");

    }*/
    //Örnek 16: Array’in içerisinde en çok bulunan sayıyı veren metodu yazınız. (eşitlik durumda herhangi
    //birini alabilir,1 den fazla bulunmuyorsa -1 döndürecek)
    /*
    public static void main(String[] args) {
int[] arry={2,3,3,3,6,6,5,6,3};
int[] arry2={2,4,5,8,8};
int[] arry3={2,4,5,8};
        System.out.println(findTooMuchNumber(arry));
        System.out.println(findTooMuchNumber(arry2));
        System.out.println(findTooMuchNumber(arry3));

    }
    public static int findTooMuchNumber(int[] arr){
        int result=-1;
        int maxSayac=0;
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            int[] arry= Arrays.copyOfRange(arr,i+1,arr.length);
            for (int j = 0; j < arry.length; j++) {
                if (arr[i]==arry[j]){maxSayac++;}
            }
            if (maxSayac>max){max=maxSayac;
                result=arr[i];}
            maxSayac=0;
        }

        return result;
    }
*/
    //Örnek 17:Array’in içerindeki dublicate sayı varsa true yoksa false döndüren metodu yazınız.
    /*
    public static void main(String[] args) {
        int[] arry={1,2,8,1};
        int[] arry2={25,89,78,98};
        System.out.println(dublicateNumberCheckOnArry(arry));
        System.out.println(dublicateNumberCheckOnArry(arry2));
    }
    public static boolean dublicateNumberCheckOnArry(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int[] arry= Arrays.copyOfRange(arr,i+1,arr.length);
            for (int j = 0; j < arry.length; j++) {
                if (arr[i]==arry[j]){
                    return true;
                }
            }
        }
        return false;
    }*/
    //Örnek 18: «Bir fil ormanda boylu boyunca uzanmış, yüksek sesle horlayarak uyuyordu. Filin yemek
    //dolu karnı horlarken bir aşağı bir yukarı gidiyordu. Filin horlama sesini duyan fare yuvasından çıkıp
    //sesin olduğu tarafa gitti, filin horlarken sallanan karnı farenin hoşuna gitti. Usulca çıkıp filin karnının
    //üzerine oturdu, salıncak gibi bir o yana bir bu yana sallanırken eğleniyordu.» kelimesinde kaç adet o
    //harfi vardır. (Büyük ve küçük ihmal edilecek)
    /*
    public static void main(String[] args) {
        String str="Bir fil ormanda boylu boyunca uzanmış, yüksek sesle horlayarak uyuyordu. Filin yemek \n" +
                "dolu karnı horlarken bir aşağı bir yukarı gidiyordu. Filin horlama sesini duyan fare yuvasından çıkıp \n" +
                "sesin olduğu tarafa gitti, filin horlarken sallanan karnı farenin hoşuna gitti. Usulca çıkıp filin karnının \n" +
                "üzerine oturdu, salıncak gibi bir o yana bir bu yana sallanırken eğleniyordu.";
        System.out.println(findONumbers(str, 'o'));

    }
    public static int findONumbers(String str,char param){
        str=str.toLowerCase();
       String[] arry=str.split("");
       int result=0;
        for (int i = 0; i < arry.length; i++) {
            if (arry[i].equals(String.valueOf(param))){result++;}
        }
return result;
    }*/
    //Örnek 19:Verilen bir cümlenin içerinde dublicate kelime varsa true yoksa false döndüren metodu yazınız.
    /*
    public static void main(String[] args) {
        String str="araba ile yola çıktık fakat araba arıza yaptı";
        String str2="araba ile yola çıktık fakat arıza yaptı";
        System.out.println(dublicateWordCheck(str));
        System.out.println(dublicateWordCheck(str2));
    }
    public static boolean dublicateWordCheck(String str){
        String[] arr=str.toLowerCase().split(" ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i].equals(arr[j])){return true;}
            }
        }
        return false;
    }*/
    //Örnek 20:Array’in içerisindeki en küçük sayıyı bulan ve array in ilk indeksine bu sayıyı atayan diğer
    //indekslere 0 atayan metodu yazınız.
    /*
    public static void main(String[] args) {
        int[] arr={5,7,1,9};
        System.out.println(Arrays.toString(findLowerAndDoArryWithZero(arr)));
    }
    public static int[] findLowerAndDoArryWithZero(int[] arr){
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min>arr[i]){
                min=arr[i];
            }
        }
        int[] result=new int[arr.length];
        result[0]=min;
        return result;
    }*/
    //Örnek 21:Array’in içerisindeki sayılardan 5 den sonra 8 geliyorsa 8 yerine 1 atayan metodu yazınız.
    /*
    public static void main(String[] args) {
        int[] arry={6,5,8,6,8,5,8};
        int[] arry2={5,7,8,5,9};
        System.out.println(Arrays.toString(arryTaskFantasy(arry)));
        System.out.println(Arrays.toString(arryTaskFantasy(arry2)));
    }
    public static int[] arryTaskFantasy(int[] arr){
        int[] result=arr;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==5&&arr[i+1]==8){
                result[i+1]=1;
            }
        }
        return result;
    }*/
    //Array’in içerisindeki asal sayıları bularak ekrana yazdıran metodu yazınız.
    /*
    public static void main(String[] args) {
        int[] arry={21,7,29,12};
        allPrimaryNumbers(arry);
    }
    public static void allPrimaryNumbers(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int sayac=0;
            for (int j = 2; j < arr[i]; j++) {

                if (arr[i]%j==0){sayac++;}
            }
            if (sayac==0){
                System.out.print(arr[i]+" ");
            }

        }
    }*/
    //Örnek 23:Array’in içerisindeki sayıları artan düzeyde sıralayınız. (Arrays.sort kullanılmayacak)
    /*
    public static void main(String[] args) {
    int[] arry={21,7,29,12};
        System.out.println(Arrays.toString(arrySort(arry)));
    }
    public static int[] arrySort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int ram=arr[i];
            for (int j = 0; j <arr.length ; j++) {
                if (arr[j]>ram){
                    ram=arr[j];
                    arr[j]=arr[i];
                    arr[i]=ram;
                }
            }
        }

return arr;
    }*/
//Örnek 24:Array’in içerisindeki ard arda aynı olan  sayıları hariç tutarak dublicate olmayan sayıların
//toplamını veren metodu yazınız.
    /*
    public static void main(String[] args) {
int[] arry={1,1,2,3};
int[] arry2={2,5,5,5,9};
int[] arry3={5,5,5,5,9};
int[] arry4={5,5,5,5,5};
int[] arry5={5,1,5,1,5};
       System.out.println(notDublicateSum(arry));
        System.out.println(notDublicateSum(arry2));
        System.out.println(notDublicateSum(arry3));
        System.out.println(notDublicateSum(arry4));
        System.out.println(notDublicateSum(arry5));

    }
    public static int notDublicateSum(int[] arr){
        int result=0;
        if (arr[0]!=arr[1]){
            result+=arr[0];
        }
        for (int i = 1; i < arr.length; i++) {
            int[] arry=Arrays.copyOfRange(arr,i-1,i+2);
           if ((arry[1]!=arry[0]&&arry[1]!=arry[2])){
               result+=arry[1];
           }

        }
        return result;
    }

*/
    //Örnek 25:Array’in içerisindeki sayıların toplamını veren fakat 5 ile 9 dahil arasındaki  sayıları
    //toplama dahil etmeyin.
/*
    public static void main(String[] args) {
        int[]arry={1,5,9,3};
        int[]arry2={2,5,28,36,9};
        int[]arry3={5,3,9,11,9};
        int[]arry4={5,5,5,5,9};
        int[]arry5={5,9,5,1,9};
        System.out.println(arrySumWithRules(arry));
        System.out.println(arrySumWithRules(arry2));
        System.out.println(arrySumWithRules(arry3));
        System.out.println(arrySumWithRules(arry4));
        System.out.println(arrySumWithRules(arry5));

    }
    public static int arrySumWithRules(int[] arr){
        int result=0;
        boolean stat=true;
        int[] fiveBefore=new int[arr.length];
        int[] nineAfter=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==5){
                for (int j = i; j <arr.length ; j++) {
                    if (arr[j]==9){
                        while (stat){ fiveBefore= Arrays.copyOfRange(arr,0,i); stat=false;}
                        nineAfter=Arrays.copyOfRange(arr,j+1,arr.length);
                        i=j;
                       break;
                    }
                }
                }
        }
        for (int k:fiveBefore
        ) {
            result+=k;
        }
        for (int l:nineAfter
        ) {
            result+=l;
        }
        return result;
    }*/
    //Örnek 26:Array’in içerisindeki ne kadar 1 var ise hepsini en sağa taşıyan metodu yazınız.
    /*
    public static void main(String[] args) {
        int[] arry={1,1,5,1,9,6,1,4,7,11,25,36};
        System.out.println(Arrays.toString(allOneNumbersTopRight(arry)));
    }
    public static int[] allOneNumbersTopRight(int[] arr){
        int sayac=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==1&&i<arr.length-1-sayac) {
                for (int j = i+1; j < arr.length; j++) {
                    arr[j-1]=arr[j];
                }
                for (int j = arr.length-1-sayac; j >i ;) {
                    sayac++;
                    arr[j]=1;
                    break;
                }

               i--; }
            }
        return arr;
    }*/
   }





