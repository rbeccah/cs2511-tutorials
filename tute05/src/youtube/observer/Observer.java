package youtube.observer;

import youtube.Producer;
import youtube.Video;

public interface Observer {
    // Once we call this update in the observers, this will print a message
    public void update(Video video, Producer producer);
}
