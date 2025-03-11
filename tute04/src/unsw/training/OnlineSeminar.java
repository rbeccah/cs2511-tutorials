package unsw.training;

import java.util.List;

/**
 * An online seminar is a video that can be viewed at any time by employees. A
 * record is kept of which employees have watched the seminar.
 * @author Robert Clifton-Everest
 *
 */
public class OnlineSeminar {
    /*
     * Seminar is defined as having a list of live attendees, but OnlineSeminar does not require this
     * You cannot book an OnlineSeminar
     * This OnlineSeminar does not really behave like the superclass Seminar
     * This violates LSP 
     */
    private String videoURL;

    private List<String> watched;
}
