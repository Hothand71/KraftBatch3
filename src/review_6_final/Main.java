package review_6_final;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
      //  Example example1=new Example("Kemal");
      //  Example example2=new Example("Mustafa");
      //  AnotherExample anotherExample1=new AnotherExample("Ahmet");
      //  AnotherExample anotherExample2=new AnotherExample("Mehmet");
      //  int r=3;
      //  System.out.println(r*Example.PI);

        int a=5;
        System.out.println(a);
        if (a++>6){
            System.out.println(a);
        }
        System.out.println(a);



        final int[] array=new int[2];
        array[0]=5;
        System.out.println(Arrays.toString(array));
        array[0]=5;
        System.out.println(Arrays.toString(array));


    }
}
