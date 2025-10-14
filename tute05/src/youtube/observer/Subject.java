package youtube.observer;

import youtube.Video;

public interface Subject {
    public void registerSubscribers(Observer o);
    public void removeSubscribers(Observer o);

    // Notifies each subscriber that a video has been uploaded
    public void notifySubscribers(Video video);
}
