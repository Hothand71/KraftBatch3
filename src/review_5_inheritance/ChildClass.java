package review_5_inheritance;

public class ChildClass extends ParentClass{
int y=15;

public void metotChild(){
    int y=50;
    System.out.println(super.y);
}
}
