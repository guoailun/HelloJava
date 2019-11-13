package market.superMarket;

public class LittleSuperMarket {
    public String superMarketName;
    public String address;
    public int parkingCount;  // 停车位数量
    public int incomingSum;   // 收入总和
    public Merchandise[] merchandise; // 商品列表
    public int[] merchandiseSold;  // 商品销售个数

    public Merchandise2[] merchandise2; // 商品列表


    // 定义一个返回商品利润最高的一个方法
    public Merchandise2 getBiggest() {
        Merchandise2 curr = null;
        for (int i = 0; i < merchandise2.length; i++) {
            Merchandise2 m = merchandise2[i];
            if (curr == null) {
                curr = m;
            } else {
                if (curr.calculateProfit() < m.calculateProfit()) {
                    curr = m;
                }
            }
        }
        return curr;
    }

}
