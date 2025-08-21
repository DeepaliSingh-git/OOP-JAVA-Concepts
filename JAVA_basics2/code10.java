import java.util.*;

public class code10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter list of numbers separated by spaces:");

        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");
        
        Map<String, Integer> countMap = new HashMap<>();

        for (String num : inputArray) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            System.out.println("Occurrence of " + entry.getKey() + "=" + entry.getValue());
        }
    }
}
