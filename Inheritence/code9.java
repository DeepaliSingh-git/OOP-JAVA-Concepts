import java.util.Scanner;

class TwoDShape {
    private double area;

    public TwoDShape(double length, double breadth) {
        this.area = length * breadth;
    }

    public TwoDShape(double radius) {
        this.area = Math.PI * radius * radius;
    }

    public double getArea() {
        return area;
    }
}

class ThreeDShape extends TwoDShape {
    private double volume;

    public ThreeDShape(double length, double breadth, double height) {
        super(length, breadth);
        this.volume = length * breadth * height;
    }

    public ThreeDShape(double side) {
        super(side, side);
        this.volume = Math.pow(side, 3);
    }

    public ThreeDShape(double radius, boolean isSphere) {
        super(radius);
        if (isSphere) {
            this.volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        }
    }

    public double getVolume() {
        return volume;
    }
}

public class code9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a plastic shape to calculate cost:");
        System.out.println("1. 2D Sheet\n2. 3D Box");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter length of the sheet: ");
                double length = scanner.nextDouble();
                System.out.print("Enter breadth of the sheet: ");
                double breadth = scanner.nextDouble();
                TwoDShape sheet = new TwoDShape(length, breadth);
                System.out.println("Cost of the sheet: Rs " + (sheet.getArea() * 40));
                break;
            case 2:
                System.out.print("Enter length of the box: ");
                double boxLength = scanner.nextDouble();
                System.out.print("Enter breadth of the box: ");
                double boxBreadth = scanner.nextDouble();
                System.out.print("Enter height of the box: ");
                double boxHeight = scanner.nextDouble();
                ThreeDShape box = new ThreeDShape(boxLength, boxBreadth, boxHeight);
                System.out.println("Cost of the box: Rs " + (box.getVolume() * 60));
                break;
            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }
}
