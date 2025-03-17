package youtube.observer;

import youtube.Producer;
import youtube.Video;

public interface Observer {
    // Upon being notified by the Producer (Subject) we will print a message in the observer
    // Message -> "Hi {observer_name}! A new video {video_name} has been posted by {producer_name}"
    public void update(Video video, Producer producer);
}
