package chatGptExamples;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

public class IPLocationFinder {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine(); // konumu bulunacak IP adresi

        URL url = new URL("http://ip-api.com/json/" + ip);
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        String line = reader.readLine();
        System.out.println(line);
    }
}