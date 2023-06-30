package AdaptorDP.MediaPlayer;

public class AdaptorPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "abc.mp3");
        audioPlayer.play("MP4", "abc.mp4");
        audioPlayer.play("vlc", "abc.vlc");
        audioPlayer.play("avi", "abc.avi");
    }
}
