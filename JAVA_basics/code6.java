import java.util.ArrayList;
import java.util.Scanner;
public class code6 {
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
        ArrayList<Integer> oddElements= new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (array [i] % 2 !=0) { 
                oddElements.add (array[i]) ;
            }
        }

        System.out. println("The array after removing even elements:") ;
        for (int i = 0; i < oddElements.size(); i++) {
            System.out . println("Element" + (i + 1) + ": "+ oddElements.get(i));
        }

        scanner.close();
    }
}