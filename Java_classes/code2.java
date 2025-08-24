class Shape {
    protected double area;
    void showArea() {
        System.out.println("Area: " + area);
    }
}
class Circle extends Shape {
    private double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    void calculateArea() {
        area = Math.PI * radius * radius;
    }
}
class Rectangle extends Shape {
    private double length, width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    void calculateArea() {
        area = length * width;
    }
}
public class code2 {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        circle.calculateArea();
        circle.showArea();

        Rectangle rectangle = new Rectangle(4.0, 6.0);
        rectangle.calculateArea();
        rectangle.showArea();
    }
}
