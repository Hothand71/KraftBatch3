package day_9_operatorsCont;

public class Conditional_logical_Opr {
    public static void main(String[] args){
boolean bl;
//&& logical AND
        bl = true && true;//----true
        System.out.println("bl = " + bl);
        bl = true && false;//---false
        System.out.println("bl = " + bl);
        bl = false && false;// false;
        System.out.println("bl = " + bl);

        //|| logical OR operatorü

        bl = true || true;//true
        System.out.println("bl = " + bl);
        bl = true||false;//true
        System.out.println("bl = " + bl);
        bl = false||false;//false
        System.out.println("bl = " + bl);
        bl = true || true;//true
        System.out.println("bl = " + bl);

        //^ bitwise axclusive OR
            //taraflar farklı ise true döndürür.

            bl = true ^ true;//false,
            System.out.println("bl = " + bl);
            bl = false ^ false;//false
            System.out.println("bl = " + bl);
            bl = true ^ false;//true
            System.out.println("bl = " + bl);

//      example
            //aşşağıdakilerin aldığı değerleri soyleyiniz
            int a =5;
            int b=7;
            bl = true;

            bl = (a>b) && (b==7);//false
            System.out.println("bl = " + bl);
            bl = a/b>0 || b>a;//true
            System.out.println("bl = " + bl);



    }
}
