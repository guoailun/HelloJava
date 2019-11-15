# string
String 对象最重要的特点:不可变(immutable)不可变不可变，重要的事 情说三遍。String 用来存储字符的数据是 private 的，而且不提供任何修改 内容的方法，所以String 对象一旦生成，其内容就是完全不可能被修改的

生成一个新的串

String: 是引用类型。不是Java的基本数据类型，但同时又不需要new String()，这是Java给String开的一个后门，允许 String a = "" 双引号创建；

String 的方法：
a.length();
a.toUpperCase();

# String 类的好兄弟
StringBuilder 是一个非常方便的用来拼接和处理字符串的类， 和 String 不同的是，它是可变的

StringBuilder a = new StringBuilder()
StringBuilder b = new StringBuilder("asd")