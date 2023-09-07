package z_Constructors;

import java.util.Calendar;
import java.util.Scanner;

public class CoskunEncryption {
    public static void main(String[] args) {
        boolean status=true;
        System.out.println("Şifreleme ->şifre<- şeklinde ok işaretleri arasına konulacaktır");
        while(status) {
            Scanner sc = new Scanner(System.in);
            String alphabet = "0123456789abcdefghijklmnopqrstuvwxyzçğıüş ";
            System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz(1-2-3-0 yazarak)");
            System.out.println("1-Metin şifrelemek için");
            System.out.println("2-Şifreli metini çözmek için");
            System.out.println("3-Alfabeyi görmek için");
            System.out.println("0-Çıkış");
            int islemNo = sc.nextInt();
            sc.nextLine();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("...");
            }
            if (islemNo == 1) {

                System.out.println("ŞİFRELEMEK İSTEDİĞİNİZ METİNİ GİRİNİZ:");
                String input = sc.nextLine();
                input=input.toLowerCase();
                System.out.println("Şifreleme yöntemini seçiniz");
                System.out.println("1-Alfabeye göre 2 karakter öteleyecek şekilde");
                System.out.println("2-Alfabeye göre 3 karakter öteleyecek şekilde");
                System.out.println("3-o gün ayın kaçı ise 5 e bölümünden kalan sayı kadar ötelenecek şekilde");
                System.out.println("4-girdiğin sayı kadar öteler");
                int sifrelemeYontemi = sc.nextInt();
                sc.nextLine();
                String sonucMetin = "";

                if (sifrelemeYontemi == 1) {
                    for (int i = 0; i < input.length(); i++) {
                        char c = input.charAt(i);
                        int index = alphabet.indexOf(c);
                        int newIndex = (index + 2) % alphabet.length();
                        char newChar=alphabet.charAt(newIndex);
                        sonucMetin += newChar;
                    }
                }
                if (sifrelemeYontemi == 2) {
                    for (int i = 0; i < input.length(); i++) {
                        char c = input.charAt(i);
                        int index = alphabet.indexOf(c);
                        int newIndex = (index + 3) % alphabet.length();
                        sonucMetin += alphabet.charAt(newIndex);
                    }
                }
                if (sifrelemeYontemi == 3) {
                    int day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
                    int offset = day % 5;
                    for (int i = 0; i < input.length(); i++) {
                        char current = input.charAt(i);
                        int index = alphabet.indexOf(current);
                        int newIndex = (index + offset) % alphabet.length();
                        char newChar = alphabet.charAt(newIndex);
                        sonucMetin += newChar;
                    }

                }
                if (sifrelemeYontemi == 4) {
                    System.out.println("ötelemek istediğiniz miktarı giriniz");
                    int otelemeSayisi=sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < input.length(); i++) {
                        char c = input.charAt(i);
                        int index = alphabet.indexOf(c);
                        int newIndex = (index + otelemeSayisi) % alphabet.length();
                        sonucMetin += alphabet.charAt(newIndex);
                    }
                    }


                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("...");
                }
                System.out.println('\"'+input+'\"'+" Metinin "+sifrelemeYontemi+" numaralı yöntem ile şifrelenmiş hali şöyledir:");
                System.out.println("->"+sonucMetin+"<-");
                System.out.println("----------");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("...");
                }
            }
            if (islemNo == 2) {
                System.out.println("Şifreleme yöntemini seçiniz");
                System.out.println("1-Alfabeye göre 2 karakter öteleyecek şekilde");
                System.out.println("2-Alfabeye göre 3 karakter öteleyecek şekilde");
                System.out.println("3-ayın hangi günü olduğunu giriniz 5 e bölümünden kalan sayı kadar ötelenecek şekilde");
                System.out.println("4-girdiğin sayı kadar öteler");
                int sifrelemeYontemi= sc.nextInt();
                sc.nextLine();
                System.out.println("Şifresini çözmek istediğiniz metini giriniz");
                String sifreliMetin= sc.nextLine();
                sifreliMetin=sifreliMetin.toLowerCase();
                String cozumlenmisMetin = "";
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("...");
                }
                if (sifrelemeYontemi == 1) {
                    for (int i = 0; i < sifreliMetin.length(); i++) {
                        char current = sifreliMetin.charAt(i);
                        int index = alphabet.indexOf(current);
                        int newIndex = (index + alphabet.length() - 2) % alphabet.length();
                        char newChar = alphabet.charAt(newIndex);
                        cozumlenmisMetin += newChar;
                    }
                }
                if (sifrelemeYontemi == 2) {
                    for (int i = 0; i < sifreliMetin.length(); i++) {
                        char current = sifreliMetin.charAt(i);
                        int index = alphabet.indexOf(current);
                        int newIndex = (index + alphabet.length() - 3) % alphabet.length();
                        char newChar = alphabet.charAt(newIndex);
                        cozumlenmisMetin += newChar;
                    }
                }
                if (sifrelemeYontemi == 3) {
                    System.out.print("Ayın Kaçı Olduğunu Girin: ");
                    int month = sc.nextInt();
                    sc.nextLine();
                    int offset = month % 5;
                    for (int i = 0; i < sifreliMetin.length(); i++) {
                        char current = sifreliMetin.charAt(i);
                        int index = alphabet.indexOf(current);
                        int newIndex = (index + alphabet.length() - offset) % alphabet.length();
                        char newChar = alphabet.charAt(newIndex);
                        cozumlenmisMetin += newChar;
                    }
                }
                if (sifrelemeYontemi == 4) {
                    System.out.println("öteleme miktarı giriniz");
                    int otelemeMiktari=sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < sifreliMetin.length(); i++) {
                        char current = sifreliMetin.charAt(i);
                        int index = alphabet.indexOf(current);
                        int newIndex = (index + alphabet.length() - otelemeMiktari%alphabet.length()) % alphabet.length();
                        char newChar = alphabet.charAt(newIndex);
                        cozumlenmisMetin += newChar;
                    }
                }
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("...");
                }
                System.out.println('\"' + sifreliMetin + '\"' + " Şifreli metinin " + sifrelemeYontemi + " numaralı yöntem ile şifresi çözümlenmiş hali şöyledir:");
                System.out.println("->"+cozumlenmisMetin+"<-");
                System.out.println("----------");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("...");
                }

            }

            if (islemNo==3){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("...");
                }
                System.out.println(alphabet);
                System.out.println("----------");
            }
            if (islemNo==0){
                status=false;
            }
        }
    }
}
