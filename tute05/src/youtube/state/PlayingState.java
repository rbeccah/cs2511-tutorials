package youtube.state;

import youtube.VideoPlayer;

public class PlayingState extends ViewingState {

    public PlayingState(VideoPlayer player) {
        super(player);
    }

    @Override
    public void onLock() {

    }

    /*
     * onPlay() in PlayingState will undo the play (pause)
     */
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
