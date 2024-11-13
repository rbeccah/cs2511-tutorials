package trains;

public class CargoWagon extends Wagon {
    public static final String TYPE = "CargoWagon";
    public static final int POWER_REQUIRED = 1000;

    public CargoWagon() {
        super(TYPE);
    }
    
}