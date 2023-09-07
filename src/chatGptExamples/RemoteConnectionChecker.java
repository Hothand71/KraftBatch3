package chatGptExamples;
import java.net.InetAddress;

public class RemoteConnectionChecker {
    public static void main(String[] args) {
        try {
            InetAddress addr = InetAddress.getByName(args[0]);
            if (addr.isReachable(5000)) {
                System.out.println("Bağlantı kuruldu.");
            } else {
                System.out.println("Bağlantı kurulamadı.");
            }
        } catch (Exception e) {
            System.out.println("Bir hata oluştu: " + e.getMessage());
        }
    }
}