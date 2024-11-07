package code_smells;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.util.Optional;

// ! The problem is not related to having data only classes. We've simply omitted methods to save space
// ! This is for demonstration purposes only. Do NOT put multiple classes in a single file. 

class Name {
    private String firstName;
    private String lastName;
}

class Birthday {
    private int day;
    private int month;
    private int year;

    public int getAge() {
        LocalDate birthDate = LocalDate.of(year, month, month);
        LocalDate now = LocalDate.now();
        return Period.between(birthDate, now).getYears();
    }
}

class Address {
    private String street;
    // ...
}

class Person {
    private Name name;
    private Birthday birthDay;
    private Address address;
    //...
}