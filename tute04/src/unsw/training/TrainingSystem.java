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
            // Abstraction
            LocalDate bookedDate = trainer.book(employee, availability);
            if (bookedDate != null) {
                return bookedDate;
            }
        }
        return null;
    }

        // ? How does the Training System violate the Law of Demeter
        // line 11: fine because we are iterating over a list of trainers 
        // line 12: fine because Trainer is a friend (as it is the attribute to this class)
        // line 13: fine
        // ! line 14: not fine, because we are accessing methods in Seminar who is not a friend

        // ? What other properties of this design is undesirable
        // TrainingSystem is needlessly coupled with Trainer and Seminar
        // TrainingSystem is low cohesion 
        // Seminar class is poorly encapsulated
            // restriction of seminar capacity is not enforced by the Seminar class itself
}
