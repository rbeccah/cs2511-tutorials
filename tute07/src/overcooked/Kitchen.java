package overcooked;

/* 
 * Main program
 */
public class Kitchen {
    public static void main(String[] args) {
        Oven oven = new Oven(180);
        oven.preheat(); // Preheat the oven so we can bake the cakes.
        oven.loadCakes(10); // Start with 10 cakes ready to come out.

        Chef gordon = new Chef("Gordon", 3, oven);
        Chef julia = new Chef("Julia", 4, oven);
        Chef jamie = new Chef("Jamie", 5, oven);

        // Tell all the chefs to start working.
        // * Creates a new thread of execution in the OS, then automatically calls thread's run() in that new thread
        gordon.start();
        julia.start();
        jamie.start();

        // Here we wait for all the chefs to finish their tasks.
        try {
            // * joing() -> wait for a thread to finish their tasks
            gordon.join();
            julia.join();
            jamie.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\n---");
        System.out.println("\nCakes left in oven: " + oven.getCakes() + "\n");
    }
}
