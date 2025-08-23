import java.util.Scanner;
class Student {
    private int roll;
    private String name;
    private double fullMark;
    private double securedMark;
    public Student(int roll, String name, double fullMark, double securedMark) {
        this.roll = roll;
        this.name = name;
        this.fullMark = fullMark;
        this.securedMark = securedMark;}
    public double calculateCGPA() {
        return (securedMark / fullMark) * 10;}
    public void displayDetails() {
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Full Marks: " + fullMark);
        System.out.println("Secured Marks: " + securedMark);
        System.out.println("CGPA: " + calculateCGPA());}
}
public class code7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter roll number: ");
        int roll = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter full marks: ");
        double fullMark = scanner.nextDouble();
        System.out.print("Enter secured marks: ");
        double securedMark = scanner.nextDouble();
        Student student = new Student(roll, name, fullMark, securedMark);
        student.displayDetails();
        scanner.close();}
}
