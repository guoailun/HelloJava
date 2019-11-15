package learnExtends;

public class Goods {
    private String name;
    private String id;
    private double price;
    private int count;
    public Goods[] goods;

    public Goods(String name, String id, double price, int count, Goods[] goods) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.count = count;
        this.goods = goods;
        System.out.println("Goods构造方法");

    }

    public Goods() {
    }

    public void description(){
        System.out.println("商品名字: " + name + "\t商品Id: "
                + id + "\t商品单价: " + price + "\t商品库存: " + count + this.a());
    }

    public String a () {
        return "goods";
    }

    public void c () {
        System.out.println("goodsC");
    }

    public Goods getIndex(int index) {

        return goods[index];
    }

    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.id;
    }

    public double getPrice() {
        return this.price;
    }

    public int getCount() {
        return this.count;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public String setId(String id) {
        return this.id = id;
    }

    public double setPrice(double price) {
        return this.price = price;
    }

    public int setCount(int count) {
        return this.count = count;
    }
}
