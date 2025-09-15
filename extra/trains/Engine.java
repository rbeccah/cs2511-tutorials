package trains;

public class Engine extends Wagon {
    public static String TYPE = "ENGINE";

    private int enginePower;

    public Engine(int enginePower) {
        super(TYPE);
        this.enginePower = enginePower;
    }

    public int getEnginePower() {
        return enginePower;
    }
}
