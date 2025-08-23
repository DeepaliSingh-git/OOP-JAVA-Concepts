class Calculator {
    public int subtract(int a, int b) {
        return a - b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public int subtract(int a, int b, int c) {
        return a - b - c;
    }
}

public class code4 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Subtract two integers: " + calc.subtract(10, 5));
        System.out.println("Subtract two doubles: " + calc.subtract(10.5, 5.2));
        System.out.println("Subtract three integers: " + calc.subtract(20, 5, 3));
    }
}
