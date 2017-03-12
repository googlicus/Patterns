package Memento;

import java.util.ArrayList;

/**
 * Created by Parent on 12.03.2017.
 */
public class CareTaker {
    private ArrayList<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento memento){
        mementoList.add(memento);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
