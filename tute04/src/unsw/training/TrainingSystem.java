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
    // Line 11
    // Line 12: fine because we can call methods from the Trainer which is a friend (Trainer is in the attribute)
    // Line 13: 
    // ! Line 14: not fine, because we are accessing methods in Seminar class (getStart() and getAttendees()) who is not a friend

    // ? What other properties of this design is undesirable
    // Nesting of for loops
    // TrainingSystem is coupled with Trainer and Seminar
    // TrainingSystem has low cohesion as it relies on classes that are not its friends
    // Seminar is poorly encapsulated 
        // restriction capacity is not enforced by the class itself, also low responsbility 
}
