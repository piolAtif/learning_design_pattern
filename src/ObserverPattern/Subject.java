package ObserverPattern;

import java.util.ArrayList;

public class Subject {
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private int state;


    public void attach(Observer observer) {
        observers.add(observer);
    }

    public int getState() {
        return state;
    }

    public void setState(int state){
        this.state = state;
        notifyAllObserver();
    }

    private void notifyAllObserver() {
        for (Observer observer: observers) {
            observer.update();
        }
    }


}
