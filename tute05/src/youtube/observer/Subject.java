package youtube.observer;

import youtube.Video;

public interface Subject {
    // Adds subcriber to the list of Subscribers
    public void registerSubscriber(Observer o);
    // Removes subscriber from the list of Subscribers
    public void removeSubscriber(Observer o);

    // Notifies each subscriber that a video has been uploaded by calling each of their update() functions
    // Here, we are pushing data (video) to the observers
    public void notifySubscribers(Video video);
}
