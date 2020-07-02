// 方法的【重载】
// 多个相同名称的方法，如果想在一个类中共存，那么这些同名方法一定是参数的个数或者参数的数据类型不一样

public class Overload {
    public int add(int x, int y) {
        return x + y;
    }

/*    public int add(int m, int n) { // 错误写法！和参数名无关！
        return x + y;
    }*/

    public double add(int x, double y) {
        return x + y;
    }

    public int add(int x, int y, int z) {
        return x + y + z;
    }


}
