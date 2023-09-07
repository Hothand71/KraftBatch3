package day_36_Class_Object_Constructor;

public class Daire {
    double yaricap;

    public double getTamCap(){
        return 2*yaricap;
    }
    public int getCevre(){
        return (int)(2*Math.PI*yaricap);
    }
    public double getAlan(){
        return Math.PI*Math.pow(yaricap,2);
    }

}
