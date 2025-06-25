package unsw.training;

import java.time.LocalDate;
import java.util.List;

public class TrainingSystem {

    private List<Trainer> trainers;

    // public LocalDate bookTraining(String employee, List<LocalDate> availability) {
    //     for (Trainer trainer : trainers) {
    //         for (Seminar seminar : trainer.getSeminars()) {
    //             for (LocalDate available : availability) {
    //                 if (seminar.getStart().equals(available) &&
    //                         seminar.getAttendees().size() < 10) {
    //                     seminar.getAttendees().add(employee);
    //                     return available;
    //                 }
    //             }
    //         }
    //     }
    //     return null;
    // }

    public LocalDate bookTraining(String employee, List<LocalDate> availability) {
        for (Trainer trainer : trainers) {
            LocalDate bookedDate = trainer.book(employee, availability);
            if (bookedDate != null) {
                return bookedDate;
            }
        }
        return null;
    }

    // Nesting

    // ? How does the Training System violate the Law of Demeter
    // line 11: iterating over the attribute trainers
    // line 12: fine, because we can access methods from our attributes
    // line 13: fine, parameter
    // ! line 14: not fine, because we are accessing methods (getStart, getAttendees) from the Seminar class which is not a friend

    // ? What other properties of this design is undesirable
    // TrainingSystem is needlessly coupled with Trainer and Seminar
    // TrainingSystem has low cohesion as it relies on classes that are not its
    // Seminar is poorly encapsulated
        // restricting of attendees capacity < 10 should not be in the TraininSystem class itself
    // Lack of abstraction / modularisation
}
