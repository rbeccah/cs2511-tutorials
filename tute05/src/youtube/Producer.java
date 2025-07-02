package youtube;

import java.util.ArrayList;
import java.util.List;

import youtube.observer.Observer;
import youtube.observer.Subject;

// ? Who is the Observer?
// * User (subscribing / observing the subject)

// ? Who is the Subject?
// * Producer

public class Producer implements Subject {
    private String name;
    private List<Observer> observers = new ArrayList<>();
    private List<Video> videos = new ArrayList<Video>();

    public Producer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void registerSubscriber(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeSubscriber(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifySubscribers(Video video) {
        System.out.println("I have posted a video");
        videos.add(video);
        for (Observer observer : observers) {
            observer.update(video, this);
        }
    }
}
