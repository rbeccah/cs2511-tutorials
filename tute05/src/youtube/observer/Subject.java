package youtube.observer;

import youtube.Video;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifySubscribers(Video video);
}
