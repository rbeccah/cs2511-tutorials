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
     * Seminar is defined as having a list of attendees, but OnlineSeminar does not require this
     * A client interacting with OnlineSeminar would expect this to be booked like any other Seminar
     * 
     * This is an example of classes having IS-A relationship formally, but not a valid inheritance relationship when actually taking into account what the class actually does and what it represents
     * 
     * This class violates LSP! How to fix this, is to just remove the inheritance
     */

    private String videoURL;

    private List<String> watched;
}
