class Base {
    int value;

    Base(int value) {
        this.value = value;
        System.out.println("Base class constructor called with value: " + value);
    }
}

class Derived extends Base {
    String message;

    Derived(int value, String message) {
        super(value);
        this.message = message;
        System.out.println("Derived class constructor called with message: " + message);
    }
}

public class code4 {
    public static void main(String[] args) {
        Derived derived = new Derived(42, "Hello from Derived class");
    }
}
