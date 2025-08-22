// Custom Implementation of indexOf()
public class code30 {
    public static int indexOf(String str, String sub) {
        if (sub.isEmpty()) return 0;
        for (int i = 0; i <= str.length() - sub.length(); i++) {
            if (str.substring(i, i + sub.length()).equals(sub)) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        String input = "hello world";
        String search = "world";
        System.out.println(indexOf(input, search));
    }
}


