package overcooked;

public class Oven {
    private int temperature;
    private int cakes;
    
    public Oven(int temperature) {
        this.temperature = temperature;
    }
    
    public void preheat() {
        System.out.println("\n\nPreheating oven to " + temperature + "°C...");
    }

    public void loadCakes(int amount) {
        this.cakes = amount;
        System.out.println("Loaded the oven with " + amount + " cakes...");
        System.out.println("\n---\n");
    }

    public boolean takeCake() {
        if (cakes > 0) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            cakes--;
            return true;
        }
        return false;
    }

    public int getCakes() {
        return cakes;
    }
}
