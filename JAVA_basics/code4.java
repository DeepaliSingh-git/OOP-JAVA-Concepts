import java.util.Scanner;
public class code4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in) ;
        System.out. println("Enter the number of rows for the diamond pattern:");
            int rows = scanner.nextInt();
            for (int i=1; i < rows; i++) {
                for (int j =rows; j> i; j--) {
                    System.out.print(" ");
                }
                for (int k=1; k <= (2 * i - 1); k++) {
                    System.out. print ("*");
                }
            System.out.println();
            }

            for (int i= rows - 1; i > 1; i--){
                for (int j=rows; j > i; j--) {
                    System.out. print (" ");
                }
            
                for (int k= 1; k <= (2 * i - 1); k++){
                    System.out. print ("*");
                }
                System.out. println();
            }
    
            scanner.close();
    }
}