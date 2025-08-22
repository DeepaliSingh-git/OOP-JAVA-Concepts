//Multi-threading with Strings
class StringBufferExample implements Runnable {
    StringBuffer buffer = new StringBuffer();
    public void run() {
        for (int i = 0; i < 1000; i++) {
            buffer.append(i);
        }
    }
}

class StringBuilderExample implements Runnable {
    StringBuilder builder = new StringBuilder();
    public void run() {
        for (int i = 0; i < 1000; i++) {
            builder.append(i);
        }}}

public class code22 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new StringBufferExample());
        Thread t2 = new Thread(new StringBufferExample());
        t1.start();t2.start();t1.join();t2.join();
        
        Thread t3 = new Thread(new StringBuilderExample());
        Thread t4 = new Thread(new StringBuilderExample());
        t3.start();t4.start();t3.join();t4.join();
        
        System.out.println("StringBuffer is thread-safe, StringBuilder is not");
    }
}
