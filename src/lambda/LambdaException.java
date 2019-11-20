package lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaException {
    public static void main(String[] args) {
        List<String> myList = addElementsToList(new ArrayList<>());
        myList.forEach(s -> processString(s));

    }

    public static List<String> addElementsToList(List<String> list) {
        for (int i = 0; i < 10; i++) {
            list.add("string" + i);
        }

        return list;
    }

    public static void processString(String str) {
        throw new RuntimeException();
//        System.out.println(str);
    }

}
