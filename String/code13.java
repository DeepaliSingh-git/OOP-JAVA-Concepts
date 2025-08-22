//  Find Longest Repeating Substring
public class code13 {
    public static void main(String[] args) {
        String str = "banana";
        System.out.println(findLongestRepeatingSubstring(str));
    }

    public static String findLongestRepeatingSubstring(String s) {
        int n = s.length();
        int[][] dp = new int[n + 1][n + 1];
        int maxLength = 0, endIndex = 0;
        
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (s.charAt(i - 1) == s.charAt(j - 1) && dp[i - 1][j - 1] < (j - i)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    if (dp[i][j] > maxLength) {
                        maxLength = dp[i][j];
                        endIndex = i;
                    }
                }
            }
        }
        return maxLength > 0 ? s.substring(endIndex - maxLength, endIndex) : "";
    }
}
