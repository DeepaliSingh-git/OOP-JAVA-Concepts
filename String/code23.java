//Memory Optimization with String.intern()
public class code23 {
    public static void main(String[] args) {
        String str1 = new String("hello").intern();
        String str2 = new String("hello").intern();
        
        System.out.println(str1 == str2);
        
        String dynamicStr1 = "world" + "!";
        String dynamicStr2 = ("world" + "!").intern();
        
        System.out.println(dynamicStr1 == dynamicStr2);
    }
}
