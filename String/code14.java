//Substring Count
public class code14 {
    public static int countOccurrences(String str, String sub) {
        int count = 0;
        int index = 0;
        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;
    }
    
    public static void main(String[] args) {
        String str = "ababcab";
        String sub = "ab";
        System.out.println(countOccurrences(str, sub));
    }
}
