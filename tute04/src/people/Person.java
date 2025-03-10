package people;

import java.util.Map;

public abstract class Person {
    // ? Should Person really have salary and payrates functionality? 
    // Lecturer has payRate as a string and generates the salary from the map
    // Student have neither pay rate or salary
    // Tutor only has pay rate

    private String name;
    private int age;

    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}