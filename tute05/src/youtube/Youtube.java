package youtube;

/*
 * Create a producer
 * Create 2 subscribers
 * Have both subscribers subscribe to the producer
 * Producer uploads a new video
 */

public class Youtube {
    public static void main(String[] args) {
        Producer ashesh = new Producer("Ashesh");
        User amanda = new User("Amanda");
        User alvin = new User("Alvin");

        // We add Amanda and Alvin as subscribers to Ashesh
        ashesh.registerObserver(amanda);
        ashesh.registerObserver(alvin);

        Video video = new Video("COMP2511 Lectur 1", 100, ashesh);

        // Subject broadcast to all the subscribers
        ashesh.notifySubscribers(video);
    }
}
