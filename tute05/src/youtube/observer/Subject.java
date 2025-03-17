package youtube.observer;

import youtube.Video;

public interface Subject {
    // Adds subscriber to the list of subscribers
    public void registerSubscribers(Observer o);
    // Remove subscribers
    public void removeSubscribers(Observer o);

    // Notifies each subscriber that a video has been uplodaed by calling their update() function
    public void notifyObservers(Video video);
}
