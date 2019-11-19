package FinalMarket.MyInterface;

/**
 * 商品的种类
 */

public enum Category {
    FOOD(10,300),           // 食品
    COOK(200,2000),         // 厨具
    SNACK(5,100),           // 小吃
    CLOTHES(200,100),       // 衣服
    ELECTRIC(200,10000);    // 电子商品

    int lowerPrice;
    int higherPrice;

    Category(int lowerPrice, int higherPrice) {
        this.lowerPrice = lowerPrice;
        this.higherPrice = higherPrice;
    }

    public int getLowerPrice() {
        return lowerPrice;
    };

    public void setLowerPrice(int lowerPrice) {
        this.lowerPrice = lowerPrice;
    };

    public int getHigherPrice() {
        return higherPrice;
    };

    public void setHigherPrice(int higherPrice) {
        this.higherPrice = higherPrice;
    };
}
