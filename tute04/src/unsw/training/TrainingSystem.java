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
    // line 11: trainer is an attribute
    // line 12: 
    // line 13: 
    // ! line 14: Seminar is not a friend to the TrainsController

    // ? What other properties of this design is undesirable
    // Nested for loops
    // TrainingSystem is too coupled with Trainer and Seminar
    // Low cohesion it is doing too much
    // Seminar is poorly encapsulated
        // Restriction for seminar count is controlled by TrainingSystem when it should be done by the Seminar
}
