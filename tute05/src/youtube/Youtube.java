package youtube;

/*
 * Create a producer
 * Create 2 subscribers
 * Have both subscribers subscribe to a new producer
 * Producer uploads a new video
 */

public class Youtube {
    public static void main(String[] args) {
        Producer ashesh = new Producer("Ashesh");
        User amanda = new User("Amanda");
        User alvin = new User("Alvin");

        // We add Amanda and Alvin as subscribers to Ashesh
        ashesh.registerObserver(alvin);
        ashesh.registerObserver(amanda);

        Video video = new Video("COMP2511 Lecture 1", 100, ashesh);

        // Subject broadcasting a video to its subscribers
        ashesh.notifyObservers(video);
    }
}
