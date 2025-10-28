package overcooked;

/*
 * The thread
 */
// Extending the Thread class allows us to execute code in the run() method simultaneously.
public class Chef extends Thread {
    private String name;
    private int cakesNeeded;
    private OvenMitts mitts;

    public Chef(String name, int cakesNeeded, Oven oven) {
        this.name = name;
        this.cakesNeeded = cakesNeeded;
        this.mitts = OvenMitts.getInstance(oven);
    }

    // This method gets called by Thread::start(). 
    @Override
    public void run() {
        // Begin taking cakes out of the oven.
        mitts.useOven(name, cakesNeeded);
    }
}