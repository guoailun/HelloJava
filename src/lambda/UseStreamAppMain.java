package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UseStreamAppMain {
    public static void main(String[] args) {
        List<String> myList = addElementsToList(new ArrayList<>());
        System.out.println("-------------lambda的奥义-----------");
        // TODO lambda 的奥义是使用lambda一个接着一个处理，不要停，一路处理下去，直到业务结束
        // TODO 理性来说，lambda结构对计算优化是友好的；感性地说，这种方式会产生一种美，让人莫名感到舒适
        myList.stream().filter(s -> s.length() > 4).map(String::toUpperCase).forEach(System.out::println);

        // TODO 当然也可以使用collector让数据重新生成一个List
        System.out.println("-------------使用collector-----------");
        List<String> longgerStrList = myList.stream().filter(s -> s.length() > 4)
                .map(String::toUpperCase).collect(Collectors.toList());
        longgerStrList.forEach(System.out::println);

        System.out.println("-------------Test-----------");
        Arrays.stream(myList.toArray()).forEach(System.out::println);

    }

    public static List<String> addElementsToList(List<String> list) {
        for (int i = 0; i < 20; i++) {
            list.add("str" + i);
        }

        return list;
    }
}
