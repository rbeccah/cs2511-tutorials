package unsw.training;

import java.time.LocalDate;
import java.util.List;

/**
 * An in person all day seminar with a maximum of 10 attendees.
 * @author Robert Clifton-Everest
 *
 */
public class Seminar {
    private LocalDate start;

    private List<String> attendees;

    public LocalDate getStart() {
        return start;
    }

    public List<String> getAttendees() {
        return attendees;
    }

    public LocalDate book(String employee, List<LocalDate> availability) {
        for (LocalDate available : availability) {
            if (getStart().equals(available) && getAttendees().size() < 10) {
                getAttendees().add(employee);
                return available;
            }
        }
        return null;
    }
}
