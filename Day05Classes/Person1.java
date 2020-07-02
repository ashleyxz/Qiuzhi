public class Person1 {
    public String name = "张三"; // public 公有的，这样的类变量可以在类的外部使用，也可以在本类的方法使用。
    private int age; // private 私有的，可以在本类的方法使用，不能在类的外部使用。
    // 修饰符 可以用来修饰变量，可以指明一个公有还是私有，私有的类变量【不能】通过【对象.属性】的方式调用
    // 实例变量就是在类实例化成对象之后才能使用的

    // 类变量
    // static，意思是静态的，这样的变量不需要类实例化成对象就可以使用
    // 直接就可以通过【类名.属性】这样的方式直接调用，这样的变量叫做类变量。
    public static String sex = "男";


    public void showAge() {
        System.out.println(age);
    }

}
