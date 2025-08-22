import java.util.Arrays;

public class MergeSortedArrays {
    public static int[] mergeSortedArrays(int[] A, int[] B) {
        int m = A.length, n = B.length;
        int[] C = new int[m + n];
        int i = 0, j = 0, k = 0;
        
        while (i < m && j < n) {
            if (A[i] <= B[j]) {
                C[k++] = A[i++];
            } else {
                C[k++] = B[j++];
            }
        }
        while (i < m) {
            C[k++] = A[i++];
        }
        while (j < n) {
            C[k++] = B[j++];
        }

        return C;
    }

    public static void main(String[] args) {
        int[] A = {1, 3, 5, 7};
        int[] B = {2, 4, 6, 8};
        
        int[] C = mergeSortedArrays(A, B);
        
        System.out.println("Merged sorted array: " + Arrays.toString(C));
    }
}
