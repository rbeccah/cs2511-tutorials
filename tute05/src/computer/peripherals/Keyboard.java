package computer.peripherals;

import java.util.ArrayList;
import java.util.List;

import computer.Program;
import computer.Event;
import computer.Peripheral;

public class Keyboard implements Peripheral {

    private String name;
    private List<Program> subscribers;

    public Keyboard(String name) {
        this.name = name;
        this.subscribers = new ArrayList<Program>();
    }

    @Override
    public void addSubscriber(Program newSubscriber) {
        this.subscribers.add(newSubscriber);
    }

    @Override
    public void createEvent(String message) {
        Event event = new Event(name, message, true);
        
        for (Program subscriber : subscribers) {
            subscriber.notify(event);
        }
    }

    @Override
    public void removeSubscriber(Program oldSubscriber) {
        this.subscribers.remove(oldSubscriber);
    }
    
    public void type(String input) {
        createEvent(input);
    }
}
