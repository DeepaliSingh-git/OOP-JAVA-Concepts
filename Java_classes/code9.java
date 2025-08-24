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

    public String subtract(String str, char ch) {
        return str.replace(Character.toString(ch), "");
    }
}

public class code9 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Subtracting two integers: " + calc.subtract(10, 5));
        System.out.println("Subtracting two doubles: " + calc.subtract(10.5, 3.2));
        System.out.println("Subtracting three integers: " + calc.subtract(20, 5, 3));
        System.out.println("Removing a character from a string: " + calc.subtract("hello", 'l'));
    }
}
