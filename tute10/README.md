# Tutorial 10

## A. MyExperience

It's time to fill out MyExperience!!

## B. Builder Pattern

In our system, we have trains which contain many engines and/or wagons. As in a normal train, these engines/wagons are ordered sequentially from the front of the train to the back.

Engines provide a certain amount of power and wagons require a certain amount of power to pull. At each point along the train, taking into account preceeding engines/wagons, the sum of the engine power must be greater than the sum of the wagon's required power. Otherwise, the rest of the train will be left behind!

There are three types of wagons:

> - Passenger wagons which require 500 engine power each
>
> - Cargo wagons which require 1,000 engine power each
>
> - Engines which **provide** power. They can be created at any power. For our system, we will create them at two variants. A "high powered" engine (2,000 power) and a "normal" engine (1,000) power.

Create a **train builder** that constructs a train in order, wagon by wagon with the above constraint. If the above constraint is violated at any point, throw an `IllegalStateException`.

Write a simple test in main that calls the builder directly to construct a train.

Question: How could you extend this solution to add `ToyTrains` and a `ToyTrainBuilder` to the system?

## C. Kahoot + General Revision

Your tutor will run you through a Kahoot! They will share a code with you.

After that you can spend time with your tutor to review any topics in the course that you feel you want to build more confidence in.
