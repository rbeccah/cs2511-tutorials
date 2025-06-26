package unsw.training;

import java.time.LocalDate;
import java.util.List;

public class TrainingSystem {

    private List<Trainer> trainers;

    // Nesting 
    // Hard to read and overly complex

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
    // line 14: fine becaise we are iterating over our own attributes of the class
    // line 15: fine because Trainer is a friend (in its attributes), so we can access the methods
    // line 16: fine
    // ! line 17: Seminar is not a friend, so here we are violating LoD

    // ? What other properties of this design is undesirable
    // TrainingSystem is needlessly coupled with Trainer and Seminar
    // TrainingSystem has low cohesion 
    // Seminar is poorly encapsulated
        // restriction of the seminar capacity should be done by the Seminar 
}
