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
     * Seminar is defined as having a list of attendees and can also be booked
     * This is an example of an invalid inheritance relationship
     * 
     * Violates LSP
     */
    private String videoURL;

    private List<String> watched;
}
