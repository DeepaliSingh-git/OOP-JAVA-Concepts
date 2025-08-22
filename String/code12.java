//Longest Common Substring

public class code12 {
    public static void main(String[] args) {
        String str1 = "abcdef";
        String str2 = "zbcdf";
        System.out.println(findLongestCommonSubstring(str1, str2));
    }

    public static String findLongestCommonSubstring(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m + 1][n + 1];
        int maxLength = 0, endIndex = 0;
        
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    if (dp[i][j] > maxLength) {
                        maxLength = dp[i][j];
                        endIndex = i;
                    }
                }
            }}
        return s1.substring(endIndex - maxLength, endIndex);
    }}
