package D37_Interfaces.D37_T1_MusicStreamingService;

public class MediaPlayer implements MusicPlayer{
    String currentSong;
    String playbackStatus;


    @Override
    public void play(String song) {
        System.out.printf("Song %s is playing.\n", song);
        playbackStatus="playing";
    }

    @Override
    public void pause() {
        System.out.println("Playing is paused.");
        playbackStatus="paused";
    }

    @Override
    public void stop() {
        System.out.println("Playing has stopped.");
        playbackStatus="stopped";
    }
}
