package day_29_ArraysCont;

import java.util.Arrays;
import java.util.Random;

public class ArraysMethods {
    public static void main(String[] args) {
        // split()
        String str ="Merhaba java insanları";
        String[] sArr= str.split(" ");
        for (String st:sArr) {
            System.out.println(st);
        }
        //copyOfRange()
        String[] str2={"Kemal","Mustafa","Emre","Mehmet","Ahmet","Mahmut"};
        String[] strings=   Arrays.copyOfRange(str2,1,4);
        System.out.println(Arrays.toString(strings));

        //sort()
        Random rd=new Random();
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i]=rd.nextInt(100);
        }
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);//kücükten buyuge sıralıyor
        System.out.println(Arrays.toString(nums));

        //fill()
        System.out.println("------------------");
        int[] ints = new int[5];
        ints[0]=8;
        ints[1]=18;
        ints[2]=28;
        ints[3]=38;
        ints[4]=48;
        System.out.println(Arrays.toString(ints));

        Arrays.fill(ints,10);
        System.out.println(Arrays.toString(ints));

    }
}
