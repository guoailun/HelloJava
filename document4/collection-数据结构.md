# 数据结构 (Data Structure)
1、数据结构是组织数据的方式，我们可以朴素的认为，数据结构 + 算法 = 程序 ⚫
2、数组 (Array) 就是一种最基本的数据结构，编程语言一般本身就支持这种数
据结构
3、计算机中基础的数据结构有 List，Set，Queue，Map。比较高级一点的有 Tree，Heap。这些数据结构需要代码来实现。这些实现也是一个个的类，只 是专注的问题更抽象和通用


# Collection 类族
Collection 代表一堆元素，中文一般翻译为集合

# Collection 中的 List 
List 代表有顺序的一组元素，中文一般翻译为链表。顺序代表遍历 List 的时 候也是有顺序的
new ArrayList() \ new LinkedList()

# Collection 中的 Set
1、Set 代表一个元素不重复的集合，也就是说，Set 中的元素两两不相等;
2、看源码:学习 Java 中 Set 的最常用的实现类 HashSet。HashSet 顾名思义， 是使用了元素的 hash 值帮助做去重的;
2、hashCode（可以看做名字） 和 equals(可以看做人) 符合这样一个约定:equals 返回 true， hashCode 必须相等。很多 Java 类库中的代码都是按照这种约定使用这两个方法的，比 如 HashSet。这也是为什么我们要求如果一个类覆盖了 hashCode 方法，就 一定要覆盖 equals 方法，并保证方法的实现符合上述约定

# Map
Map: key 和 value 的映射
1、Map 和 List 一样，是一种最基础的数据结构，它描述的是一个 key 和一个 value 一一对应的数据结构。每种高级语言都有对 Map 的定义和实现（key 不能重复）
2、看源码:Map 接口的定义
3、Map 最常用的实现类 HashMap