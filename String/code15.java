//Implement a Custom split()
import java.util.ArrayList;
import java.util.List;

public class code15 {
    public static int countOccurrences(String str, String sub) {
        int count = 0;
        int index = 0;
        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;}
    
    public static String[] customSplit(String str, char delimiter) {
        List<String> result = new ArrayList<>();
        StringBuilder current = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c == delimiter) {
                result.add(current.toString());
                current.setLength(0);
            } else {
                current.append(c);
            }}
        result.add(current.toString());
        return result.toArray(new String[0]);
    }
    public static void main(String[] args) {
        String str = "ababcab";
        String sub = "ab";
        System.out.println(countOccurrences(str, sub));
        
        String text = "apple,banana,grape";
        String[] parts = customSplit(text, ',');
        for (String part : parts) {
            System.out.println(part);
        }}}