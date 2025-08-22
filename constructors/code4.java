class MyClass {
    MyClass() {
        System.out.println("No arguments constructor");
    }

    MyClass(int a) {
        System.out.println("Integer: " + a);
    }

    MyClass(int a, String b) {
        System.out.println("Integer: " + a + ", String: " + b);
    }

    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass(10);
        MyClass obj3 = new MyClass(20, "Hello");
    }
}
