package DAY4_13_1;
class Triangle {
    private float a, b, c;
    public void set_Dim(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;}
    public boolean is_Triangle() {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
    public float find_area() {
        if (is_Triangle()) {
            float s = (a + b + c) / 2; // Semi-perimeter
            return (float) Math.sqrt(s * (s - a) * (s - b) * (s - c));
        } else {
            System.out.println("The sides do not form a valid triangle.");
            return -1;
        }}
    public float find_perimeter() {
        if (is_Triangle()) {
            return a + b + c;
        } else {
            System.out.println("The sides do not form a valid triangle.");
            return -1;
        }}
    public void show() {
        System.out.println("Sides of the triangle: a = " + a + ", b = " + b + ", c = " + c);
        if (is_Triangle()) {
            System.out.println("Area of the triangle: " + find_area());
            System.out.println("Perimeter of the triangle: " + find_perimeter());
        } else {
            System.out.println("The sides do not form a valid triangle.");}}}

public class code10 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        Triangle triangle = new Triangle();
        System.out.println("Enter the sides of the triangle (a, b, c):");
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();
        triangle.set_Dim(a, b, c);
        triangle.show();
        scanner.close();
    }
}