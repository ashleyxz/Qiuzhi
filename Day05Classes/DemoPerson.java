public class DemoPerson {
    public static void main(String[] args) {
        // 实例化Person类，也就是创建Person对象

        // int i = 0;
        // String a = " ";
        // 声明一个Person类型的变量，变量名叫person，实例化Person类并且给person赋值，赋值的值就是当前的实例。
        // new Person() 就是实例化Person类
        Person person = new Person();

        person.name = "张三"; // 给person对象的name属性赋值
        person.showName(); // 对象的方法的调用


        int i = person.getAge(); // 有返回值的方法，在调用之后，就会有一个值，这个值就是方法中return的那部分。
        System.out.println(i);

        person.age = 11; // 给person对象的age属性赋值
        int a = person.getAge();
        System.out.println(a);


        // 类一个，通过类实例化出来的对象可以多个，每个对象都是独立的，互不干扰。
        Person p1 = new Person();
        Person p2 = new Person();

        p1.name = "zhangsan";
        p2.name = "lisi";

        p1.showName();
        p2.showName();

    }
}
