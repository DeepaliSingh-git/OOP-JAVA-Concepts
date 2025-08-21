import java.util.Scanner;

public class code2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the marks: "); //print statement
        int marks = scanner.nextInt();      //declaration and scan statement combined
        String grade;    

        if (marks >= 90) {
            grade = "O";
        } else if (marks >= 80) {
            grade = "E";
        } else if (marks >= 70) {
            grade = "A";
        } else if (marks >= 60) {
            grade = "B";
        } else if (marks >= 50) {
            grade = "C";
        } else {
            grade = "F";
        }

        System.out.println("Grade: " + grade);
    }
}
