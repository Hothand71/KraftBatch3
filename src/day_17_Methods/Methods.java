package day_17_Methods;

public class Methods {
    public static void main(String[] args) {
        kos();


    }
    //menü adında bir metod oluşturun bu metodun içerisinde 1 kebap, 2 çorba, 3 tatlı, 4 salata, 5 içecek;
    //olacak şekilde ekrana bir menü getirin ve bu menü metodu main metodu içerisinden çağırın.
    public static void kos(){
        System.out.println("Ali koşuyor");
        yemekye();
    }
    public static void yemekye(){
        System.out.println("Ali yemek yiyor");
    }
}
