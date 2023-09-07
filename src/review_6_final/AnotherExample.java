package review_6_final;

public class AnotherExample extends Main{
    String ad;
    AnotherExample(String ad){
        this.ad=ad;
        System.out.println(" Another"+ad);
    }
    static {
        System.out.println(" Another Static blok");
    }
    {
        System.out.println(" Another staticden sonraki blok");
    }
}
