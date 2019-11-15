package learnExtends;

public class Phone extends Goods {
    private String brand;
    private String cpu;
    private String neicun;
    private String product;

//    public Phone() {
//        super(this.name);
//    }

    public Phone(String name, String id, double price, int count, String brand, String cpu, String neicun, String product) {
//        this.setName(name);
////        super.setId(id);
////        this.setPrice(price);
////        this.setCount(count);
//        super(name, id, price,count, goods);
        System.out.println("phone构造方法");

        this.brand = brand;
        this.cpu = cpu;
        this.neicun = neicun;
        this.product = product;
    }

//    public void description(){  // phoneDescription
////        description();  // 调用父类的方法
////        super.description();
//        System.out.println("手机品牌: " + brand + "\tCPU: "
//                + cpu + "\t手机内存: " + neicun + "\t生产厂家: " + product + this.a());
//    }

    public String a () {
        return "Phone";
    }


    public void b() {
        System.out.println("phoneb");
    }


    public String getName() {
        return this.brand + ":" + super.getName();
    }

    public String setName(String name) {
        return super.getName() + ":" + this.brand;
    }

    public String setBrand(String brand) {
        return this.brand = brand;
    }

    public String setCpu(String cpu) {
        return this.cpu = cpu;
    }

    public String setNeicun(String neicun) {
        return this.neicun = neicun;
    }

    public String setProduct(String product) {
        return this.product = product;
    }



}
