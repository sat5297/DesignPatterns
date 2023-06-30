package ObserverDP.Observer;

import java.util.List;
import java.util.ArrayList;

public class Subject {
    private int state;
    private List < Observer > observers = new ArrayList<Observer>();

    public int getState(){
        return state;
    }

    public void setState(int state){
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for(Observer observer : observers){
            observer.update();
        }
    }
}
