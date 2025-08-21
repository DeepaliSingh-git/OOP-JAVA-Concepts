// a program to print your name, roll no, section and branch in separate lines.

import java.util.Scanner;

public class lab1code1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your roll number: ");
        String rollNumber = scanner.nextLine();
        
        System.out.print("Enter your section: ");
        String section = scanner.nextLine();
        
        System.out.print("Enter your branch: ");
        String branch = scanner.nextLine();
        System.out.println("\nYour Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Section: " + section);
        System.out.println("Branch: " + branch);

        scanner.close();
    }
}
