package youtube;

import java.util.ArrayList;
import java.util.List;

import youtube.observer.Observer;
import youtube.observer.Subject;

// ? What is the Observer
// * User / Subscriber

// ? What is the Subject
// * Producer

public class Producer implements Subject {
    private String name;
    // ? Why do we have a list of Observers instead of Users? 
    // Here, in the future we add additional observers that are not of the type User
    private List<Observer> subscribers = new ArrayList<>();
    private List<Video> videos = new ArrayList<>();

    public Producer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void registerObserver(Observer o) {
        subscribers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        subscribers.remove(o);
    }

    @Override
    public void notifyObservers(Video video) {
        videos.add(video);
        System.out.println("A video has been uploaded!");
        for (Observer observer : subscribers) {
            observer.update(video, this);
        }
    }
}
