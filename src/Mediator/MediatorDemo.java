package Mediator;

/**
 * Created by Данил on 11.02.2017.
 */
//Mediator pattern is used to reduce communication complexity between multiple objects or classes.
//  This pattern provides a mediator class which normally handles all the communications between different classes
//  and supports easy maintenance of the code by loose coupling. Mediator pattern falls under behavioral pattern category.

public class MediatorDemo {
    public static void main(String[] args){
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! Johny");
        john.sendMessage("Wazup, Bob!");
    }
}
