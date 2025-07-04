package youtube.observer;

import youtube.Producer;
import youtube.Video;

public interface Observer {
    // Upon being notified by the Producer (Subject) will print a message
    // Message -> "Hi {observer_name}! A new video {video_name} was just posted by {producer_name}"
    // Note, data (Video) is both being pushed by the producer and being pulled from the Producer (producer.getName())
    public void update(Video video, Producer producer);
}
