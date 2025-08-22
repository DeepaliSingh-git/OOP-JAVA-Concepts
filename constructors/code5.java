import java.util.Scanner;

class Grader {
    int score;

    Grader(int score) {
        this.score = score;
    }

    String letterGrade() {
        if (score >= 90) {
            return "O";
        } else if (score >= 80) {
            return "E";
        } else if (score >= 70) {
            return "A";
        } else if (score >= 60) {
            return "B";
        } else if (score >= 50) {
            return "C";
        } else {
            return "F";
        }
    }
}

public class GraderDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score;

        while (true) {
            System.out.print("Enter the score (0 to 100): ");
            score = scanner.nextInt();

            if (score >= 0 && score <= 100) {
                break;
            } else {
                System.out.println("Invalid input. Please enter a score between 0 and 100.");
            }
        }

        Grader grader = new Grader(score);
        System.out.println("The letter grade is: " + grader.letterGrade());
    }
}
