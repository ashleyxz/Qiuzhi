/*
动物的类：

 */
public class Animal {
    String name;  // 动物的名称
    int eye; // 眼睛的个数
    int leg; // 几条腿

    /*
    方法：输出动物吃的食物
     */
    public void eat(String food, int i, char a) {
        // String food这个叫方法的【参数-形参】，方法的参数可以有多个，参数之间用，分隔
        System.out.println("此种动物的食物是：" + food);
        System.out.println("此种动物的年龄是：" + i);
        System.out.println("此种动物的：" + a);

    }

    /*
    方法：输出动物的移动方式
    */
    public void move(String moveType) {
        System.out.println("此种动物的移动方式是：" + moveType);

    }
}
