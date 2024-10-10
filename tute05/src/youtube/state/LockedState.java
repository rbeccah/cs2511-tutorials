package youtube.state;

import youtube.VideoPlayer;

public class LockedState extends ViewingState {

    public LockedState(VideoPlayer player) {
        super(player);
    }

    /*
     * onLock() in the LockedState will unlock the video player. There are two cases:
     *  - If the video is playing, it will go to PlayingState
     *  - If video is not playing, it will go to ReadyState
     */
    @Override
    public void onLock() {
        VideoPlayer player = getVideoPlayer();
        if (player.getIsPlaying()) {
            player.changeState(new PlayingState(player));
            System.out.println("Unlock playing video");
        } else {
            player.changeState(new ReadyState(player));
            System.out.println("Unlock ready video");
        }
    }

    @Override
    public void onPlay() {
        System.out.println("Error");
    }

    @Override
    public void onNext() {
        System.out.println("Error");
    }

    @Override
    public String reportState() {
        return "LockedState";
    }
    
}
