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
    // line 11: 
    // line 12: fine because Trainer is an attribute of this class so it is a friend
    // line 13: fine because LocalDate is passed in as a parameter to the method
    // line 14: violates LoD because of 2 degrees of sepearation 

    // ? What other properties of this design is undesirable
    // Nesting of for looops
    // TrainingSystem is needless coupled with Trainer and Seminar
    // TrainingSystem has low cohesion as it relies on classes that are not its friends
    // Seminar class is poorly encapsulated
        // restriction of seminar capacity < 10 is not enforced by the class itself
    // Lack of abstraction / modularisation
        // String employee
}
