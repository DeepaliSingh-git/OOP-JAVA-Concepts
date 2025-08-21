import java.util.Scanner;

public class code1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Name: ");  //printf("enter your name");
        String name = scanner.nextLine();       //scanf("%d", &name);

        System.out.print("Enter your Roll Number: ");
        String rollNo = scanner.nextLine();

        System.out.print("Enter your Section: ");
        String section = scanner.nextLine();

        System.out.print("Enter your Branch: ");
        String branch = scanner.nextLine();

        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Section: " + section);
        System.out.println("Branch: " + branch);
    }
}


