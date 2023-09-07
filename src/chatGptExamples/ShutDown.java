package chatGptExamples;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class ShutDown {
    public static void main(String[] args) {
        try {
            // Kullanıcıdan IP adresini al
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("IP adresini girin: ");
            String ip = input.readLine();

            // IP adresini kontrol et
            InetAddress inet = InetAddress.getByName(ip);
            if (inet.isReachable(5000)) {
                // IP adresine sahip bilgisayarı kapat
                Runtime.getRuntime().exec("shutdown -s -t 0");
            } else {
                System.out.println("Girdiğiniz IP adresine sahip bir bilgisayar bulunamadı!");
            }
        } catch (UnknownHostException e) {
            System.out.println("Geçersiz IP adresi!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
