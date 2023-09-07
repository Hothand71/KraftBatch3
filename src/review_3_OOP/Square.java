package review_3_OOP;

public class Square {
     int sideLength;
     int calcuateArea;
     int getSideLength;


    public Square(int sideLength) {
        this.sideLength = sideLength;
        this.calcuateArea=sideLength*sideLength;
        this.getSideLength=sideLength*4;
    }
    public Square(){}


    public int calculateArea(){
         return (int) Math.pow(sideLength,2);
     }
     public int calcuatePerimeter(){
         return sideLength*4;
     }

}
