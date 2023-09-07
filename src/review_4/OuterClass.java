package review_4;

public class OuterClass {
    private static String msg="elma";



    public static class NestedStaticClass{
        public void printMessage(){

            System.out.println(msg);

        }
    }

}
