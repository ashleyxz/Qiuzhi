/*
计算圆的面积 A= 3.14 * r * r
 */

public class Circle {
    public static void main(String[] args) {
        double a = new Circle().area(2); // 匿名对象
        System.out.println("半径为2的圆面积是：" + a);

    }

    public double area(double r) {
        return 3.14 * r * r;
    }
}
