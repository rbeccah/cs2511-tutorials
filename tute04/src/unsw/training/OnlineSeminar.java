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
     * Seminar is defined as having  a list of attendees and also booking and has a time, but the OnlineSeminar does not have any of this
     * OnlineSeminar is not behaving like the Seminar class
     * Violates LSP
     * Example where the inheritance relationship itself is invalid
     */
    private String videoURL;

    private List<String> watched;
}
