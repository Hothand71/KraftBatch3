package review_5_inheritance;

public class Main {
    public static void main(String[] args) {
      //  A a_objesi=new A();
      //  a_objesi.metotA();
     //   B b_objesi=new B();
       // b_objesi.metotA();
       // B b_objesi=new B("kemal","çınar",22);
      //  ParentClass.x=20;
       // System.out.println(ChildClass.x);
       // ParentClass parent1=new ParentClass();
      //  parent1.y=15;
        //ChildClass childClass1=new ChildClass();
     //   System.out.println(childClass1.y);
      //  childClass1.metotChild();
       /* Automobile automobile1= new Automobile("mercedes");
        automobile1.radioBrand="samsung";
        automobile1.hp=800;
        System.out.println(automobile1.hp);
        automobile1.changeHp(250);
        System.out.println(automobile1.hp);
        automobile1.start();
        automobile1.stop();
*/
        Tester tester_1=new Tester("Kemal","Altun");
        tester_1.createId();
        System.out.println(tester_1.id);
        tester_1.isManual=true;
        tester_1.salary=15000;
        tester_1.numberOfPersonal=3;
        tester_1.team='C';

    }
}
