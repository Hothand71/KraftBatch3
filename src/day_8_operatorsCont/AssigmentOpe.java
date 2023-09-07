package day_8_operatorsCont;

public class AssigmentOpe {
    public static void main(String[] args) {
        //Assignment (atama) operators
        int x= 10;
        int y=20;
        x = x+y;
        System.out.println("x = " + x);//30
        x+=y;
        System.out.println("x = " + x);//50

        x = x/y;//50/20
        System.out.println("x = " + x);
        x/=y;//(50/20)/20
        System.out.println("x = " + x);

        x=10;
        y=20;

        x = x%y;
        System.out.println("x = " + x);
        x%=y;

    }
}
