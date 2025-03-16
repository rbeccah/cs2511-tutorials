package youtube;

public class VideoPlayer {
    private Video video;    // Current video playing
    private Video nextVideo;    // Next video in queue
    private boolean isPlaying = false;

    public VideoPlayer(Video video, Video nextVideo) {
        this.video = video;
        this.nextVideo = nextVideo;
    }

    /* Insert State pattern functions here */

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
        // Producer ashesh = new Producer("Ashesh");
        // Video v1 = new Video("Video 1", 60, ashesh);
        // Video v2 = new Video("Video 2", 120, ashesh);

        // VideoPlayer player = new VideoPlayer(v1, v2);
        // player.play();      // Start playing video 1
        // player.play();      // Pause video 1
        // player.next();      // Play video 2
        // player.lock();      // Lock playing video
        // player.lock();      // Unlock playing video
    }

}
