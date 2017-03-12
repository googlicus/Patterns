package Memento;

/**
 * Created by Parent on 12.03.2017.
 */
/*Memento pattern is used to restore state of an object to a previous state.
        Memento pattern falls under behavioral pattern category.*/
public class MementoDemo {
    public static void main(String[] args){
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #4");
        System.out.println(originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println(originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println(originator.getState());
    }
}
