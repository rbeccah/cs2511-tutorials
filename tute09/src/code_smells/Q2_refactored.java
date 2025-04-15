package code_smells;

import java.time.LocalDate;
import java.time.Period;

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
        LocalDate birthDate = LocalDate.of(year, month, day);
        LocalDate now = LocalDate.now();
        return Period.between(birthDate, now).getYears();
    }
}

class Address {
    private Integer streetNumber;
    private String street;
    private String suburb;
    private String city;
    private String country;
    private int postCode;
}

class Person {
    private Name name;
    private Birthday birthday;
    private Address address;

    public Person(Name name, Birthday birthday, Address address) {
        this.name = name;
        this.birthday = birthday;
        this.address = address;
    } 
}