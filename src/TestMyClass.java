import test.One;
import test.cancel.CanOne;
import test.cancel.Zhang.ZhangWei;

public class TestMyClass {
    public static void main(String[] args) {
        One one = new One();
        one.id = "2345";
        one.people = new CanOne();

        one.people.persion = new ZhangWei();
        one.people.persion.name = "zhangWei";
        one.people.persion.age = 23;

        System.out.println( one.people.persion + one.people.persion.name);
    }
}
