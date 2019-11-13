package market.superMarket;

public class Merchandise2 {
    public String name;
    public String id;
    public int count;
    public double soldPrice;
    public double purchasePrice;
    public String madeIn;


    // >>> TODO 访问修饰符
    // >>> TODO 返回值类型：无需返回值用void，void是Java中的关键字
    // >>> TODO 参数列表。后续讲解
    // >>> TODO 方法体，方法的代码
    // >>> TODO 方法体内部的变量叫做局部变量

    public void describe() {
        double net = soldPrice - purchasePrice;
        System.out.println("商品名叫做" + name + "; id是" + id
                + "; 商品售价是" + soldPrice + "; 商品的进价是" + purchasePrice
                + "; 商品的库存是" + count + "; 销售一个的毛利是" + net + "; 商品的产地" + madeIn);
    }

    public void testThis(String name) {
        // name 即是 传入的参数
        // this.name 调用函数的对象的name
        System.out.println(name + " ; " + this.name + " ; ");
    }

    // 计算商品的毛利润
    public double calculateProfit(){
        double profit = soldPrice - purchasePrice;
        // >> TODO 这个return是代码块里的return，是return所在代码块的最后一个语句
        if (profit <= 0) {
            return 0;
        }
        //  >> TODO return 语句必须是所在代码块的最后一个语句，否则就是语法错误
        return profit;
        // >> TODO 一个方法可以有多个返回语句。
    }

    // 计算购买商品的价格
    public double buy(int numToBuy) {
        if (numToBuy > count) {
            System.out.println("库存不足！");
            return -1;
        }

        System.out.println("商品的单价为：" + soldPrice);
        int fullPriceCount = numToBuy / 2 + numToBuy % 2;
        int halfPriceCount = numToBuy / 2; // || numToBuy - fullPriceCount;

        double totalCost = fullPriceCount * soldPrice + (halfPriceCount * soldPrice / 2);

        count -= numToBuy;

//        System.out.println("选购的商品总价为：" + totalCost);

        return totalCost;
    }
}


