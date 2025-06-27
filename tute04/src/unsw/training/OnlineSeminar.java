package unsw.training;

import java.time.LocalDate;
import java.util.List;

/**
 * An online seminar is a video that can be viewed at any time by employees. A
 * record is kept of which employees have watched the seminar.
 * @author Robert Clifton-Everest
 *
 */
public class OnlineSeminar {
    /*
     * Seminar is defined as having a time and also the ability to book the seminar. But OnlineSemianr does not reqquire any of this
     * 
     * Therefore, OnlineSeminar is not behaving like my Seminar superclass
     * Violate LSP
     * 
     */
    private String videoURL;

    private List<String> watched;

    // refused bequest
    // @Override
    // public LocalDate book(String employee, List<LocalDate> availability) {
    //     return null;
    // }
}
