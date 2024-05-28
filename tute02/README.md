# Tutorial 2

## A. Code Review

Your tutor will provide you a link or open up the `src/shapes`, and use the `Shape` and `Rectangle` classes.

In groups, analyse the classes to answer the following questions:

1. What is the difference between `super` and `this`?
2. What about `super(...)` and `this(...)`?
3. What are static fields and methods?

## B. JavaDoc & Commenting

Within the `src` directory, create a new package called `employee`.

Create an `Employee` class which has private fields for an employee's name and salary and appropriate getters, setters, and constructors. Document the class with [JavaDoc](https://www.oracle.com/au/technical-resources/articles/java/javadoc-tool.html).

Use VSCode to create the getters and setters. 

In this course we are not going to require that you write JavaDoc, except when specified.

* What is meant by the term "self-documenting code"?
* Explain why comments can be considered a code smell.
* Discuss as a class whether code should have comments / JavaDoc

## C. Basic Inheritance & Polymorphism

This exercise continues on from the `Employee` class in Exercise B.

* How many constructors should the class have? What arguments should they take?

Create a `Manager` class that is a subclass of `Employee` and has a field for the manager's hire date.

* What constructors are appropriate?
* Is it appropriate to have a getter for the hire date? What about a setter?

Override the `toString()` method inherited from `Object` in both classes.

* What should the result of `toString()` contain?
* Does the method in `Manager` call the one in `Employee`?

## D. Equals
This exercise continues on from the work in Exercise C.

* What does the `==` operator do when comparing objects?
* Where have you seen this sort of behaviour before in other languages? How is the underlying data checked for equality in that scenario?
* How can we compare two objects for equality?
* What does it mean for objects to be considered equal? 
* What is the relationship between a super type and a sub type in terms of equality? Can a concrete instance of an `Employee` be equal to an instance of a `Manager`

Override the `equals()` method inherited from `Object` in both classes.
* What key things should the `equals()` method do?
* How should the type of the input object be checked? How should it be compared to the type of the calling object?
* How can the method in `Manager` utilise code in `Employee` to avoid repetition?

## E. Access Modifiers & Packages
In the src/access package, answer the questions marked TODO.