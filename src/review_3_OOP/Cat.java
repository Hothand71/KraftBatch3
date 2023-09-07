package review_3_OOP;

public class Cat {
    String eyeColor;
    boolean breed=false;
    boolean isFat=false;
    boolean isPet=false;

    public Cat(){

    }
    public Cat(String eyeColor){
        this();
        this.eyeColor=eyeColor;
    }
    public Cat(String eyeColor,boolean breed){
        this(eyeColor);
        this.breed=breed;
    }
    public Cat(String eyeColor,boolean breed,boolean isFat){
        this(eyeColor,breed);
        this.isFat=isFat;
    }
    public Cat(String eyeColor,boolean breed,boolean isFat,boolean isPet){
        this(eyeColor,breed,isFat);
        this.isPet=isPet;
    }


    public void catInfo() {
        System.out.println();
        System.out.print("This cat " +
                "eyeColor='" + eyeColor + '\'' +
                ", breed=" + breed +
                ", isFat=" + isFat +
                ", isPet=" + isPet);


    }

    public void sleep(){
        catInfo();
        System.out.print(" cat is sleeping now zZzZ");
    }
    public void food(){
        catInfo();
        System.out.print(" cat is eating now nam nam nam");
    }
    public void run(){
        catInfo();
        System.out.print(" cat is running now pat pat pat");
    }


}
