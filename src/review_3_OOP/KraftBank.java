package review_3_OOP;

import java.util.Random;

public class KraftBank {
    Random rd=new Random();
    static String bankName="KraftBank";
    int customerId;
    String customerFullName;
    boolean isSms;
    double customerAccount=0;
    String customerToken="";


    public KraftBank(int customerId,String customerFullName,boolean isSms){
        this.customerId=customerId;
        this.customerFullName=customerFullName;
        this.isSms=isSms;
        for (int i = 0; i < 2; i++) {
         customerToken += customerFullName.charAt(i);
        }
       customerToken=customerToken+rd.nextInt(1000,10000);
    }

    public String getAccountInfo() {

        return "KraftBank{" +
                "customerId=" + this.customerId +
                ", customerFullName='" + this.customerFullName + '\'' +
                ", isSms=" + this.isSms +
                ", customerAccount=" + this.customerAccount +
                ", customerToken='" + this.customerToken + '\'' +
                '}';
    }

    public double addMoney(double money){

      return  customerAccount+=money;
   }

}
