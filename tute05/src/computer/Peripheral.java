package computer;

public interface Peripheral {
    public void addSubscriber(Program newSubscriber);

    public void createEvent(String message);

    public void removeSubscriber(Program oldSubscriber);
}
