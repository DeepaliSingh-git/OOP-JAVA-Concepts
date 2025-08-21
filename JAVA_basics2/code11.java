import java.util.*;

public class code11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[][] matrix = new int[3][3];
        
        System.out.println("Enter 3x3 matrix:");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        int leftDiagonalSum = 0;
        int rightDiagonalSum = 0;
        
        for (int i = 0; i < 3; i++) {
            leftDiagonalSum += matrix[i][i];           
            rightDiagonalSum += matrix[i][2 - i];      
        }
        
        System.out.println("Left Diagonal Sum = " + leftDiagonalSum);
        System.out.println("Right Diagonal Sum = " + rightDiagonalSum);
    }
}
