//StringBuilder vs. String Concatenation
public class code25 {
    public static void main(String[] args) {
        long startTime, endTime;
        
        String str = "";
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            str += "a";
        }
        endTime = System.nanoTime();
        System.out.println("String concatenation time: " + (endTime - startTime) + " ns");
        
        StringBuilder sb = new StringBuilder();
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            sb.append("a");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuilder append time: " + (endTime - startTime) + " ns");
    }
}
