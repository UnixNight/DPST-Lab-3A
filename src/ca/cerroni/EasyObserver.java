package ca.cerroni;

public class EasyObserver implements Observer {

    private Auction auction;
    private double max;
    private double increment;
    private String bidderName;

    private double auctionBid;

    public EasyObserver(Auction auction, double maxBid, double increment, String bidderName){
        this.auction = auction;
        this.max = maxBid;
        this.increment = increment;
        this.bidderName = bidderName;

        auction.register(this);
    }

    @Override
    public void update(double bid) {
        this.auctionBid = bid;
        if (auctionBid < max){
            auction.bid(this, auctionBid + increment);
        }

    }

    public Auction getAuction() {
        return auction;
    }

    public void setAuction(Auction auction) {
        this.auction = auction;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public double getIncrement() {
        return increment;
    }

    public void setIncrement(double increment) {
        this.increment = increment;
    }

    public String getBidderName() {
        return bidderName;
    }

    public void setBidderName(String bidderName) {
        this.bidderName = bidderName;
    }





}
