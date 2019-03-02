package ca.cerroni;

public class EasyObserver implements Observer {

    private Auction auction;
    private double max;
    private double increment;
    private String bidderName;

    private static int observerIDTracker = 0;
    private int observerID;


    private double auctionBid;

    public EasyObserver(Auction auction, double maxBid, double increment, String bidderName) {
        this.auction = auction;
        this.max = maxBid;
        this.increment = increment;
        this.bidderName = bidderName;
        this.observerID = ++observerIDTracker;

        auction.register(this);
    }

    @Override
    public void update(double bid) {
        this.auctionBid = bid;
        if (auctionBid < max) {
            auction.bid(this, auctionBid + increment);
            print();
        }
    }

    public void print() {

        String name = auction.getCurrentBidderName();

        System.out.println("Bider: " + name + "; Bid Value: " + auction.getCurrentBid());


        if (this.bidderName != name) {
            System.out.println(name + "notified, current bid:" + auction.getCurrentBid());
        }

    }


    public String getBidderName() {
        return bidderName;
    }


}
