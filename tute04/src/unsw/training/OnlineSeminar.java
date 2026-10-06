package unsw.training;

import java.util.List;

/**
 * An online seminar is a video that can be viewed at any time by employees. A
 * record is kept of which employees have watched the seminar.
 * @author Robert Clifton-Everest
 *
 */
public class OnlineSeminar {
    // Seminar is defined as having a list of attendees, but OnlineSeminar does not require attendees
    // A class interacting with Seminar would expect the seminar to also be booked like other 
    // This is an example of classes having IS-A relationship when it should not be

    // This class violates LSP, because OnlineSeminar is not behaving like the Seminar superclass, you cannot book an OnlineSeminar like Seminar
    private String videoURL;

    private List<String> watched;
}
