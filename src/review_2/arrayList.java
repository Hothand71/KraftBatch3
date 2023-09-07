package review_2;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayList {

        /*
        ArrayList<String> names=new ArrayList<>();
        names.add("ahmet");
        names.add("mehmet");
        names.add("ali");
        names.add("murat");
        System.out.println("names.size() = " + names.size());
        System.out.println("names = " + names);
        names.add(0,"Kemal");
        System.out.println("names = " + names);
        names.set(1,"mustafa");
        System.out.println("names = " + names);
      //  names.remove(0); secili indexi siler
        System.out.println("names = " + names);
        System.out.println("names.indexOf(\"Kemal\") = " + names.indexOf("Kemal"));//-1 cünkü yok
        System.out.println("names.get(4) = " + names.get(3));
       // names.clear();//hepsini siler
        System.out.println(names);
        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Kemal");
        names.removeAll(names2);
        System.out.println(names);

        ArrayList<String> sepettekiMeyveler= new ArrayList<>();
        sepettekiMeyveler.add("elma");
        sepettekiMeyveler.add("armut");
        sepettekiMeyveler.add("kayısı");
        sepettekiMeyveler.add("üzüm");
        sepettekiMeyveler.add("erik");
        ArrayList<String> sepettenAlmakIstenenMeyveler= new ArrayList<>();
        sepettenAlmakIstenenMeyveler.add("armut");
        sepettenAlmakIstenenMeyveler.add("kayısı");
        sepettenAlmakIstenenMeyveler.add("üzüm");
        System.out.println("sepettekiMeyveler = " + sepettekiMeyveler);
        System.out.println("sepettenAlmakIstenenMeyveler = " + sepettenAlmakIstenenMeyveler);
        sepettekiMeyveler.removeAll(sepettenAlmakIstenenMeyveler);
        System.out.println("Sepette kalan meyveler = " + sepettekiMeyveler);

*/
    /*
        public static void main(String[] args) {
        ArrayList<Integer> listOfNums=new ArrayList<>();
        listOfNums.add(5);
        listOfNums.add(10);
        listOfNums.add(15);
        listOfNums.add(20);
        listOfNums.add(25);
        listOfNums.add(25);
        listOfNums.add(100);
        listOfNums.add(100);
        listOfNums.add(500);
        System.out.println(printListNumbers(listOfNums));
        System.out.println(sum(listOfNums));
        System.out.println(dublicate(listOfNums));
        System.out.println(squared(listOfNums));

        }
    public static String printListNumbers(ArrayList<Integer> arrayList){
        String str="";
        for (int i = 0; i < arrayList.size(); i++) {
            str+=( arrayList.get(i).toString()+" ");
        }
        return str;
    }

    public static int sum(ArrayList<Integer> arrayList){
            int result=0;
        for (int i = 0; i < arrayList.size(); i++) {
            result+=arrayList.get(i);
        }
        return result;
    }

        public static ArrayList<Integer> dublicate(ArrayList<Integer> arrayList){
            ArrayList<Integer> resulArrayList=new ArrayList<>();
            resulArrayList.addAll(arrayList);
            resulArrayList.addAll(arrayList);
            return resulArrayList;
        }
        public static long squared(ArrayList<Integer> arrayList){
            long result=1L;
            for (int i = 0; i < arrayList.size(); i++) {
                result*=arrayList.get(i);
            }
            return result;
        }

     */
    //pratice
/*
        public static void main(String[] args) {
ArrayList<Integer> myList= getList(20);
            System.out.println(myList);
        }
        public static ArrayList<Integer> getList(int param){
            ArrayList<Integer> resultArrayList=new ArrayList<>();
            for (int i = 1; i <= param; i++) {
                resultArrayList.add(i);
            }
            return resultArrayList;
        }*/
       /* public static void main(String[] args) {
            ArrayList<Integer> arrayList=randomArrayListCreator(20);
            System.out.println(arrayList);
            System.out.println(arrayList.size());
        }
        public static ArrayList<Integer> randomArrayListCreator(int param){
            ArrayList<Integer> arrayList=new ArrayList<>();
            Random rd=new Random();
            for (int i = 0; i < param; i++) {
                arrayList.add(rd.nextInt(1,param+1));
            }
            return arrayList;
        }
        */
        public static void main(String[] args) {
            ArrayList<String> stringNums=new ArrayList<>();
            stringNums.add("10");
            stringNums.add("100");
            stringNums.add("101");
            stringNums.add("1000");
            System.out.println(toIntList(stringNums));
            System.out.println(Arrays.toString(toIntArr(stringNums)));
            for (int i:toIntArr(stringNums)
                 ) {
                System.out.println(i);
            }

        }
        public static ArrayList<Integer> toIntList(ArrayList<String> arrayList){
            ArrayList<Integer> toIntList=new ArrayList<>();
            for (String s : arrayList) {
                toIntList.add(Integer.valueOf(s));
            }
            return toIntList;
        }
        public static int[] toIntArr(ArrayList<String> arrayList){
            int[] arry=new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                arry[i]=Integer.parseInt(arrayList.get(i));
            }
            return arry;
        }
}
