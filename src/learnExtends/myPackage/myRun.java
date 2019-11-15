package learnExtends.myPackage;

import learnExtends.myPackage.inner.ParentClass;
import learnExtends.myPackage.inner.Child1Class;
import learnExtends.myPackage.inner.child.Child2Class;

public class myRun {
    public static void main(String[] args) {
        Child1Class child = new Child1Class("娜娜", 23, "女", "我是一名在校大学生");

        System.out.println(child);
        System.out.println(child.name);
        System.out.println(child.school);
        child.desc();


        ParentClass parentClass = new ParentClass("lili", 18, "女", "我马上就要高考了");
        System.out.println(parentClass.name);

//        Child2Class child2Class = (Child2Class) new ParentClass("lili", 18, "女", "我马上就要高考了");


        ParentClass.talking();
        Child3Class.talking();
        Child2Class.talking();

    }
}
