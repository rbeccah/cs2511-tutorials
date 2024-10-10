package youtube;

import youtube.state.ViewingState;
import youtube.state.ReadyState;

public class VideoPlayer {
    private Video video;    // Current video playing
    private Video nextVideo;    // Next video in queue
    private boolean isPlaying = false;

    private ViewingState state = new ReadyState(this);

    public VideoPlayer(Video video, Video nextVideo) {
        this.video = video;
        this.nextVideo = nextVideo;
    }

    // * State methods
    public void lock() {
        state.onLock();
    }

    public void play() {
        state.onPlay();
    }

    public void next() {
        state.onNext();
    }

    // * Allows to actually change the state when we call each of the different methods above
    public void changeState(ViewingState state) {
        this.state = state;
        System.out.print(state.reportState() + ": \t");
    }

    public Video getVideo() {
        return video;
    }

    public Video getNextVideo() {
        return nextVideo;
    }

    public Boolean getIsPlaying() {
        return isPlaying;
    }

    public void setIsPlaying(Boolean isPlaying) {
        this.isPlaying = isPlaying;
    }

    public String playVideo() {
        return "Playing " + video.getName();
    }

    public String playNextVideo() {
        this.video = nextVideo;
        this.nextVideo = null;
        isPlaying = true;
        return playVideo();
    }

    public static void main(String[] args) {
        Producer ashesh = new Producer("Ashesh");
        Video v1 = new Video("Video 1", 60, ashesh);
        Video v2 = new Video("Video 2", 120, ashesh);

        VideoPlayer player = new VideoPlayer(v1, v2);
        player.play();      // Start playing video 1
        player.play();      // Pause video 1
        player.next();      // Play video 2
        player.lock();      // Lock playing video
        player.lock();      // Unlock playing video
    }

}
