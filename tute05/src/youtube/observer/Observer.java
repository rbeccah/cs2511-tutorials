package youtube.observer;

import youtube.Producer;
import youtube.Video;

public interface Observer {
    // Upon being notified by the Producer they will be a message
    // Message -> "Hi {observer_name}! A new video {video_name} has been uploaded by {producer_name}"
    public void update(Video video, Producer producer);
}
