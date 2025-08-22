import java.util.Scanner;

// Base class for three-dimensional objects
class ThreeDObject {
    public double wholeSurfaceArea() {
        return 0;
    }

    public double volume() {
        return 0;
    }
}

// Derived class for Box
class Box extends ThreeDObject {
    double length, width, height;

    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double wholeSurfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }

    @Override
    public double volume() {
        return length * width * height;
    }
}

// Derived class for Cube
class Cube extends ThreeDObject {
    double side;

    Cube(double side) {
        this.side = side;
    }

    @Override
    public double wholeSurfaceArea() {
        return 6 * side * side;
    }

    @Override
    public double volume() {
        return side * side * side;
    }
}

// Derived class for Cylinder
class Cylinder extends ThreeDObject {
    double radius, height;

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double wholeSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

// Derived class for Cone
class Cone extends ThreeDObject {
    double radius, height;

    Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double wholeSurfaceArea() {
        return Math.PI * radius * (radius + Math.sqrt(radius * radius + height * height));
    }

    @Override
    public double volume() {
        return (1.0 / 3) * Math.PI * radius * radius * height;
    }
}

// Main class to test the 3D objects
public class ThreeDObjectDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double length, width, height, side, radius;

        System.out.println("Choose a 3D Object:");
        System.out.println("1. Box");
        System.out.println("2. Cube");
        System.out.println("3. Cylinder");
        System.out.println("4. Cone");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter length of Box: ");
                length = scanner.nextDouble();
                System.out.print("Enter width of Box: ");
                width = scanner.nextDouble();
                System.out.print("Enter height of Box: ");
                height = scanner.nextDouble();
                Box box = new Box(length, width, height);
                System.out.println("Box Surface Area: " + box.wholeSurfaceArea());
                System.out.println("Box Volume: " + box.volume());
                break;

            case 2:
                System.out.print("Enter side of Cube: ");
                side = scanner.nextDouble();
                Cube cube = new Cube(side);
                System.out.println("Cube Surface Area: " + cube.wholeSurfaceArea());
                System.out.println("Cube Volume: " + cube.volume());
                break;

            case 3:
                System.out.print("Enter radius of Cylinder: ");
                radius = scanner.nextDouble();
                System.out.print("Enter height of Cylinder: ");
                height = scanner.nextDouble();
                Cylinder cylinder = new Cylinder(radius, height);
                System.out.println("Cylinder Surface Area: " + cylinder.wholeSurfaceArea());
                System.out.println("Cylinder Volume: " + cylinder.volume());
                break;

            case 4:
                System.out.print("Enter radius of Cone: ");
                radius = scanner.nextDouble();
                System.out.print("Enter height of Cone: ");
                height = scanner.nextDouble();
                Cone cone = new Cone(radius, height);
                System.out.println("Cone Surface Area: " + cone.wholeSurfaceArea());
                System.out.println("Cone Volume: " + cone.volume());
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}
