package day_20_review;

    public class Person {
    String name;
    String gender;
    int age;

    public String sleep(){
    String  a="uyuyor";
    return a;
    }
    public void play(){
        System.out.println("oyun oynuyor");
    }
        public static void main(String[] args) {
            Person person1= new Person();
            person1.name="ali";
            person1.gender="Erkek";
            person1.age=4;
            person1.play();

            person1.play();
            person1.sleep();

        }
}
