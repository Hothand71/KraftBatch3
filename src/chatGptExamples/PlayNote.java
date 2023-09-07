package chatGptExamples;
import javax.sound.sampled.*;
import java.io.File;

public class PlayNote {
    public static void main(String[] args) {
        try {
            // Ses dosyasını yükleyin
            File file = new File("note.wav");
            AudioInputStream stream = AudioSystem.getAudioInputStream(file);

            // Ses dosyasını çalma işlemini başlatın
            Clip clip = AudioSystem.getClip();
            clip.open(stream);
            clip.start();

            // Ses dosyası bitene kadar bekleyin
            Thread.sleep(clip.getMicrosecondLength() / 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}