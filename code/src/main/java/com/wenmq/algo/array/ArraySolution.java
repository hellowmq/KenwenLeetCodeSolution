package com.wenmq.algo.array;

/**
 * @author ifans.wen
 * @date 2020/7/6
 * @description
 */
public class ArraySolution {

    public static void main(String[] args) {
        System.out.println(numWays(7));
//        int[][] aa = new int[][]{{1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}};
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


}
