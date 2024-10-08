package youtube.state;

import youtube.VideoPlayer;

public abstract class ViewingState {
    // ? Why does the base ViewingState hold a reference to a VideoPlayer?
    private VideoPlayer player;

    public ViewingState(VideoPlayer player) {
        this.player = player;
    }

    public abstract void onLock();
    public abstract void onPlay();
    public abstract void onNext();
    public abstract String reportState();

    public VideoPlayer getVideoPlayer() {
        return player;
    }
}
