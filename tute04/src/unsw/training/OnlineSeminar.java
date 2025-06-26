package unsw.training;

import java.util.List;

/**
 * An online seminar is a video that can be viewed at any time by employees. A
 * record is kept of which employees have watched the seminar.
 * @author Robert Clifton-Everest
 *
 */
public class OnlineSeminar {
    /**
     * Seminar is defined as having a list of attendees, time and functionality to be able to be booked, but OnlineSeminar does not require this
     * 
     * OnlineSeminar is not behaving like the Seminar superclass 
     * This violate LSP
     */
    private String videoURL;

    private List<String> watched;
}

// Student
// Had no salary
// salary = 0
