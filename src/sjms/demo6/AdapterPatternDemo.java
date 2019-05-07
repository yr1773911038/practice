package sjms.demo6;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3","hhhhhh");
        audioPlayer.play("vlc","1111");
        audioPlayer.play("mp4","eeee");
    }
}
