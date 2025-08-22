// Check if Two Strings are Anagrams
import java.util.Arrays;

public class code20 {
    public static boolean areAnagrams(String str1, String str2) {
        char[] arr1 = str1.replaceAll("[^A-Za-z0-9]", "").toLowerCase().toCharArray();
        char[] arr2 = str2.replaceAll("[^A-Za-z0-9]", "").toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
    
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(areAnagrams(str1, str2));
    }
}
