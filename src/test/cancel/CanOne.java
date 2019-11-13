package test.cancel;

import test.cancel.Zhang.ZhangWei;

import java.util.Date;

public class CanOne {
    public ZhangWei persion;
    public Date time;

    public static void main(String[] args) {
        ZhangWei a = new ZhangWei();
        a.sex = "nu";
        System.out.println(a + a.sex);
    }
}
