package ca.cerroni;

public class Counter implements Observer {

    private Auction auction;
    private String Name;
    private double currentBid;

    private int inc;


    public Counter(Auction auction, String Name) {
        this.auction = auction;
        this.Name = Name;

        auction.register(this);
    }


    @Override
    public void update(double o) {
        inc++;
        System.out.println("Auction 1 Counter Notified\n" +
                "Auction 1 Counter: " + inc);

    }
}
