package youtube.observer;

import youtube.Producer;
import youtube.Video;

public interface Observer {
    // Print message
    // "Hi {observer_name}, A video {video_name} has been posted by {producer_name}"
    public void update(Video video, Producer producer);
}
