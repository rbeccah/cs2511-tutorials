package youtube;

import java.util.ArrayList;
import java.util.List;

import youtube.observer.Observer;
import youtube.observer.Subject;

// ? Who is the Observer?
// * User (Subscribers to Producer)

// ? Who is the Subject?
// * Producer

public class Producer implements Subject {
    private String name;

    // ? What class should I use in this list to facilitate add / remove?
    // Here, we use a list of Observer as in the future we can add additional observers that are not of type Subscriber
    private List<Observer> observers = new ArrayList<Observer>();
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
        System.out.println("I have posted a new video!");
        videos.add(video);
        for (Observer observer : observers) {
            observer.update(video, this);
        }
    }
}
