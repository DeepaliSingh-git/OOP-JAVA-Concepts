//merge two sorted array so that the resulting array is also sorted
import java.util.Arrays;

public class code10 {

    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {2, 4, 6, 8, 10};
        int[] mergedArray = mergeSortedArrays(array1, array2);
        System.out.println("Merged Sorted Array: " + Arrays.toString(mergedArray));
    }
    public static int[] mergeSortedArrays(int[] array1, int[] array2) {
        int n1 = array1.length;
        int n2 = array2.length;
        int[] result = new int[n1 + n2];

        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (array1[i] <= array2[j]) {
                result[k++] = array1[i++];
            } else {
                result[k++] = array2[j++];
            }
        }
        while (i < n1) {
            result[k++] = array1[i++];
        }
        while (j < n2) {
            result[k++] = array2[j++];
        }
        return result;
    }
}
