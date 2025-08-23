import java.util.Scanner;
class MyVolume {
    private double volume;
    public MyVolume(double side) {
        this.volume = Math.pow(side, 3);}

    public MyVolume(double length, double breadth, double height) {
        this.volume = length * breadth * height;}

    public MyVolume(double radius, boolean isSphere) {
        if (isSphere) {
            this.volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        }}

    public double getVolume() {
        return volume;
    }}
public class code8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape to calculate volume:");
        System.out.println("1. Cube\n2. Cuboid\n3. Sphere");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter side of the cube: ");
                double side = scanner.nextDouble();
                MyVolume cube = new MyVolume(side);
                System.out.println("Volume of the cube: " + cube.getVolume());
                break;
            case 2:
                System.out.print("Enter length of the cuboid: ");
                double length = scanner.nextDouble();
                System.out.print("Enter breadth of the cuboid: ");
                double breadth = scanner.nextDouble();
                System.out.print("Enter height of the cuboid: ");
                double height = scanner.nextDouble();
                MyVolume cuboid = new MyVolume(length, breadth, height);
                System.out.println("Volume of the cuboid: " + cuboid.getVolume());
                break;
            case 3:
                System.out.print("Enter radius of the sphere: ");
                double radius = scanner.nextDouble();
                MyVolume sphere = new MyVolume(radius, true);
                System.out.println("Volume of the sphere: " + sphere.getVolume());
                break;
            default:
                System.out.println("Invalid choice"); }

        scanner.close();}
}
