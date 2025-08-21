import java.util.Scanner;
import java.util.Arrays;

public class code8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the list: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size]; 

        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);

        System.out.println("Numbers in ascending order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
