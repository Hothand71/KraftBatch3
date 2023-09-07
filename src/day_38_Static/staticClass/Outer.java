package day_38_Static.staticClass;

public class Outer {
    static class nested{
        public static void message (){
            System.out.println("selam static nested classdan");
        }

    }
    class Inner{
        //selam nesnesi burda
        public void message2(){
            System.out.println("selam Inner class dan");
        }
    }
}
class main{
    public static void main(String[] args) {
        Outer.nested.message();
       // Outer outer= new Outer();
        //Outer.Inner selam= outer.new Inner();

        Outer.Inner selam=new Outer().new Inner();
        selam.message2();
    }
}
