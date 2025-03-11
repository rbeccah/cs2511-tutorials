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
    // line 11: fine because we are just iterating over a list of trainers
    // line 12: Trainer is an attribute to this class, so it is a friend, so we can accessmethods in trainer
    // line 13: 
    // ! line 14: not fine because we are accessing methods in Seminar which is not a friend

    // ? What other properties of this design is undesirable
    // Nested for loops (high complexity)
    // TrainingSystem is needlessly coupled with Trainer and Seminar
    // TrainingSystem has low cohesion
    // Seminar is poorly encapsulated
        // restriction of seminar capacity is not enforced by the class itself
}
