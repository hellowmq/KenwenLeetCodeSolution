package com.wenmq.algo.dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    public int respace(String[] dictionary, String sentence) {
        Set<String> dict = new HashSet<>(Arrays.asList(dictionary));
        int n = sentence.length();
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1] + 1;
            for (int idx = 0; idx < i; idx++) {
                if (dict.contains(sentence.substring(idx, i))) {
                    dp[i] = Math.min(dp[i], dp[idx]);
                }
            }
        }
        return dp[n];
    }

    class Solution {
        private int[] c;
        private int[] a;

        public List<Integer> countSmaller(int[] nums) {
            List<Integer> resultList = new ArrayList<Integer>();
            discretization(nums);
            init(nums.length + 5);
            for (int i = nums.length - 1; i >= 0; --i) {
                int id = getId(nums[i]);
                resultList.add(query(id - 1));
                update(id);
            }
            Collections.reverse(resultList);
            return resultList;
        }

        private void init(int length) {
            c = new int[length];
            Arrays.fill(c, 0);
        }

        private int lowBit(int x) {
            return x & (-x);
        }

        private void update(int pos) {
            while (pos < c.length) {
                c[pos] += 1;
                pos += lowBit(pos);
            }
        }

        private int query(int pos) {
            int ret = 0;
            while (pos > 0) {
                ret += c[pos];
                pos -= lowBit(pos);
            }

            return ret;
        }

        private void discretization(int[] nums) {
            Set<Integer> set = new HashSet<Integer>();
            for (int num : nums) {
                set.add(num);
            }
            int size = set.size();
            a = new int[size];
            int index = 0;
            for (int num : set) {
                a[index++] = num;
            }
            Arrays.sort(a);
        }

        private int getId(int x) {
            return Arrays.binarySearch(a, x) + 1;
        }
    }


}
