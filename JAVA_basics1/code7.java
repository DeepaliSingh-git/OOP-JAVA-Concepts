//read the array and delete the odd elements
import java.util.Scanner;
import java.util.ArrayList;

public class code7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        ArrayList<Integer> evenElements = new ArrayList<>();

        for (int num : array) {
            if (num % 2 == 0) {
                evenElements.add(num);
            }
        }
        System.out.println("The array after removing odd elements:");
        for (int even : evenElements) {
            System.out.print(even + " ");
        }
        scanner.close();
    }
}
