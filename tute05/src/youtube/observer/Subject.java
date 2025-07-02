package youtube.observer;

import youtube.Video;

public interface Subject {
    public void registerSubscriber(Observer o);
    public void removeSubscriber(Observer o);

    // Notifies each subscriber that a video has been uploaded by calling each of their update() functions
    // Pushing data (video) to our subject
    public void notifySubscribers(Video video);
}
