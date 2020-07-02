public class Overload2 {

    public static void main(String[] args) {
        Overload2 test = new Overload2();

        test.mOL(3);
        test.mOL(2, 4);
        test.mOL("重载方法");

    }

    public void mOL(int a) {
        System.out.println(a * a);
    }

    public void mOL(int x, int y) {
        System.out.println(x * y);
    }

    public void mOL(String str) {
        System.out.println(str);
    }

}
