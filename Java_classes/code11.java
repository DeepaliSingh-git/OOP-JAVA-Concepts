import java.util.Scanner;

class Rectangle {
    private double length;
    private double breadth;

    public Rectangle() {
        length = 0;
        breadth = 0;
    }

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        return length * breadth;
    }
}

public class code11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose constructor type:");
        System.out.println("1. Default Constructor");
        System.out.println("2. Parameterized Constructor");
        System.out.print("Enter your choice (1/2): ");
        int choice = scanner.nextInt();
        Rectangle rectangle;
        if (choice == 1) {
            rectangle = new Rectangle();
            System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        } else if (choice == 2) {
            System.out.print("Enter length of the rectangle: ");
            double length = scanner.nextDouble();
            System.out.print("Enter breadth of the rectangle: ");
            double breadth = scanner.nextDouble();

            rectangle = new Rectangle(length, breadth);
            System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        } else {
            System.out.println("Invalid choice!");
        }
    }
}
