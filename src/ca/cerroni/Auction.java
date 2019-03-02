package ca.cerroni;

import java.util.ArrayList;

public class Auction implements Subject {

    private ArrayList<Observer> observers;
    private String item;
    private double currentBid;
    private Observer currentBidder;
    private String currentBidderName;


    public Auction(String item) {
        this.item = item;

        observers = new ArrayList<>();
    }

    public void bid(Observer o, double bid) {

        EasyObserver foo = (EasyObserver) o;

        setCurrentBid(bid);
        setCurrentBidderName(foo.getBidderName());
        notifyObserver();
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
        for (Observer observer : observers) {
            observer.update(currentBid);
        }
    }


    public double getCurrentBid() {
        return currentBid;
    }

    public void setCurrentBid(double currentBid) {
        this.currentBid = currentBid;
    }


    public String getCurrentBidderName() {
        return currentBidderName;
    }

    public void setCurrentBidderName(String currentBidderName) {
        this.currentBidderName = currentBidderName;
    }
}
