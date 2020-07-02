/*
类：人
 */
public class Person {
    // 属性（成员变量 member variable），类的成员变量可以先声明，不用初始化，类成员变量是有默认值的。
    String name; // 姓名，String的默认值是null
    int age; // 年龄，int的默认值是0

    // 行为（方法，函数 member function?）
    // 方法的名称如果是多个单词，首个单词的首字母小写，其他的单词首字母大写，
    // 这样就像一个驼峰一样，所以叫驼峰命名法camel case。

    /*
    方法：打印姓名
     */
    public void showName() { // void无返回值
        System.out.println("姓名：" + name);
        getAge(); // 同一个类中，所有的方法可以直接相互调用，不用new去实例化对象
        //public void xx(){} // 方法中不能再定义方法
    }

    /*
    方法：获取年龄
     */
    // 如果是一个有返回值的方法，那么方法体的最后一行一定是返回相应的数据。
    // 使用return关键字，返回的数据类型与方法定义的一致。
    // 方法上定义的int是返回值的类型，return后面跟的是方法的返回值。
    public int getAge() { // int 有返回值
        return age;
    }


}
