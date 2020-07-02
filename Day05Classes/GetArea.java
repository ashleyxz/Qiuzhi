/*
这个函数是在GetArea类里写的，然后在main方法里实例化a，调用了下面的参数
在类里创建的方法可以在main里调用

 进入主程序main方法，实例化对象，调用getArea方法，把参数传递到方法里，x = 2, y = 3,
 return 6, 把这个值赋给area
 */

public class GetArea {

    public static void main(String[] args) {
        GetArea a = new GetArea();
        int area = a.getArea(2, 3);
        System.out.println(area);
    }

    public int getArea(int x, int y) { // 方法有2个形参，x 和 y
        return x * y;
    }

}
