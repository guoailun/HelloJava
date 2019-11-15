package learnExtends.myPackage.inner.child;

import learnExtends.myPackage.Child3Class;

public class Child2Class extends Child3Class {
    boolean flag;
    public Child2Class(String name, int age, String sex, String desction, String child, boolean flag) {
        super(name, age, sex, desction, child);
        this.flag = flag;
        System.out.println("Child2Class");
    }



    public static void main(String[] args) {
        Child3Class child3Class = new Child3Class("lili", 18, "女", "我马上就要高考了", "gao");
        child3Class.getmyAge();

//        Child2Class child2Class = new Child2Class("lili", 18, "女", "我马上就要高考了", "gao", false);
        Child3Class child3Class1 = new Child2Class("lili", 18, "女", "我马上就要高考了", "gao", false);
    }

    public void getMysex() {
        System.out.println(this.sex);
    }

    public static void talking() {
        System.out.println("in Child2Class");
    }

}
