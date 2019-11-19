package FinalMarket.MyInterface;

public interface Merchandise {
    String getName();

    double getSolePrice();

    double getPurchasePrice();

    int buy(int count);

    void putBack(int count);  // 购买失败了，把商品放回去

    Category getCategory();

    int getCount();
}
