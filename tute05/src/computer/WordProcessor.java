package computer;

public class WordProcessor implements Program {

    @Override
    public void notify(Event event) {
        if (event.isKeyboard()) {
            System.out.println("Word Processor: " + event.getMessage());
        }
    }
    
}
