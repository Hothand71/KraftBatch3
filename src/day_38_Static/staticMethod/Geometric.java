package day_38_Static.staticMethod;

public class Geometric {

    int primeter;
    static int counterSides;

    public void primeter(int... sides){
        for (int i:sides){
            primeter+=i;
           // counterSides++;
            setCounterSides();
        }
        System.out.println("Şeklin çevresi "+primeter);
        System.out.println("Kenar sayısı "+counterSides);
        resetSides();
    }
    public static void setCounterSides(){
        counterSides++;
    }
    public static void resetSides(){
        counterSides=0;

    }

}
 class main2{
    public static void main(String[] args) {
        Geometric geo1=new Geometric();
        Geometric geo2=new Geometric();

        geo1.primeter(2,3,5);
        geo2.primeter(2,3,5,7);
    }
}
