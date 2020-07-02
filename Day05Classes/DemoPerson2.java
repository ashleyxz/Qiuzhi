public class DemoPerson2 {
    public static void main(String[] args) {

        Person2 person2 = new Person2();

        person2.name = "lucy";
        person2.age = 11;
        person2.sex = 1;


        person2.showName();
        person2.study();
        person2.showAge();

        int a = person2.addAge(2);
        System.out.println("增加后的年龄是：" + a);


    }
}
