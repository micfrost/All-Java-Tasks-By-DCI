package D37_Interfaces.D37_T1_MusicStreamingService;

public class StreamingService implements MusicPlayer {
    String currentSong;
    String playbackStatus;


    @Override
    public void play(String song) {
        System.out.printf("Song %s is streaming.\n", song);
        playbackStatus="streaming";
    }

    @Override
    public void pause() {
        System.out.println("Streaming is paused.");
        playbackStatus="paused";
    }

    @Override
    public void stop() {
        System.out.println("Streaming has stopped.");
        playbackStatus="stopped";
    }
}
