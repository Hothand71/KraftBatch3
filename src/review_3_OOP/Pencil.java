package review_3_OOP;

public class Pencil {
    String color;
    int length;
    boolean haveEraser=false;
    public Pencil(){
        System.out.println("Pencil is Building");
    }

    public Pencil(String color){
        this();
        this.color=color;
        System.out.println("Pencil color is " + color);
    }
    public Pencil(String color,int length){
        this(color);
        this.length=length;
        System.out.println("pencil length is " + length);
    }
    public Pencil(String color,int length,boolean haveEraser){
        this(color, length);
        this.haveEraser=haveEraser;
        System.out.println("have Eraser is " + haveEraser);
    }
    public void write(){
        if (this.length!=0){
            System.out.println("writing...");
        }
        else System.out.println("Can't writing length is " + this.length);
    }
    public void delete(){
        if (this.haveEraser){
            System.out.println("deleting...");
        } else System.out.println("Can't deleting Eraser is " + false);
    }

}
