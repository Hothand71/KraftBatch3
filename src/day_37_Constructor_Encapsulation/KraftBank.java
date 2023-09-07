package day_37_Constructor_Encapsulation;

public class KraftBank {
    String musteriAd;
    private int hesapNo;
    double bakiye;



    public KraftBank(String musteriAd){
        this.musteriAd=musteriAd;
    }
    public KraftBank(String musteriAd,int hesapNo){
        this(musteriAd);
        this.hesapNo=hesapNo;
    }
    public KraftBank(String musteriAd,int hesapNo,double bakiye){
        this(musteriAd,hesapNo);
        this.bakiye=bakiye;
    }
    public double paraEkle(double para){
        this.bakiye+=para;
        return this.bakiye;
    }
    public double paraCek(double para){
        if (this.bakiye<para){
            System.out.println("Bakiyeniz yetersiz");
            System.out.println(this.bakiye);
            return this.bakiye;
        }
        this.bakiye-=para;
        System.out.println(this.bakiye);
        return this.bakiye;
    }

}
