package learnExtends.myPackage.inner;

import java.util.Objects;

public class Child1Class extends ParentClass {
    public String school;
    protected String interest;

    public Child1Class(String name, int age, String sex, String desction) {
        super(name, age, sex, desction);
        this.desction = "Child1Class" + desction;
    }

    public static void main(String[] args) {
        ParentClass parentClass = new ParentClass("lili", 18, "女", "我马上就要高考了");
        System.out.println(parentClass.sex + parentClass.name + parentClass.desction);
    }


    public static void talking() {
        System.out.println("in Child1Class");
    }
}
