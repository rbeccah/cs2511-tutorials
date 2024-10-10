package youtube.observer;

import youtube.Producer;
import youtube.Video;

public interface Observer {
    // Upon being notified by Producer, Observer will print a message
    // Message-> "Hi observer! A new video was just posted by producer"
    public void update(Video video, Producer producer);
}
