package youtube.observer;

import youtube.Producer;
import youtube.Video;

public interface Observer {
    // Upon being notified by the Producer, observers will print a message
    // Message -> "Hi observer! A new video {video_name} has been uploaded by {producer_name}"
    public void update(Video video, Producer producer);
}
