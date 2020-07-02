public class DemoAnimal {
    public static void main(String[] args) {

        Animal ani = new Animal();

        ani.eat("老鼠", 5, 's');

        ani.move("飞");

        // 未来可能会学习更加复杂的类，我们会给这个类创建对象，并且使用对象
        // 对于对象的使用无外乎两个地方：1、操作对象的变量 2、调用类的方法

        // Person1 p = new Person1();
        // p.age （错误写法！private）
        // p.name （正确写法！public）
        // Person1.sex //(类变量）

    }
}
