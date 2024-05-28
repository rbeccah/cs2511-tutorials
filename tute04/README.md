# Tutorial 04

## A. Design Principles

### Part 1: Law of Demeter

In the `unsw.training` package there is some skeleton code for a training system.

* Every employee must attend a whole day training seminar run by a qualified trainer
* Each trainer is running multiple seminars with no more than 10 attendees per seminar

In the `TrainingSystem` class there is a method to book a seminar for an employee given the dates on which they are available. This method violates the principle of least knowledge (Law of Demeter).

1. How and why does it violate this principle?
2. In violating this principle, what other properties of this design are not desirable?
3. Refactor the code so that the principle is no longer violated. How has this affected other properties of the design?
4. More generally, are getters essentially a means of violating the principle of least knowledge? Does this make using getters bad design?

### Part 2: Liskov Substitution Principle

Look at the `OnlineSeminar` class. How does this violate the Liskov Substitution Principle?

## B. Streams and Lambdas

1. Inside `src/stream/App.java`, rewrite the following code using the `.forEach()` method and a lambda:
```java
List<String> strings = new ArrayList<String>(Arrays.asList(new String[] {"1", "2", "3", "4", "5"}));
for (String string : strings) {
   System.out.println(string);
}
```
2. In the above example, discuss two different ways to write lambda expressions.
3. What is a stream? Rewrite the following code to use a stream and the `map` function.
```java
List<String> strings2 = new ArrayList<String>(Arrays.asList(new String[] {"1", "2", "3", "4", "5"}));
List<Integer> ints = new ArrayList<Integer>();
for (String string : strings2) {
    ints.add(Integer.parseInt(string));
}
```
4. Modify your answer to (3) to use a scope operator instead of a normal lambda.

## C. Design by Contract

1. What is Design by Contract?
2. Discuss briefly as a class how you have used Design by Contract already in previous courses.
3. Discuss how Design By Contract was applied in the Blackout assignment.
4. In the `Calculator` code, specify a contract for each of the functions. Hint: for the trig functions, look at the interface of the `Math` functions in the Java documentation. Key edge cases to consider:
    * Dividing by zero
    * `tan(Math.PI / 2)`
5. Will you need to write unit tests for something that doesn't meet the preconditions? Explain why.
6. We will now make our code more defensive by throwing an exception on the two edge cases listed above. Define your own custom exception called `CalculatorException`, and change the code so that these edge cases cause this exception to be thrown. Modify your contract accordingly. If you have time, add tests for these conditions as well.