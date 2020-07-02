public class Person2 {
    public String name;
    public int age;
    public int sex;

    public void showName() {
        System.out.println("名字是：" + name);
    }

    public void study() {
        System.out.println("studying");
    }

    public void showAge() {
        System.out.println(age);
    }

    public int addAge(int i) {
        age += i;
        return age;
    }


}
