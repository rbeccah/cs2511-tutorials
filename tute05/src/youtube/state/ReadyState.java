package youtube.state;

import youtube.VideoPlayer;

public class ReadyState extends ViewingState {

    public ReadyState(VideoPlayer player) {
        super(player);
    }

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
