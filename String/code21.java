//Garbage Collection Check
public class code21 {
    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            String temp = new String("LoopString" + i);
        }
        System.gc();
        String outsideLoop = new String("PersistentString");
        System.out.println("Garbage Collection invoked");
    }
}
