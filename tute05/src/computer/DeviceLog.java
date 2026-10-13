package computer;

public class DeviceLog implements Program {

    @Override
    public void notify(Event event) {
        System.out.println("Device log: " + event.getCreator() + " - " + event.getMessage());
    }
    
}
