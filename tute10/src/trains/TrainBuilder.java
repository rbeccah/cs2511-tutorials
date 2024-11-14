package trains;

import java.util.ArrayList;

import java.util.List;

public class TrainBuilder {
    private int wagonPowerSoFar = 0;
    private List<Wagon> cars = new ArrayList<>();

    public TrainBuilder addHighPoweredEngine() {
        cars.add(new Engine(2000));
        wagonPowerSoFar += 2000;
        return this;
    }

    public TrainBuilder addEngine() {
        cars.add(new Engine(1000));
        wagonPowerSoFar += 1000;
        return this;
    }

    public TrainBuilder addPassengerWagon() {
        if (wagonPowerSoFar - PassengerWagon.POWER_REQUIRED < 0) {
            throw new IllegalStateException("Power cannot be less than 0 at any point");
        }
        cars.add(new PassengerWagon());
        return this;
    }

    public TrainBuilder addCargoWagon() {
        if (wagonPowerSoFar - CargoWagon.POWER_REQUIRED < 0) {
            throw new IllegalStateException("Power cannot be less than 0 at any point");
        }
        cars.add(new CargoWagon());
        return this;
    }

    public Train build() {
        return new Train(cars);
    }
}
