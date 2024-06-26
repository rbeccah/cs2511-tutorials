package youtube.state;

import youtube.VideoPlayer;

// ? Suppose we want to add a new state. What do we need to do?
// We just need to add a new class that extends ViewingState abstract class
// This does not violate the Open-Closed Principle!

public abstract class ViewingState {
    // ? Why does the base ViewingState hold a reference to a VideoPlayer? 
    // We need the VideoPlayer to be able to change its state
    // e.g. player.changeState(new LockedState(player));

    private VideoPlayer player;

    public ViewingState(VideoPlayer player) {
        this.player = player;
    }

    // * The base state defines the methods that can be used to change state
    public abstract void onLock();
    public abstract void onPlay();
    public abstract void onNext();
    public abstract String reportState();

    public VideoPlayer getVideoPlayer() {
        return player;
    }
}
