package people;

import java.util.Map;

public abstract class Person {
    // Student has neither salary nor pay rate
    // Lecturer has a pay rate as a string which converts to a salary
    // Tutor does not have salary but as a pay rate

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