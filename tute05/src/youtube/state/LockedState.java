package youtube.state;

import youtube.VideoPlayer;

public class LockedState extends ViewingState {
    public LockedState(VideoPlayer player) {
        super(player);
    }

    /*
     * onLock() in LockedState will unlock the video player. There are 2 cases:
     *  - If video is playing, it will go to PlayingState
     *  - If no video playing, it will go to ReadyState
     */
    @Override
    public void onLock() {
        VideoPlayer player = getVideoPlayer();
        if (player.getIsPlaying()) {
            player.changeState(new PlayingState(player));
            System.out.println("Unlock playing video");
        } else {
            player.changeState(new ReadyState(player));
            System.out.println("Ready to play video");
        }
    }

    @Override
    public void onPlay() {
        System.out.println("Error: Cannot play the current video because it is locked");
    }

    @Override
    public void onNext() {
        System.out.println("Error: Cannot play the next video because it is locked");
    }

    @Override
    public String reportState() {
        return "LockedState";
    }
}
