package youtube.observer;

import youtube.Video;

public interface Subject {
    // Adds subscriber to the list of subscribers
    public void registerSubscriber(Observer o);
    // Removes subscriber
    public void removeSubscriber(Observer o);

    // Notifies each subscriber that a video has been uploaded by calling each of the observer's update functions
    public void notifyObservers(Video video);
}
