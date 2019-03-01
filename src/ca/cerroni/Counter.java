package ca.cerroni;

public class Counter {

    private Auction auction;
    private String BidderName;
    private double currentBid;


    public Counter(Auction auction, String BidderName){
        this.auction = auction;
        this.BidderName = BidderName;
    }

    public Auction getAuction() {
        return auction;
    }

    public void setAuction(Auction auction) {
        this.auction = auction;
    }

    public String getBidderName() {
        return BidderName;
    }

    public void setBidderName(String bidderName) {
        BidderName = bidderName;
    }

    public double getCurrentBid() {
        return currentBid;
    }

    public void setCurrentBid(double currentBid) {
        this.currentBid = currentBid;
    }
}
