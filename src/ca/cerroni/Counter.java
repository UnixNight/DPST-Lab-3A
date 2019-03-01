package ca.cerroni;

public class Counter implements Observer{

    private Auction auction;
    private String Name;
    private double currentBid;


    public Counter(Auction auction, String Name){
        this.auction = auction;
        this.Name = Name;
    }

    public Auction getAuction() {
        return auction;
    }

    public void setAuction(Auction auction) {
        this.auction = auction;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getCurrentBid() {
        return currentBid;
    }

    public void setCurrentBid(double currentBid) {
        this.currentBid = currentBid;
    }

    @Override
    public void update(double o) {

    }
}
