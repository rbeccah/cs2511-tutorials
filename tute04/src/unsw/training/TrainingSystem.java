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
    // line 11: is fine, we are just iterating through our attribute trainers
    // line 12: fine because calling methods from the Trainer class which is a friend (attribute)
    // line 13: fine because LocalDate is a type that is passed in as a parameter (friend) 
    // ! line 14: not fine because we are accessing methods (getStart) from the Seminar class
    
    // ? What other properties of this design is undesirable
    // Nested for loops
    // TrainingSystem is low cohesino as it is doing too many things in the system 
    // TrainingSystem has high coupling with Trainer and Seminar
    // Seminar is poorly encapsulated
        // restriction of seminar capacity < 10 is not enforced by the class itself
    // Modularised
        // String employee into an actual class Employee

}
