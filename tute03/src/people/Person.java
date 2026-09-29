package people;

import java.util.Map;

public abstract class Person {
    // ? Should Person really have salary and payrates functionality?

    private String name;
    private int age;

    /**
     * @precondition name is not null, age is a non-negative number (age >= 0)
     * @postcondition name, age, payRate are set for the person 
     * @param name
     * @param age
     * @param payRate
     */
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