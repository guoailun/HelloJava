package market.superMarket;

public class RunMerchandise2 {
    public static void main(String[] args) {
        Merchandise2 merchandise2 = new Merchandise2();

        merchandise2.name = "书桌";
        merchandise2.id = "DESGKK";
        merchandise2.purchasePrice = 200;
        merchandise2.soldPrice = 300;
        merchandise2.count = 100;
        merchandise2.madeIn = "Chain";

        merchandise2.describe();
    }
}
