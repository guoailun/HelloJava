# final 修饰符最见不得变化
1、final 修饰类: 不可被继承
2、final 修饰方法: 不可被子类覆盖
3、final 修饰变量: 不可被赋值。这个最难理解; (只能在初始化声明变量时或者在构造方法里赋值 ==》 只能赋值一次) ， 而且 final 变量必须要被初始化，不复制也要报错；

如果 final 修饰 static 变量， 可以在初始化 或者 static 代码块里赋值； 必须赋值且只能赋值一次；

4、final 不能修饰构造方法
5、final 修饰 形参；也是不能被赋值

6、final 修饰 引用 （最难理解）
赋值且只能赋值一次；（你这个引用不能改） 只能指向一次对象的地址
但是，引用实例的属性可以改