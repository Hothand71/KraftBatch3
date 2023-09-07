package day_9_operatorsCont;

import java.util.Scanner;

public class tasks_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      /*  System.out.println("Yaş giriniz");
        int age=sc.nextInt();
        System.out.println("Sağlık durumu giriniz");
        boolean healty = sc.nextBoolean();
        boolean sonuc = age>=20 && healty==true;
        System.out.println("Askere gidebilme durumu =" + sonuc);
*/

        /* kullanıcıdan bir sayı alın sayı hem 3 hem 5 bölnüyüorsa veya her ikisini de bölünmüyorsa false veren bir boolean kontrolü sağlayın */
       /* System.out.println("Sayı giriniz=");
        int num1 = sc.nextInt();

        boolean status = num1%3==0 ^ num1%5==0;
        System.out.println("status = " + status);*/

        /*kullanıcıdan boy ve kilosunu sorun. boyun son 2 rakamının ifade ettiği değer kilosunun 5 fazlası ve 10 eksiği aralığında ise true döndüren bir boolean kontrolü sağlayın.*/
    System.out.println("Boy giriniz=");
    int boy=sc.nextInt();
    System.out.println("Kilonuzu giriniz=");
    int kilo=sc.nextInt();
    int x=kilo%100;
    boolean stat = (kilo+5)<=x && (kilo-10)>=x;
        System.out.println("stat = " + stat);


    }
}
