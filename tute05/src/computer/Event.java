package computer;

public class Event {
    private String creator;
    private boolean isKeyboard;
    private String message;

    public Event(String creator, String message, boolean isKeyboard) {
        this.creator = creator;
        this.message = message;
        this.isKeyboard = isKeyboard;
    }

    public String getCreator() {
        return this.creator;
    }

    public String getMessage() {
        return this.message;
    }

    public boolean isKeyboard() {
        return this.isKeyboard;
    }
}
