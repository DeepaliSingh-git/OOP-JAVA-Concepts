import java.util.Scanner;
class Rectangle {
    private double length;
    private double breadth;
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;}

    public double calculateArea() {
        return length * breadth;}

    public double calculatePerimeter() {
        return 2 * (length + breadth);}

    public void display() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());}
}
public class code6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter breadth of the rectangle: ");
        double breadth = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(length, breadth);
        rectangle.display();
        scanner.close();
    }
}

