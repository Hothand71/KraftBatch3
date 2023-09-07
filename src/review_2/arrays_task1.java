package review_2;

public class arrays_task1 {
    //task
    /*
    public static void main(String[] args) {
        int[] arry= new int[6];
        int[] arry2= new int[5];
        int[] arry3= new int[4];
        System.out.println(fiveArrayLength(arry));
        System.out.println(fiveArrayLength(arry2));
        System.out.println(fiveArrayLength(arry3));
    }
    public static boolean fiveArrayLength(int[] count){
        if (count.length>5)
            return true;
        return false;
    }*/
    //Bir method yazınint array kabul etsin array in içinde 5 olup olmadığınıkontrol etsin.
    /*
    public static void main(String[] args) {
        int[] arry={0,1,2,3,4,5};
        System.out.println(fiveCheck(arry));
    }
    public static boolean fiveCheck(int[] arry){
        for (int i = 0; i < arry.length; i++) {
            if (arry[i]==5){return true;}
        }return false;

    }*/
    //bir method yazınve 2 array kabul etsin ilk elemanlarıeşitsetrue döndürsün.
    /*
    public static void main(String[] args) {
        int[] arry={1,2,3,4,5};
        int[] arry2={1,1,1,4};
        System.out.println(firstIndexEquals(arry, arry2));
    }
    public static boolean firstIndexEquals(int[] arry,int[] arry2){
        if (arry[0]==arry2[0]){
            return true;
        }
        return false;
    }*/
    //2 array kabul eden bir method yazın ve arraylerin llk elemanları ile yeni bir array döndürsün.
    /*
    public static void main(String[] args) {
        String[] arry={"kemal","mustafa"};
        String[] arry2={"mustafa","Altun"};
        for (String i: firstIndexArray(arry, arry2)
             ) {
            System.out.print(i+ " ");

        };
    }
    public static String[] firstIndexArray(String[] arry,String[] arry2){
        String[] arr={arry[0],arry2[0]};

        return arr;
    }*/
    //Int array in elemanlarının toplamını veren bir method yazın
   /*
    public static void main(String[] args) {
            int[] arry={0,1,2,3,4,5};
        System.out.println(sumArray(arry));
    }
    public static int sumArray(int[] arry){
        int result=0;
        for (int i:arry
             ) {
            result+=i;
        }
        return result;
    }*/
    //İnt array ınelemanlarının toplamını ve çarpımını yeni bir array içinde döndüren bir method yazın.
    /*
    public static void main(String[] args) {
        int[] arry={1,2,3,4,5};
        for (int i:(arraySumAndMultiplication(arry))
             ) {
            System.out.println(i);
        }
    }
    public static int[] arraySumAndMultiplication(int[] arry){
        int[] arr=new int[2];
        arr[1]=1;
        for (int i:arry
             ) {
            arr[0]+=i;
        }
        for (int i:arry
        ) {
            arr[1]*=i;
        }
        return arr;
    }*/
    //Verilen 2 arrayi birleştirip array döndüren bir method yazın.
    /*
    public static void main(String[] args) {
        int[] arry={1,2,3,4,5};
        int[] arry2={1,2,3,4};
        System.out.println(Arrays.toString(arrayConcat(arry, arry2)));
    }

    public static int[] arrayConcat(int[] arry,int[] arry2){
        int[] arr=new int[arry.length+arry2.length];
        for (int i = 0; i < arry.length; i++) {
            arr[i]=arry[i];
        }
        for (int i = 0; i < arry2.length; i++) {
            arr[arry.length+i]=arry2[i];
        }
        return arr;
    }*/
    //İnt arry in en büyük elemanınındöndüren bir method yazın
    /*
    public static void main(String[] args) {
        int[] arry={9999,5,8,6,9,99,53,6643,9582};
        System.out.println(biggerArray(arry));
    }
    public static int biggerArray(int[] arry){
        int result=0;
        for (int i = 0; i < arry.length ;i++) {
            if (arry[i]>result){
                result=arry[i];
            }
        }
        return result;
    }*/
    //Bir array oluşturunve ilk ve son element leri swap(yer değiştirme)yapın.
    /*
    public static void main(String[] args) {
        int[] arry={9999,5,8,6,9,99,53,6643,9582};
        System.out.println(Arrays.toString(firstAndLast(arry)));
    }
    public static int[] firstAndLast(int[] arry){
        int[] result=new int[arry.length];
        for (int i = 0; i < arry.length; i++) {
            result[i]=arry[i];
        }result[0]=arry[arry.length-1];
        result[arry.length-1]=arry[0];
        return result;
    }*/
    /*
    public static void main(String[] args) {
        int[] arry={9999,5,8,6,9,99,53,6643,9582};
        System.out.println(Arrays.toString(firstAndLast(arry)));
    }
    public static int[] firstAndLast(int[] arry){
        int result=arry[0];
        arry[0]=arry[arry.length-1];
        arry[arry.length-1]=result;
        return arry;
    }*/
    //Bir method yazınve verilen arry in elemanlarınıtersden sıralayıpyeni bir array döndürsün.
    /*
    public static void main(String[] args) {
        int[] arry={9999,5,8,6,9,99,53,6643,9582};
        System.out.println(Arrays.toString(tersArray(arry)));
    }
    public static int[] tersArray(int[] arry){
        int[] arr=new int[arry.length];
        int k=0;
        for (int i = arry.length-1; i >=0 ; i--) {
            arr[k]=arry[i];
            k++;
            }
        return arr;
        }*/

    //Bir methodla verilen array ınteksayıindexinde bulunan elemanlarıntoplamınıalın.
    /*
    public static void main(String[] args) {
        int[] arry={5,8,6,9,99,53,9582};
        System.out.println(oddNumberSum(arry));
    }
    public static int oddNumberSum(int[] arry){
        int result=0;
        for (int i = 0; i < arry.length; i++) {
            if (arry[i]%2==1){result+=arry[i];}
        }
        return result;
    }*/
    //Kullanıcıdan oluşturmak istediği string array in bilgilerini alarak string array oluşturan
    //bir method yazın. Alınacak bilgiler array ınlength i ve elamanları olsun.
    /*
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("array uzunluğu giriniz :");
        System.out.println(Arrays.toString(arryBuilder(sc.nextInt())));
    }
    public static String[] arryBuilder(int param){
        Scanner sc= new Scanner(System.in);
       String[] arr=new String[param];
        for (int i = 0; i < param; i++) {
            arr[i]=sc.nextLine();
        }
        return arr;
    }*/
}
