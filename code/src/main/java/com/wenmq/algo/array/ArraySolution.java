package com.wenmq.algo.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author ifans.wen
 * @date 2020/7/6
 * @description
 */
public class ArraySolution {

    public static void main(String[] args) {
        int[][] aa = new int[][]{{1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}};
        int[][] bb = new int[][]{{2, 2, 2}, {2, 1, 2}, {2, 2, 2}};
        int[][] cc = new int[][]{{1, 1}, {3, 4}, {-1, 0}};
        System.out.println(minTimeToVisitAllPoints(cc));
        printArray(divingBoard(1, 2, 3));
//        System.out.println(surfaceArea(bb));
//        System.out.println(numWays(7));
        System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        System.out.println(maxSubArray2(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
//        System.out.println(hasGroupsSizeX(new int[]{1, 2, 3, 4, 4, 3, 2, 1}));
//
//        int[][] bb = new int[10][10];
//        int i = 0;
//        for (int[] b : bb) {
//            for (int j = 0; j < b.length; j++) {
//                b[j] = i++;
//            }
//        }
//        printArray(spiralOrder(aa));
//        int[][] ints = new int[0][0];
//        printArray(spiralOrder(ints));

    }

    static public void printArray(int[] a) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < a.length; i++) {
            if (i > 0) sb.append(' ');
            sb.append(a[i]);
        }
        sb.append(']');
        System.out.println(sb);
    }

    static public int[] spiralOrder(int[][] matrix) {
        int m = matrix.length;
        if (m == 0) return new int[0];
        int n = matrix[0].length;
        if (n == 0) return new int[0];
        int left = 0;
        int top = 0;
        int right = n - 1;
        int bottom = m - 1;
        int[] result = new int[m * n];
        int index = 0;
        while (left <= right && top <= bottom) {
            for (int i = left; i <= right && top <= bottom; i++) {
                result[index++] = matrix[top][i];
            }
            top++;
            for (int i = top; left <= right && i <= bottom; i++) {
                result[index++] = matrix[i][right];
            }
            right--;
            for (int i = right; i >= left && top <= bottom; i--) {
                result[index++] = matrix[bottom][i];
            }
            bottom--;
            for (int i = bottom; left <= right && i >= top; i--) {
                result[index++] = matrix[i][left];
            }
            left++;
        }
        return result;
    }

    // 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
// A(n+2) = A(n+1)+ A(n)
// A(0) = 1, A(1) = 1, A(2) = 2,
//
    static public int numWays(int n) {
        if (n < 2) return 1;
        int[] fibo = new int[n + 1];
        fibo[0] = 1;
        fibo[1] = 1;
        for (int i = 2; i <= n; i++) {
            fibo[i] = (fibo[i - 1] + fibo[i - 2]) % 1000000007;
        }
        return fibo[n];
    }


    static public int[] runningSum(int[] nums) {
        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        for (int i = 1, numsLength = nums.length; i < numsLength; i++) {
            sum[i] = sum[i - 1] + nums[i];
        }
        return sum;
    }


    static public int maxSubArray(int[] nums) {
        int cur = 0, max = Integer.MIN_VALUE;
        for (int num : nums) {
            cur = cur > 0 ? (cur + num) : num;
            max = Math.max(max, cur);
        }
        return max;
    }

    static public boolean hasGroupsSizeX(int[] deck) {
        int[] hash = new int[10000];
        for (int num : deck) {
            hash[num]++;
        }
        int maxS = 0;
        for (int num : hash) {
            if (num == 0) continue;
            maxS = gcd(maxS, num);
            if (maxS == 1) return false;
        }


        return maxS >= 2;
    }

    static private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    //  容斥原理
    static public int surfaceArea(int[][] grid) {
        int n = grid.length;
        int area = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // 容斥原理的核心
                // 先忽略所有的重叠和重复计算
                int num = grid[i][j];
                area += num * 6;
                // 计算完统计后再执行减操作
                // 竖直方向重叠面的个数
                area -= Math.max((num - 1) << 1, 0);
                // 与相邻左或上重叠面的个数
                area -= getConflictLT(grid, i, j);
            }
        }
        return area;
    }

    /**
     * 计算指定节点与相邻节点的冲突
     * 容易越界，所以单独抽出来
     */
    static public int getConflictLT(int[][] grid, int i, int j) {
        int left = 0;
        int top = 0;
        int num = grid[i][j];
        if (i != 0) {
            top = Math.min(grid[i - 1][j], num);
        }
        if (j != 0) {
            left = Math.min(grid[i][j - 1], num);
        }
        return (left + top) * 2;
    }


    public static int minTimeToVisitAllPoints(int[][] points) {
        if (points.length < 2 || points[0].length < 2) return 0;
        int sum = 0;
        for (int i = 1; i < points.length; i++) {
            sum += Math.max(Math.abs(points[i][0] - points[i - 1][0]), Math.abs(points[i][1] - points[i - 1][1]));
        }
        return sum;
    }

    static public int[] intersect(int[] nums1, int[] nums2) {
        int[] nums11, nums22;
        List<Integer> list = new ArrayList<>();
        if (nums1.length < nums2.length) {
            nums11 = nums1;
            nums22 = nums2;
        } else {
            nums11 = nums2;
            nums22 = nums1;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums11.length; i++) {
            int key = nums11[i];
            map.put(key, (map.containsKey(key) ? map.get(key) : 0) + 1);
        }
        for (int i = 0; i < nums22.length; i++) {
            int key = nums22[i];
            if (map.containsKey(key) && map.get(key) > 0) {
                list.add(key);
                map.put(key, map.get(key) - 1);
            }
        }
        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;


    }
    static public int[] divingBoard(int shorter, int longer, int k) {
        if (k == 0) return new int[]{};
        int d = longer - shorter;
        if (d == 0) return new int[]{shorter * k};
        int[] a = new int[k + 1];
        int sum = shorter * k;
        a[0] = sum;
        for (int i = 1; i <= k; i++) {
            sum += d;
            a[i] = sum;
        }
        return a;
    }

    static public int maxSubArray2(int[] nums) {
        int max = Integer.MIN_VALUE;
        int cur = 0;
        for (int i = 0; i < nums.length; i++) {
            cur = cur > 0 ? cur + nums[i] : nums[i];
            max = Math.max(max, cur);
        }
        return max;
    }

    public int[] exchange(int[] nums) {
        int end = nums.length - 1;
        int start = 0;
        boolean matchStart = false;
        boolean matchEnd = false;
        matchStart = (nums[start] & 1) == 1;
        matchEnd = (nums[end] & 1) == 0;
        while (start < end) {
            if (!matchStart) {
                start++;
                matchStart = (nums[start] & 1) == 1;
            }
            if (!matchEnd) {
                end++;
                matchEnd = (nums[end] & 1) == 0;
            }
            if (matchStart & matchEnd) {
                nums[start] ^= nums[end];
                nums[end] ^= nums[start];
                nums[start] ^= nums[end];
            }
        }


        return nums;
    }
}
