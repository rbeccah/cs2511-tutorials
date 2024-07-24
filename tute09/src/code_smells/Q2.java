package code_smells;

import java.time.Year;

// ! The problem is not related to having data only classes. We've simply omitted methods to save space
// ! This is for demonstration purposes only. Do NOT put multiple classes in a single file. 

class Name {
    private String firstName;
    private String lastName;

    // * Some various methods below
}

class Birthday {
    private int day;
    private int month;
    private int year;

    public int getAge() {
        return Year.now().getValue() - this.year;
    }

    // * Some various methods below
}

class Address {
    private String streetAddress;
    private String suburb;
    private String city;
    private String country;
    private int postcode;
}

@SuppressWarnings("unused")
class Person {
    public Person(Name name, Birthday birthday, Address address) {
        this.name = name;
        this.birthday = birthday;
        this.address = address;
    }
    private Name name;
    private Birthday birthday;
    private Address address;
    

    // * Some various methods below
    // ....
}