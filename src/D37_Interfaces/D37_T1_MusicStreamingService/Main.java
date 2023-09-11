package D37_Interfaces.D37_T1_MusicStreamingService;

public class Main {
    public static void main(String[] args) {

        MusicPlayer mediaPlayer = new MediaPlayer();
        MusicPlayer streamingService = new StreamingService();

        System.out.println("- - - ");
        System.out.println("MEDIA PLAYER");
        mediaPlayer.play("Jump Jump");
        mediaPlayer.pause();
        mediaPlayer.stop();

        System.out.println("- - - ");
        System.out.println("STREAMING SERVICE");
        streamingService.play("Swim Swim Swim");
        streamingService.pause();
        streamingService.stop();

    }
}
