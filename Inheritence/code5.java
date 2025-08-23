import java.util.Scanner;
class Shape {
    public double area(double radius) {
        return Math.PI * radius * radius;
    }
    public double area(double base, double height) {
        return 0.5 * base * height;
    }

    public double area(int side) {
        return side * side;
    }
}
public class code5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape shape = new Shape();

        System.out.println("Choose a shape to calculate area:");
        System.out.println("1. Circle\n2. Triangle\n3. Square");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter radius of the circle: ");
                double radius = scanner.nextDouble();
                System.out.println("Area of the circle: " + shape.area(radius));
                break;
            case 2:
                System.out.print("Enter base of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter height of the triangle: ");
                double height = scanner.nextDouble();
                System.out.println("Area of the triangle: " + shape.area(base, height));
                break;
            case 3:
                System.out.print("Enter side of the square: ");
                int side = scanner.nextInt();
                System.out.println("Area of the square: " + shape.area(side));
                break;
            default:
                System.out.println("Invalid choice");
        }
       scanner.close();
    }
}
