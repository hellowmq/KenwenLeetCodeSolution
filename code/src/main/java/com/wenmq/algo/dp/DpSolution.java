package com.wenmq.algo.dp;

public class DpSolution {


    /// abcde
/// a?b*de
    public static boolean isMatch(String s, String p) {
        int ls = s.length();
        int lp = p.length();
        boolean[][] dp = new boolean[lp + 1][ls + 1];
        for (int i = 1; i <= lp; i++) {
            if (p.charAt(i - 1) != '*') {
                break;
            }
            dp[i][0] = true;
        }
        dp[0][0] = true;
        for (int i = 1; i <= lp; i++) {
            for (int j = 1; j <= ls; j++) {
                if (p.charAt(i - 1) == s.charAt(j - 1) || p.charAt(i - 1) == '?') {
                    dp[i][j] = dp[i - 1][j - 1];
//                    character match
                } else if (p.charAt(i - 1) == '*') {
                    dp[i][j] = dp[i - 1][j] // '*' march empty
                            || dp[i][j - 1] // '*' march any and not consume
                    ;
                }
            }
        }
        return dp[lp][ls];
    }




    static public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] result = new int[m + 1][n + 1];
        result[0][1] = 1;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (obstacleGrid[i - 1][j - 1] == 0) {
                    result[i][j] = result[i][j - 1] + result[i - 1][j];
                } else {
                    result[i][j] = 0;
                }
            }
        }
        return result[m][n];
    }

    public static void main(String[] args) {
//        System.out.println(isMatch("abade", "a?ad*e"));
        int[][] a = new int[3][5];
//        a[1][2] = 1;
        System.out.println(uniquePathsWithObstacles(a));
    }
}
