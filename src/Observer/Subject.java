package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Данил on 01.04.2017.
 */
public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int getState(){
        return state;
    }

    public void notifyAllObservers(){
        for (Observer observer: observers){
            observer.update();
        }
    }

    public void setState(int state){
        System.out.println("Change state to:" + state);
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }
}
