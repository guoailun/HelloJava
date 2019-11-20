# 补全
sout
psvm

# for 循环
for循环中, 使用break来提前结束循环
continue, 结束当前循环, 继续下一次循环

# do-while
do {
循环体 先执行一次，在去判断循环条件
} while(循环条件)

# switch
switch(n){ n 就是要判断的对应的case值
    case 值: 
        语句; break;
    case 值: 
        语句; break;
    default: 语句
}

不同的case里边，不能声明重名的变量

# Java 的世界是一个类和对象的世界
Java 就是使用类来描述世界，用类的实例(对象)让世界运转起来


# instanceof
可以判断一个引用指向的对象是否是某一个类型或者其子类； （如果引用是null,则返回false）


# for 循环的另一种写法

for (int m : arr) {}

# Java 变量
Java 中主要有如下几种类型的变量
局部变量
类变量（静态变量）
成员变量（非静态变量）
final 常量

# 修饰符
访问控制修饰符 : default, public , protected, private
非访问控制修饰符 : final, abstract, static, synchronized

# 访问控制修饰符
Java中，可以使用访问控制符来保护对类、变量、方法和构造方法的访问。Java 支持 4 种不同的访问权限。

default (即默认，什么也不写）: 在同一包内可见，不使用任何修饰符。使用对象：类、接口、变量、方法。

private : 在同一类内可见。使用对象：变量、方法。 注意：不能修饰类（外部类）

public : 对所有类可见。使用对象：类、接口、变量、方法

protected : 对同一包内的类和所有子类可见。使用对象：变量、方法。 注意：不能修饰类（外部类）。


# 问题？
1、'' 与 "" 差别?
单引号是 char 类型，双引好是 String;

char + char 也转换成int? yes

String => new String()

定义一个class 为什么可以new class[] 成一个数组呢 null ,  new class()  就是一串数字

浮点数/0 不报错？

类的方法？在实例创建时有？？什么变化吗？

静态方法和变量测试 


环境变量：/Users/zhangwei/tools/apache-maven-3.6.2
vi ~/.bash_profile  
pwd 查看当前路径    
mvn -v