package day_38_Static.staticVariables;

public class Student {
    int number;
    String name;
    static int count;

   static String schoolName="KRAFT";

    public Student(int number, String name) {
        count++;
        this.number = number;
        this.name = name;
    }
    public String getInfo(){
        return '['+"Id "+count+
                ",Name "+name+
                ", number "+number+
                ", schoolName "+schoolName+
                ']';
    }
}
class main{
    public static void main(String[] args) {
        Student student1=new Student(123,"Kemal");
        Student student2=new Student(619,"Mustafa");
        Student student3=new Student(101,"Emre");
        Student student4=new Student(71,"Cengiz");

        Student.schoolName="YENI KRAFT";
        System.out.println(student1.getInfo());
        System.out.println(student2.getInfo());
        System.out.println(student3.getInfo());
        System.out.println(student4.getInfo());



    }
}
