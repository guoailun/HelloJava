package market;

import market.persion.Customer;
import market.superMarket.LittleSuperMarket;
import market.superMarket.Merchandise;

import java.sql.SQLOutput;
import java.util.Scanner;

public class RunMarket {
    public static void main(String[] args) {

        // 初始化超市信息
        LittleSuperMarket littleSuperMarket = new LittleSuperMarket();
        littleSuperMarket.address = "世纪大道";
        littleSuperMarket.superMarketName = "有家超市";
        littleSuperMarket.parkingCount = 200;
        littleSuperMarket.merchandise = new Merchandise[200];
        littleSuperMarket.merchandiseSold = new int[littleSuperMarket.merchandise.length];

        Merchandise[] all = littleSuperMarket.merchandise;

        // 给超市中的商品赋值
        for (int i = 0; i < all.length; i++) {
//            all[i] = new Merchandise();
            Merchandise m = new Merchandise();
            m.id = "ID" + i;
            m.count = 200;
            m.name = "商品" + i;
            m.purchasePrice = Math.random() * 200;
            m.soldPrice = (1 + Math.random()) * 200;
            all[i] = m;
        }

        System.out.println("超市开门啦！");

        boolean open = true;
        Scanner scanner = new Scanner(System.in);

        while (open) {
            // 输出超市的基本信息
            System.out.println("本店叫做：" + littleSuperMarket.superMarketName);
            System.out.println("本店地址：" + littleSuperMarket.address);
            System.out.println("共有停车位：" + littleSuperMarket.parkingCount + "个");
            System.out.println("今天的营业额为：" + littleSuperMarket.incomingSum);
            System.out.println("共有商品：" + littleSuperMarket.merchandise.length + "种");

            // 创建顾客信息
            Customer customer = new Customer();
            customer.name = "顾客编号" + (int) (Math.random() * 10000);
            customer.money = (1 + Math.random()) * 1000;
            customer.isDrivingCar = Math.random() > 0.5;

            if (customer.isDrivingCar) {
                if (littleSuperMarket.parkingCount > 0) {
                    System.out.println("欢迎" + customer.name + "驾车而来，本店已经为您安排了车位，停车免费哦。车位编号为：" + littleSuperMarket.parkingCount);
                    littleSuperMarket.parkingCount--;
                } else {
                    System.out.println("欢迎" + customer.name + "光临本店。");
                }
            }

            double totalCost = 0; // 这次这个客户消费所少钱
            while (true) {
                System.out.println("本店有" + all.length + "种商品，欢迎选购。请输入商品编号");
                int index = scanner.nextInt();

                if (index < 0) {  //  用户不想买，结束
                    break;
                }

                if (index >= all.length) {  //  用户不想买，结束
                    System.out.println("本店没有这种商品，请输入编号在 0 到 " + (all.length -1) + " 之内的商品编号。");
                    continue;
                }

                Merchandise m = all[index];

                System.out.println("您选购的商品名字是" + m.name + "单价是：" + m.soldPrice + "。请问您要购买几个？");

                int numToBuy = scanner.nextInt();

                if (numToBuy <= 0) {
                    System.out.println("不买看看也好，欢迎继续挑选");
                    continue;
                }

                if (numToBuy > m.count) {
                    System.out.println("本店此商品库存没有这么多了，欢迎继续挑选");
                    continue;
                }

                if (numToBuy * m.purchasePrice+ totalCost > customer.money) {
                    System.out.println("您带的钱不够，欢迎继续挑选");
                    continue;
                }

                totalCost += numToBuy * m.soldPrice;

                m.count -= numToBuy;

                littleSuperMarket.merchandiseSold[index] += numToBuy;  // 该商品卖了多少个
            }

            customer.money -= totalCost;

            if (customer.isDrivingCar) {
                littleSuperMarket.parkingCount++;
            }

            littleSuperMarket.incomingSum += totalCost;  // 超市营业总额

            System.out.println("顾客" + customer.name + "。共消费了" + totalCost);

            System.out.println("还继续营业吗？");

            open = scanner.nextBoolean();
        }

        System.out.println("超市关门了");
        System.out.println("今天总的营业额为：" + littleSuperMarket.incomingSum + "。营业情况如下");

        for (int i = 0; i < littleSuperMarket.merchandiseSold.length; i++) {
            Merchandise m = all[i];
            int numSold = littleSuperMarket.merchandiseSold[i];

            if (numSold > 0) {
                double isComming = m.soldPrice * numSold;
                double netComming = (m.soldPrice - m.purchasePrice) * numSold;  // 赚了多少钱
                System.out.println(m.name + "售出了" + numSold
                        + "个。销售额为：" + isComming + "。净利润为：" + netComming);
            }
        }

    }
}
