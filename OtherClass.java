public class OtherClass {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        System.out.println(obj.x);
        System.out.println(obj.y);

        MyClass obj2 = new MyClass();
        obj2.x = 10;
        System.out.println(obj2.x);
        System.out.println(obj.x);

        // obj2.y = 25;    // Compile Error.
    }
}
