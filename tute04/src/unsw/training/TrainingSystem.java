package unsw.training;

import java.time.LocalDate;
import java.util.List;

public class TrainingSystem {

    private List<Trainer> trainers;

    // Too much nesting

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
    // line 13: fine, because we are just iterating over our own attributes
    // line 14: fine, because Trainer is an attribute of this class
    // line 15: fine
    // ! line 16: not fine, this violates LoD

    // ? What other properties of this design is undesirable
    // TrainingSystem is needlessly coupled wiht the Trainer and Seminar
    // TrainingSystem has low cohesion because it does too much in one function
    // Seminar class is poorly encapsulated
        // the capacity check for seminar should be done by the Seminar class itself
}
