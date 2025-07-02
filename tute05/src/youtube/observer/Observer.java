package youtube.observer;

import youtube.Producer;
import youtube.Video;

public interface Observer {
    public void update(Video video, Producer producer);
}
