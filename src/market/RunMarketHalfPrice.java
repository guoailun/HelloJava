package market;

import market.superMarket.LittleSuperMarket;
import market.superMarket.Merchandise2;

import java.util.Scanner;

public class RunMarketHalfPrice {
    public static void main(String[] args) {
        // 初始化超市信息
        LittleSuperMarket littleSuperMarket = new LittleSuperMarket();
        littleSuperMarket.address = "世纪大道";
        littleSuperMarket.superMarketName = "有家超市";
        littleSuperMarket.parkingCount = 200;
        littleSuperMarket.merchandise2 = new Merchandise2[200];
        littleSuperMarket.merchandiseSold = new int[littleSuperMarket.merchandise2.length];

        Merchandise2[] all = littleSuperMarket.merchandise2;

        // 给超市中的商品赋值
        for (int i = 0; i < all.length; i++) {
            Merchandise2 m = new Merchandise2();
            m.id = "ID" + i;
            m.count = 200;
            m.name = "商品" + i;
            m.purchasePrice = Math.random() * 200;
            m.soldPrice = (1 + Math.random()) * 200;
            all[i] = m;
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("今日超市大特惠，所有商品第二件半价！请选择要购买的商品索引：");
            int index = scanner.nextInt();

            if (index < 0) {
                break;
            }

            if (index >= littleSuperMarket.merchandise2.length) {
                System.out.println("商品索引超出界限");
                continue;
            }

            Merchandise2 m = all[index];

            System.out.println("商品的名字是：" + m.name + "; 商品的售价为："
                    + m.soldPrice + "请问要购买几个商品？");

            int numToBuy = scanner.nextInt();

//            if (numToBuy > m.count) {
//                System.out.println("库存不足！");
//                continue;
//            }
//
//            int fullPriceCount = numToBuy / 2 + numToBuy % 2;
//            int halfPriceCount = numToBuy / 2; // || numToBuy - fullPriceCount;
//            double totalCost = fullPriceCount * m.soldPrice + (halfPriceCount * m.soldPrice / 2);
//            m.count -= numToBuy;
//            System.out.println("选购的商品总价为：" + totalCost);

            double totalCost = m.buy(numToBuy);
            System.out.println("选购的商品总价为：" + totalCost);

        }
    }
}
