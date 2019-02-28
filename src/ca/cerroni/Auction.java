package ca.cerroni;

import java.util.ArrayList;

public class Auction implements Subject {

    private ArrayList<Observer> observers;
    private String item;


    public Auction(String item){
        this.item = item;
    }



    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void remove(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer: observers){
            observer.update();
        }
    }
}
