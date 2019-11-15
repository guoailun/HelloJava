package learnExtends.myPackage;
import learnExtends.myPackage.inner.ParentClass;

public class Child3Class extends ParentClass {
    public String child;

    public Child3Class(String name, int age, String sex, String desction) {
        super(name, age, sex, desction);
        System.out.println("Child3Class 没有child");
    }

    public Child3Class(String name, int age, String sex, String desction, String child) {
        super(name, age, sex, desction);
        this.child = child;
        System.out.println("Child3Class 有child");


    }

    public static void main(String[] args) {
//        ParentClass parentClass = new ParentClass("lili", 18, "女", "我马上就要高考了");
//        System.out.println(parentClass.name);
//        parentClass.getmy();

        ParentClass parentClass1 = new ParentClass("小红", 6, "女", "太阳当空照");
        System.out.println(parentClass1);

        Child3Class child3Class1 = new Child3Class("lili", 18, "女", "我马上就要高考了");
        Child3Class child3Class = new Child3Class("小明", 23, "男", "刚刚进入大学的校园", "大学");

        System.out.println(child3Class.sex + child3Class1.sex);
    }

    public void getmy() {
        System.out.println(this.sex);
    }

    public void getmyAge() {
        System.out.println(this.getAge());
    }

//    public static void talking() {
//        System.out.println("in Child3Class");
//    }


}

