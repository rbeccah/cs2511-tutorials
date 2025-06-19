package people;

public abstract class Person {

    private String name;
    private int age;

    /**
     * @precondition name, age, payRate is not null, age is a non-negative integer (i.e. age >= 0)
     * @postcondition sets the name, age and salary
     * @param name
     * @param age
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