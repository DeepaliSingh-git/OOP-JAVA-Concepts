import java.util.Scanner;
public class code8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out. print( "Enter the number of rowS in the matrix:");
        int rows = Scanner. nextInt() ;
        System.out. print("Enter the number of columns in the matrix:");
        int cols = scanner.nextInt();
        int[][] matrix = new int[rows] [cols];
        int zeroCount= 0;
        System.out. print ("Enter the elements of the matrix:");
        for (int i -0; i < rows; it) {
             for (int j - 0; j< cols; j++) {
                matrix[i][j] = scanner. nextInt() ;
                if (matrix[i][j] = 0) {
                    zeroCount++;
                }

int totalElements rows * cols;
if (zeroCount > totalElements / 2) (
else
System. out . println("The matrix is sparse.");
System.out.println("The matrix is not sparse."):
scanner.close(0;