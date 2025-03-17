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

        // We want to add Amanda and Alvin to list of subscribers
        ashesh.registerSubscribers(alvin);
        ashesh.registerSubscribers(amanda);

        Video video = new Video("COMP2511 Lecture 1", 100, ashesh);

        // Subject broadcast a video to its subscribers
        ashesh.notifyObservers(video);
    }
}
