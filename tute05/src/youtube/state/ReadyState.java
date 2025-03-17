package youtube.state;

import youtube.VideoPlayer;

public class ReadyState extends ViewingState {

    public ReadyState(VideoPlayer player) {
        super(player);
    }

    @Override
    public void onLock() {
        VideoPlayer player = getVideoPlayer();
        player.changeState(new LockedState(player));
        System.out.println("Locking the video player");
    }

    @Override
    public void onPlay() {
        VideoPlayer player = getVideoPlayer();
        player.changeState(new PlayingState(player));
        System.out.println(player.playVideo());
    }

    @Override
    public void onNext() {
        VideoPlayer player = getVideoPlayer();
        player.changeState(new PlayingState(player));
        System.out.println(player.playNextVideo());
    }

    @Override
    public String reportState() {
        return "ReadyState";
    }
    
}
