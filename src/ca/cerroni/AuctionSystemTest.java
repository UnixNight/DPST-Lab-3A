package ca.cerroni;

public class AuctionSystemTest {
    public static void main(String[] args) {
        Auction auc1 = new Auction("Dell Laptop Black");
        Counter counter1 = new Counter(auc1, "Auction 1 Counter");
        EasyObserver easyObserver1 = new EasyObserver(auc1, 1000, 200, "Matt");
        EasyObserver easyObserver2 = new EasyObserver(auc1, 2000, 100, "Hill");

        auc1.bid(easyObserver1, 100);
    }
}

