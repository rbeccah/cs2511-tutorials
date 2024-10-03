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
     * Seminar has a list of attendees, and attendees can book the Seminar
     * OnlineSeminar you cannot book the Seminar, there is no trainer, it doesn't have a start date
     * OnlineSeminar doesn't actually behave like a Seminar
     * 
     * This class violates LSP! 
     */
    private String videoURL;

    private List<String> watched;
}
