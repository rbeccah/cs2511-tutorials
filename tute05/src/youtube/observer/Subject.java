package youtube.observer;

import youtube.Video;

public interface Subject {
    public void registerSubscribers(Observer o);
    public void removeSubscriber(Observer o);

    public void notifySubscribers(Video video);
}
