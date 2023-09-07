package review_3_OOP;

import java.util.Random;

public class ArtvinBank {
  private int customerId;
    private  String customerFullName;
     private boolean isSms;
    private double customerAccount;
    private  String customerToken="";
    private Random rd= new Random();

    public ArtvinBank(int customerId, String customerFullName, boolean isSms) {
        this.customerId = customerId;
        this.customerFullName = customerFullName;
        this.isSms = isSms;
        for (int i = 0; i < 2; i++) {
            this.customerToken+=customerFullName.charAt(i);
        }
        this.customerToken+=rd.nextInt(1000,10000);
    }
    public void addMoney(double value){
        customerAccount+=value;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerFullName() {
        return customerFullName;
    }

    public double getCustomerAccount() {
        return customerAccount;
    }

    public String getCustomerToken() {
        return customerToken;
    }

    public boolean isSms() {
        return isSms;
    }

    public void setSms(boolean sms) {
        isSms = sms;
    }
    public void setCustomerFullNamePass(String customerToken,String changeTo){
        if (customerToken.equals(this.customerToken)){
            changeCustomerFullName(changeTo);
        }
        else System.out.println("Wrong customerToken");
    }
    private void changeCustomerFullName(String target){
        customerFullName=target;
        customerToken="";
        for (int i = 0; i < 2; i++) {
            this.customerToken+=customerFullName.charAt(i);
        }
        this.customerToken+=rd.nextInt(1000,10000);
    }
}
