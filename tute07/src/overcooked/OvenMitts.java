package overcooked;

/* 
 * Access point to the shared resource (Oven)
 */
public class OvenMitts {
    private Oven oven;
    private static OvenMitts instance = null;

    // Constructor is private to prevent other classes from using the new operator
    private OvenMitts(Oven oven) {
        this.oven = oven;
    }

    // * synchronized: only one thread can access this piece of code at any one time
    public static synchronized OvenMitts getInstance(Oven oven) {
        if (instance == null) {
            instance = new OvenMitts(oven);
        }
        return instance;
    }

    // ? Why might syncrhonized be bad? 
    // Lost the benefit of using multiple threads
    public synchronized void useOven(String chef, int cakesNeeded) {
        System.out.println(chef + " puts on the oven mitts and opens the oven...");

        for (int i = 0; i < cakesNeeded; i++) {
            if (oven.takeCake()) { // In the event there's a cake available, we take it out.
                System.out.println(chef + " took a cake out! (" + oven.getCakes() + " left)");
            } else { // In the event there are no cakes left, we cry.
                System.out.println(chef + " found the oven empty!");
            }

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println(chef + " closes the oven and takes off the mitts.");
    }
}
