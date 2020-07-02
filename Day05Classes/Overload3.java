public class Overload3 {

    public static void main(String[] args) {
        Overload3 t2 = new Overload3();

        t2.max(0, 1);
        t2.max(0.2, 1.5);
        t2.max(9.1, 2, 4.5);
    }

    public void max(int a, int b) {
        if (a > b) {
            System.out.println("最大值是:" + a);
        } else {
            System.out.println("最大值是:" + b);
        }
    }


/*    public void max(double m, double n) {
        if (m > n) {
            System.out.println("最大值是：" + m);
        } else {
            System.out.println("最大值是：" + n);
        }
    }*/

    // 换一种写法：标准的if-else
    public void max(double p, double q) {
        double res = 0;
        if (p > q) {
            res = p;
        } else {
            res = q;
        }
        System.out.println("最大值是:" + res);
    }

    // 三元运算符
/*    public void max(double a, double b) {
        double maxx = a > b ? a : b;
        System.out.println("最大值是：" + maxx);
    }*/


/*    public void max(double x, double y, double z) {
        if (x > y && x > z) {
            System.out.println("最大值是：" + x);
        } else if (y > x && y > z) {
            System.out.println("最大值是：" + y);
        } else {
            System.out.println("最大值是：" + z);
        }
    }*/

    // if-else
    public void max(double x, double y, double z) {
        double res = 0;
        if (x > y) {
            if (x > z) {
                res = x;
            } else {
                res = z;
            }
        } else {
            if (y > z) {
                res = y;
            } else {
                res = z;
            }
        }
        System.out.println("最大值是:" + res);
    }

    // 三目运算（使用中间第三方变量实现）
/*    public void max(double x, double y, double z) {
        double temp = x > y ? x : y;
        double maxx = temp > z ? temp : z;

        System.out.println("最大值是：" + maxx);
}*/

}
