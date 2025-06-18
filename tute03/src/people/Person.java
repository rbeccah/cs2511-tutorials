package people;

import java.util.Map;

public abstract class Person {

    private String name;
    private int age;

    /**
     * @precondition name, age, payRate is not null, age is a non-negative integer (i.e. age >= 0)
     * @postcondition name, age, payrate are set 
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