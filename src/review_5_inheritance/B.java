package review_5_inheritance;

public class B extends A{
    String strB;
    int intB;
    public B(String strA,String strB,int intB){
        super(strA);
        this.strB=strB;
        this.intB=intB;
        super.metotA();
        System.out.println(super.strA);
    }

    public void metotB(){}
}
