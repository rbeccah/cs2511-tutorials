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
     * Seminar is defined as having a list of attendees, who have booked the seminar
     * A client interacting with a Seminar would expect the seminar to be booked like any other class
     * 
     * This class violates LSP: To resolve this, you would need to remove the inheritance
     */
    private String videoURL;

    private List<String> watched;
}
