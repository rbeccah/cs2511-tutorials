package youtube.observer;

import youtube.Producer;
import youtube.Video;

public interface Observer {
    // Upon being notified by the Producer (Subject) it will print a message
    // Message -> Hi observer_name, this producer has uploaded a video
    public void update(Video video, Producer producer);
}
