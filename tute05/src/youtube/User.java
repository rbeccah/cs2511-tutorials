package youtube;

import youtube.observer.Observer;

public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(Video video, Producer producer) {
        String message = "Hi " + name + "! A new video " + video.getName()
                            + " was just posted by " + producer.getName();
        System.out.println(message);
    }
}
