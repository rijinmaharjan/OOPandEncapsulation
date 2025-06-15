class MediaPlayer {
    void play() {
        System.out.println("Playing...");
    }

    void pause() {
        System.out.println("Paused.");
    }

    void stop() {
        System.out.println("Stopped.");
    }
}
interface Playlist {
    void addSong(String song);
    void removeSong(String song);
}
class VideoPlayer extends MediaPlayer implements Playlist {
    @Override
    public void addSong(String song) {
        System.out.println("Added: " + song);
    }

    @Override
    public void removeSong(String song) {
        System.out.println("Removed: " + song);
    }

    void rewind() {
        System.out.println("Rewinding...");
    }

    void fastForward() {
        System.out.println("Fast forwarding...");
    }
}

public class SimpleMediaPlayer {
    public static void main(String[] args) {
        VideoPlayer player = new VideoPlayer();

        player.play();
        player.pause();
        player.stop();

        player.rewind();
        player.fastForward();

        player.addSong("Song 1");
        player.removeSong("Song 1");
    }
}