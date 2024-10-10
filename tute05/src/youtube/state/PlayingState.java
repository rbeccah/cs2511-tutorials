package youtube.state;

import youtube.VideoPlayer;

public class PlayingState extends ViewingState {

    public PlayingState(VideoPlayer player) {
        super(player);
    }

    @Override
    public void onLock() {
        VideoPlayer player = getVideoPlayer();
        player.changeState(new LockedState(player));
        System.out.println("Locking the video player in playing");
    }

    /*
     * onPlay() in PlayingState will undo the play (pause)
     */
    @Override
    public void onPlay() {
        VideoPlayer player = getVideoPlayer();
        player.changeState(new ReadyState(player));
        System.out.println("Pausing the video player");
    }

    @Override
    public void onNext() {
        VideoPlayer player = getVideoPlayer();
        player.changeState(new PlayingState(player));
        System.out.println(player.playNextVideo());
    }

    @Override
    public String reportState() {
        return "PlayingState";
    }
    
}
