//grading system


import java.util.Scanner;

public class lab1code2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the mark: ");
        int mark = scanner.nextInt();

        String grade;
        if (mark >= 90) {
            grade = "O";
        } else if (mark >= 80) {
            grade = "A";
        } else if (mark >= 70) {
            grade = "B";
        } else if (mark >= 60) {
            grade = "C";
        } else if (mark >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Your grade is: " + grade);
        scanner.close();
    }
}


