# Tutorial 09

## A. Finding Patterns

In groups, determine a possible pattern that could be used to solve each of the following problems:

* Sorting collections of records in different orders.
* Modelling a file system.
* Updating a UI component when the state of a program changes.
* Parsing and evaluating arithmetic expressions.
* Adjusting the brightness of a screen based on a light sensor.

Then pick one and start to think about potential entities and draw up a rough UML diagram.

## B. Code and Design Smells

In groups, discuss the following examples. Identify the code smells and any underlying design problems associated with them.

a) 
> Mark, Bill and Jeff are working on a PetShop application. The PetShop has functionality to feed, clean and exercise different types of animals. Mark notices that each time he adds a new species of animal to his system, he also has to rewrite all the methods in the PetShop so it can take care of the new animal.

b) 
```java
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private String streetAddress;
    private String suburb;
    private String city;
    private String country;
    private int postcode;

    public Person(String firstName, String lastName, int age, int birthDay, int birthMonth, int birthYear,
            String streetAddress, String suburb, String city, String country, int postcode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.streetAddress = streetAddress;
        this.suburb = suburb;
        this.city = city;
        this.country = country;
        this.postcode = postcode;
    }
    // Some various methods below
    // ....
}
```

c) 
```java
public class MathLibrary {
    List<Book> books;

    int sumTitles {
        int total = 0
        for (Book b : books) {
            total += b.title.titleLength;
        }
        return total;
    }
}

public class Book {
    Title title; // Our system just models books as titles (content doesn't matter)
}

public class Title {
    int titleLength;

    int getTitleLength() {
        return titleLength;
    }

    void setTitleLength(int tL) {
        titleLength = tL;
    }
}
```

Now discuss as a class:
- How do these code smells cause problems when developing code?

- Is a code smell always emblematic of a design problem? 

## C. Revision Exercises

Complete some of the Theory Revision questions [here](https://nw-syd-gitlab.cseunsw.tech/COMP2511/24T1/revision-questions).