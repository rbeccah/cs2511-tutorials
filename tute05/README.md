# Tutorial 05

## A. Strategy Pattern

Inside `src/restaurant` is a solution for a restaurant payment system with the following requirements:

* The restaurant has a menu, stored in a JSON file. Each meal on the menu has a name and price
* The system displays all of the standard meal names and their prices to the user so they can make their order
* The user can enter their order as a series of meals, and the system returns their cost
* The prices on meals often vary in different circumstances. The restaurant has four different price settings:
    * Standard - normal rates
    * Holiday - 15% surcharge on all items for all customers
    * Happy Hour - where registered members get a 40% discount, while standard customers get 30%
    * Discount - where registered members get a 15% discount and standard customers pay normal prices
* The prices displayed on the menu are the ones for standard customers in all settings

Currently, the code uses switch statements to handle each of the different four cases.
* How does the code violate the open/closed principle?
* How does this make the code brittle?

Refactor the code to use the Strategy Pattern to handle the four settings.

Here is the strategy interface to get you started:

```java
public interface ChargingStrategy {

    /**
     * The cost of a meal.
     */
    public double cost(List<Meal> order, boolean payeeIsMember);

    /**
     * Modifying factor of charges for standard customers.
     */
    public double standardChargeModifier();

}
```

## B. Observer Pattern

In `src/youtube`, create a model for the following requirements of a Youtube-like video creating and watching service using the Observer Pattern:
* A Producer has a name, a series of subscribers and videos
* When a producer posts a new video, all of the subscribers are notified that a new video was posted
* A User has a name, and can subscribe to any Producer
* A video has a name, length and producer

Write a simple test with print statements inside `YoutubeTest.java`.

Once this is done, think about what if we want to be able to produce videos and subscribe to videos as well (the way youtube actually works). In groups, draw a UML diagram refactoring the code so that the `Producer` and `User` classes are merged, whilst still using the Observer Pattern.

## C. State Pattern

This exercise continues on from Exercise B.

Extend your solution to accomodate the following requirements:

* Users can view a video, and a viewing has a series of states:
    * Playing state - the video is playing (Upon entering this state, set playback on)
    * Ready state - the video is paused, ready to play (Upon entering this state, set playback off)
    * Locked state - the video is temporarily 'locked' from having its state changed

The actions and state transitions are as follows:

| State      | Lock       | Play  | Next      |
| -----      | -------       | -------       | ----      |
| Locked     | If playback is going, switch to Playing State. <br> If not, switch to Ready State | Return Error: Locked | Return Error: Locked |
| Playing    | Switch to Locked State | Stops playback and switch to Ready State | Starts playing the next video |
| Ready      | Switch to Locked State | Starts playback and switch to Playing State | Starts playing the next video |