package computer.peripherals;

import java.util.List;

import computer.Event;
import computer.Peripheral;
import computer.Program;

public class Monitor implements Peripheral, Program {

    private String name;
    private List<Program> subscribers;

    @Override
    public void addSubscriber(Program newSubscriber) {
        this.subscribers.add(newSubscriber);
    }

    @Override
    public void createEvent(String message) {
        Event event = new Event(name, message, false);

        for (Program subscriber : subscribers) {
            subscriber.notify(event);
        }
    }

    @Override
    public void removeSubscriber(Program oldSubscriber) {
        this.subscribers.remove(oldSubscriber);
    }

    @Override
    public void notify(Event event) {
        System.out.println("Monitor: " + event.getCreator() + " - " + event.getMessage());
    }

    public void adjustBrightness(Integer newBrightness) {
        createEvent(newBrightness.toString());
    }
    
}
