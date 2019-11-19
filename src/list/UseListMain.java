package list;

import java.util.*;

public class UseListMain {
    public static void main(String[] args) {
        printCollection(addElementsToCollection(new ArrayList()));
//        printCollection(addElementsToCollection(new LinkedList()));

        printCollection(addElementsToCollection(new HashSet()));


    }

    public static Collection addElementsToCollection( Collection collection) {
        for (int i = 0; i < 10; i++) {
            collection.add("str" + (i%5));
        }

        return collection;
    }

    public static void printCollection( Collection collection) {
        System.out.println();
        System.out.println("输出" + collection.getClass() + "中的元素，共" + collection.size() + "个");
        try {
            for(Object element: collection) {
                System.out.println(element);
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }


    public static void printList(List list) {
        System.out.println();
        System.out.println("输出" + list.getClass() + "中的元素，共" + list.size() + "个");
        for (int i = 0; list.size() < 10; i++) {
            System.out.println(list.get(i));
        }
    }
}
