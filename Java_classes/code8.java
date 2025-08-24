import java.util.Scanner;

class Student {
    int roll;
    String name;
    double cgpa;

    Student(int roll, String name, double cgpa) {
        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
    }
    int getRoll() {
        return roll;}
    String getName() {
        return name;}
    double getCgpa() {
        return cgpa;}
    void displayDetails() {
        System.out.println("Roll No: " + roll + ", Name: " + name + ", CGPA: " + cgpa);
    }
}
public class code8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Enter Roll No: ");
            int roll = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter CGPA: ");
            double cgpa = scanner.nextDouble();

            students[i] = new Student(roll, name, cgpa);
        }
        System.out.println("\nDetails of Students:");
        for (Student student : students) {
            student.displayDetails();
        }
        Student lowestCgpaStudent = students[0];
        for (Student student : students) {
            if (student.getCgpa() < lowestCgpaStudent.getCgpa()) {
                lowestCgpaStudent = student;
            }
        }
        System.out.println("\nStudent with the lowest CGPA:");
        lowestCgpaStudent.displayDetails();
    }
}

//step1 import statement for scanner
//step2 a) class declaration with its elements
//      b) under class object creation and assignment of elements with 'this' keyword
//      c) methods to returngiven elements with return type
//step 3 main method 
