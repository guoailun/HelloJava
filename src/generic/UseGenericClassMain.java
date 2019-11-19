package generic;

import java.util.ArrayList;
import java.util.List;

public class UseGenericClassMain {
    public static void main(String[] args) {
//        useStringList();
        useGenericStringList();

    }

    public static List createStringList() {
        List ret = new ArrayList();
        for (int i = 0; i < 10; i++) {
            ret.add("str" + (i % 5));
        }
        return ret;
    }

    public static void useStringList() {
        List strList = createStringList();
        for (int i = 0; i < strList.size(); i++) {
            // >>> TODO 必须强制类型转换，心好累啊，我明明知道里面只有String的啊
            String str = (String) strList.get(i);
            str = str.toUpperCase();
            System.out.println(str);
        }
    }


    /**
     * 使用泛型
     */

    public static List<String> createenericStringList() {
        List<String> ret = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ret.add("str" + (i % 5));
        }
        return ret;
    }


    public static void useGenericStringList() {
        List<String> strList = createStringList();
        for (int i = 0; i < strList.size(); i++) {
            // >>> TODO 必须强制类型转换，心好累啊，我明明知道里面只有String的啊
            String str = strList.get(i).toUpperCase();
            System.out.println(str);
        }
    }
}
