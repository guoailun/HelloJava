package FinalMarket;

import java.util.Arrays;
import java.util.Date;

public class ShoppingCart {
    private Merchandise[] buy;      // 顾客购买了的商品
    private int[] count;            // 商品个数
    private int curr;               // 购物车大小
    private int max;                // 最多能买多少个

    public ShoppingCart(int maxTypeToBuy) {
        buy = new Merchandise[maxTypeToBuy];
        count = new int[maxTypeToBuy];
        max = maxTypeToBuy;
        curr = 0;
    }

    public boolean canHold() {
        return curr < max;
    }

    public boolean add(Merchandise m, int countToBuy) {

        if (canHold()) {
            return false;
        }

        buy[curr] = m;
        this.count[curr] = countToBuy;
        curr++;
        m.buy(countToBuy);
        return true;
    }

    public double calculateOriginCost() {
        double ret = 0;
        int pos = -1;
        for (Merchandise m : buy) {
            pos++;

            if (m == null) {
                continue;
            }

            ret += m.getPurchasePrice() * count[pos];
        }

        return ret;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("===================\n");
        sb.append("购物时间：").append(new Date()).append("\n");
        int pos = -1;
        for(Merchandise m : buy) {
            pos++;
            if (m == null) {
                continue;
            }
            sb.append(m.getCategory().name()).append("\t").append(m.getName()).append("\t")
                    .append(count[pos]).append("\t").append(m.getSolePrice() * count[pos]).append("\n");
        }

        sb.append("应付总额为：").append(calculateOriginCost()).append("\n");
        sb.append("===================");
        return sb.toString();
    }
}
