package market.superMarket;

public class RunLittleSuperMarket {
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

        all[1].testThis(all[2].name);


        System.out.println("下面请利润最高的商品做自我介绍");
        littleSuperMarket.getBiggest().describe();
    }
}
