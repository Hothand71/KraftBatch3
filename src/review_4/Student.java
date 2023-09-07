package review_4;

public class Student {
    static String schoolName="KRAFTECH";
     private String studentName;

    public Student(String studentName){
        this.studentName=studentName;
    }
    public void printName(){
        System.out.println(studentName);
    }
    public static void printSchoolName(){

        System.out.println("static methodda oldugu icin studentName vermiyor");
        System.out.println(schoolName);
    }
    static {
        System.out.println("Okul verilerine erişiyorsunuz");//ilk çalışır bir kere çalışır
    }
    {
        System.out.println("veri girildi");
    }
}
