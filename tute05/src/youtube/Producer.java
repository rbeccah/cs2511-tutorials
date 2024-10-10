package youtube;

import java.util.ArrayList;
import java.util.List;

import youtube.observer.Observer;
import youtube.observer.Subject;

// ? Who is the Observer?
// * User (subscribers to the Producer)

// ? Who is the Subject?
// * Producer

public class Producer implements Subject {
    private String name;
    private List<Video> videos = new ArrayList<Video>();
    private List<Observer> observers = new ArrayList<Observer>();

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
    public void notifyObservers(Video video) {
        System.out.println("I just uploaded a new video");
        for (Observer o : observers) {
            o.update(video, this);
        }
    }
}
