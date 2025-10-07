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

    // ? How does the Training System violate the Law of Demeter
    // line 11: fine because we can iterate over our own attributes
    // line 12: fine 
    // line 13
    // ! line 14: not fine because accessing getStart and getAttendees violates LoD as Seminar is not a friend

    // ? What other properties of this design is undesirable
    // Having too many nested for loops
    // Low cohesion, this book function is doing too much
    // TrainingSystem is coupled with Trainer and Seminar
    // Seminar class is poorly encapsulated
        // restriction of seminar capacity < 10 should enforced by the Seminar class itself
}
