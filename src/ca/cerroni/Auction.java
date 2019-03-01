package ca.cerroni;

import java.util.ArrayList;

public class Auction implements Subject {

    private ArrayList<Observer> observers;
    private String item;
    private double currentBid;
    private Observer currentBidder;


    public Auction(String item){
        this.item = item;
    }

    public void bid(Observer o, double bid){
        setCurrentBid(bid);
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

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getCurrentBid() {
        return currentBid;
    }

    public void setCurrentBid(double currentBid) {
        this.currentBid = currentBid;
    }

    public void setCurrentBidder(Observer currentBidder) {
        this.currentBidder = currentBidder;
    }
}
