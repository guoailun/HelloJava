package learnExtends.myPackage.inner;

import java.util.Objects;

public class ParentClass {
    public String name;
    private int age;
    protected String sex;
    String desction;

    public ParentClass(String name, int age, String sex, String desction) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.desction = desction;
    }

    protected String getSex(String sex) {
        return this.sex = sex;
    }

    public int getAge() {
        return this.age;
    }

    public int setAge(int age) {
        return this.age = age;
    }

    public void desc() {
        System.out.println("我的名字是：" + name + "; " + desction);
    }

    public static void talking() {
        System.out.println("in ParentClass");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ParentClass)) return false;
        ParentClass that = (ParentClass) o;
        return getAge() == that.getAge() &&
                name.equals(that.name) &&
                sex.equals(that.sex) &&
                desction.equals(that.desction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, getAge(), sex, desction);
    }
}
