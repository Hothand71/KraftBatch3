package day_39_Inheritance;

public class ChildClass extends ParentClass {
    public void print_message_C(){
        System.out.println(" World");
    }
}
class main{
    public static void main(String[] args) {
        ChildClass child =new ChildClass();
        child.print_message_P();
        child.print_message_C();
    }
}
