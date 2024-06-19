package unsw.training;

import java.time.LocalDate;
import java.util.List;

public class TrainingSystem {

    private List<Trainer> trainers;

    /*
    public LocalDate bookTraining(String employee, List<LocalDate> availability) {
        for (Trainer trainer : trainers) {
            for (Seminar seminar : trainer.getSeminars()) {     // Move this to Trainer
                for (LocalDate available : availability) {      // Move this to Seminar
                    if (seminar.getStart().equals(available) &&
                            seminar.getAttendees().size() < 10) {
                        seminar.getAttendees().add(employee);
                        return available;
                    }
                }
            }
        }
        return null;
    }
    */

    public LocalDate bookTraining(String employee, List<LocalDate> availability) {
        for (Trainer trainer : trainers) {
            LocalDate bookedDate = trainer.book(employee, availability);
            if (bookedDate != null) {
                return bookedDate;
            }
        }
        return null;
    }

    // ? How does TrainingSystem violate the Law of Demeter
    // Line 11: fine because we are iterating over a list of trainers which is an attribute of this class
    // Line 12: fine because we call methods of the Trainer class which is a friend (attribute of the class)
    // Line 13: fine because we can access values passed in as the parameter
    // ! Line 14: not fine because we are accessing methods (getStart, getAttendees) from the Seminar class
    // ! which is not a friend 


    // ? What other properties of this design is undesirable? 
    // Too much nesting in one function
    // TrainingSystem is needlessly coupled with Trainer and Seminar 
    // TrainingSystem has low cohesion because it is implementing behaviours not related to that class
    // Seminar is poorly encapsulated
        // restriction of seminar capacity <10 is not enforced by the class itself
        // getAttendees exposes our internal list of attendees to potential malicious users
    // 

}
