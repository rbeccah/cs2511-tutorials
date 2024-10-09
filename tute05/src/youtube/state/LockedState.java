package youtube.state;

import youtube.VideoPlayer;

public class LockedState extends ViewingState {

    public LockedState(VideoPlayer player) {
        super(player);
    }

    /*
     * onLock() in the LockedState will unlock the video player. There are two cases:
     *  - If the video is playing, it will go to PlayingState
     *  - If video is not playing, it will go to LockedState
     */
    @Override
    public void onLock() {

    }

    @Override
    public void onPlay() {

    }

    @Override
    public void onNext() {
        
    }

    @Override
    public String reportState() {
        return null;
    }
    
}
