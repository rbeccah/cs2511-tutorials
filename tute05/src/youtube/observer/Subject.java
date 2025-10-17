package youtube.observer;

import youtube.Video;

public interface Subject {
    public void registerSubscriber(Observer o);
    public void removeSubscriber(Observer o);

    // Notifies each subscriber that a video has been uploaded calling the update() in each of the observers
    public void notifySubscribers(Video video);
}
