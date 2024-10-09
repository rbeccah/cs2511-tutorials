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
    }
}
