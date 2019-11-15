package learnExtends;

public class RunExtendsClass {
    public static void main(String[] args) {
//        Phone phone = new Phone("iphone7","IPHONE_SEVEN",
//                200,5999,"Iphone","ine","256G","苹果");
//        phone.name = "iphone7";
//        phone.setId("IPHONE_SEVEN");
//        phone.setCount(200);
//        phone.setPrice(5999);
//
//        phone.setBrand("Iphone");
//        phone.setCpu("ine");
//        phone.setNeicun("256G");
//        phone.setProduct("苹果");

//        phone.description();
//        phone.phoneDescription();


//        Goods goods = new Phone("iphone7","IPHONE_SEVEN",
//                200,5999,"Iphone","ine","256G","苹果");

//        goods.description();

        Goods goods1 = new Goods();

        goods1.c();

        goods1.goods = new Goods[10];
 goods1.goods[0] = new Phone("iphone7","IPHONE_SEVEN",200,5999,"Iphone","ine","256G","苹果");
        goods1.getIndex(0).description();
//        goods1.getIndex(0).b();
//        goods1.b();

        Goods phone = new Phone("iphone7","IPHONE_SEVEN",200,5999,"Iphone","ine","256G","苹果");
//        phone.b();
        phone.c();

        Phone phone1 =  new Phone("iphone7","IPHONE_SEVEN",200,5999,"Iphone","ine","256G","苹果");
        phone1.c();
















        Phone phon2 = new Phone("iphone7","IPHONE_SEVEN",200,5999,"Iphone","ine","256G","苹果");
        phon2.description();

        phon2.b();

    }
}
