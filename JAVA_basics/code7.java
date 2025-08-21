import java.util.ArrayList;
import java.util.Scanner;
public class code7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System. in) ;
        System.out. print("Enter the number of elements in the array: ");
        int size = scanner.nextInt ();
        int[] array = new int[size];
        System.out. println("Enter " + size + " elements:");
        for (int i = 0; i< size; i++) {
            System.out. print("Element" + (i + 1) + ":");
            array [i] =scanner.nextInt();
        }
        ArrayList<Integer> evenElements= new ArrayList<>();
        for (int num : array) {
            if (num % 2 ==0) { 
                evenElements.add (num) ;
            }
        }

        System.out. println("The array after removing oddk elements:") ;
        for (int i = 0; i < evenElements.size(); i++) {
            System.out . println("Element" + (i + 1) + ": "+ evenElements.get(i));
        }

        scanner.close();
    }
}