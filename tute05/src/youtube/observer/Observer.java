package youtube.observer;

import youtube.Producer;
import youtube.Video;

public interface Observer {
    // Upon being notified
    // message -> "Hi {observer_name}! A new video {video_name} has been posted by {producer_name}"
    public void update(Producer producer, Video video);
}
