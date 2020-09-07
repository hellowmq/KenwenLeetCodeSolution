package com.wenmq.algo.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.function.ToIntFunction;

/**
 * @author ifans.wen
 * @date 2020/7/6
 * @description
 */
public class ArraySolution {

    private static ArraySolution _instance;

    public static void main(String[] args) {
        int[][] aa = new int[][]{{1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}};
        int[][] bb = new int[][]{{2, 2, 2}, {2, 1, 2}, {2, 2, 2}};
        int[][] cc = new int[][]{{1, 1}, {3, 4}, {-1, 0}};
//        System.out.println(minTimeToVisitAllPoints(cc));
//        printArray(divingBoard(1, 2, 3));
//        System.out.println(surfaceArea(bb));
//        System.out.println(numWays(7));
//        System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
//        System.out.println(maxSubArray2(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
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
//        List<List<Integer>> listList = new ArrayList<>();
//        listList.add(Arrays.asList(2));
//        listList.add(Arrays.asList(3, 4));
//        listList.add(Arrays.asList(6, 5, 7));
//        listList.add(Arrays.asList(4, 1, 8, 3));
//        minimumTotal(listList);
//        System.out.println(new ArraySolution().pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
//        new ArraySolution().rotate(aa);
//        for (int i = 0; i < aa.length; i++) {
//            printArray(aa[i]);
//        }
//        printArray(getInstance().decompressRLElist(new int[]{3, 4, 5, 2}));
//        System.out.println(getInstance().canMakeArithmeticProgression(new int[]{3, 5, 1}));
//        System.out.println((getInstance().findNumbers(new int[]{17, 18, 5, 4, 6, 1})));
        System.out.println(getInstance().Fibonacci(3));
    }


    public static ArraySolution getInstance() {
        if (_instance == null) _instance = new ArraySolution();
        return _instance;
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


    public int Fibonacci(int n) {
        if (n == 0) return 0;
        if (n < 2) return 1;
        int an1 = 1;
        int an2 = 2;
        for (int i = 1; i < n; i++) {
            int temp = an2 + an1;
            an1 = an2;
            an2 = temp;
        }
        return an2;
    }

    public int JumpFloorII(int target) {
        return 1 << (target - 1);
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


    static public int minimumTotal(List<List<Integer>> triangle) {
        int height = triangle.size();
        for (int i = height - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                int newValue = triangle.get(i).get(j) +
                        Math.min(
                                triangle.get(i + 1).get(j),
                                triangle.get(i + 1).get(j + 1)
                        );
                triangle.get(i).set(j, newValue
                );
            }
        }
        return triangle.get(0).get(0);
    }


    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int a : nums) {
            sum += a;
        }
        int left = 0;
        for (int a = 0; a < nums.length; a++) {
            if (sum - nums[a] == left << 1) {
                return a;
            } else {
                left += nums[a];
            }
        }
        return -1;
    }


    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                matrix[i][j] ^= matrix[j][i];
                matrix[j][i] ^= matrix[i][j];
                matrix[i][j] ^= matrix[j][i];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                matrix[i][j] ^= matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] ^= matrix[i][j];
                matrix[i][j] ^= matrix[i][n - 1 - j];
            }
        }

    }


    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[] am = new boolean[m];
        boolean[] an = new boolean[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                am[i] |= (matrix[i][j] == 0);
                an[j] |= (matrix[i][j] == 0);
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (am[i] || an[j]) matrix[i][j] = 0;
            }
        }
    }


    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix.length == 0)
            return new int[0];
        int size = matrix.length * matrix[0].length;
        int index = 0;
        int[] result = new int[size];
        int maxK = matrix.length + matrix[0].length;

        for (int k = 0; k < maxK; k++) {
            int m = 0, n = 0;

            if (k % 2 == 0) { //偶数部分
                if (k < matrix.length) {
                    m = k;
                    n = 0;
                } else {
                    m = matrix.length - 1;
                    n = k - m;
                }
                while (m >= 0 && n < matrix[0].length) { //n到达边界为止
                    result[index++] = matrix[m][n];
                    m--;
                    n++;
                }
            } else {//奇数部分
                if (k < matrix[0].length) {
                    m = 0;
                    n = k;
                } else {
                    n = matrix[0].length - 1;
                    m = k - n;
                }
                while (m < matrix.length && n >= 0) { //m到达边界为止
                    result[index++] = matrix[m][n];
                    m++;
                    n--;
                }
            }
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

    public int maxProduct(int[] nums) {
        int[] a = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > a[0]) {
                if (nums[i] > a[1]) {
                    a[0] = a[1];
                    a[1] = nums[i];
                } else {
                    a[0] = nums[i];
                }
            }
        }
        return (a[0] - 1) * (a[1] - 1);
    }


    public int[] decompressRLElist(int[] nums) {
        int len = 0;
        for (int i = 0; i < nums.length; i++) {
            len += nums[i];
            i++;
        }
        int[] re = new int[len];
        int index = 0;
        for (int j = 0; j < nums.length; j++) {
            while (nums[j] > 0) {
                re[index] = nums[j + 1];
                nums[j]--;
                index++;
            }
            j++;
        }
        return re;
    }


    public boolean canMakeArithmeticProgression(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int a : arr) {
            if (a > max) {
                max = a;
            }
            if (a < min) {
                min = a;
            }
        }
        if (max == min) {
            return true;
        }
        int len = arr.length;
        boolean[] c = new boolean[len];
        if ((max - min) % (len - 1) != 0) {
            return false;
        }
        int d = (max - min) / (len - 1);
        for (int i = 0; i < len; i++) {
            int k_d = arr[i] - min;
            int k = k_d / d;
            if ((k_d % d == 0) && (k < len) && (k > -1) && !c[k]) {
                c[k] = true;
            } else {
                return false;
            }
        }
        return true;
    }


    public int[] createTargetArray(int[] nums, int[] index) {
        LinkedList<Integer> list = new LinkedList();
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }
        return list.stream().mapToInt(new ToIntFunction<Integer>() {
            @Override
            public int applyAsInt(Integer i) {
                return i;
            }
        }).toArray();

    }


    public int[] replaceElements(int[] arr) {
        int max = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = max;
            if (arr[i] > max) {
                max = arr[i];
            }
            arr[i] = temp;
        }
        return arr;
    }


    public int findNumbers(int[] nums) {
        int a = 0;
        for (int i : nums) {
            if ((i >= 10 && i < 100) || (i >= 1e3 && i < 1e4) || (i == 1e5)) {
                a++;
            }
        }
        return a;
    }


    public int[] sumZero(int n) {
        int[] result = new int[n];
        for (int i = 1; i <= (n >> 1); i++) {
            result[i - 1] = -i;
            result[i - 1 + (n >> 1)] = i;
        }

        return result;


    }


    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int sum = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (startTime[i] <= queryTime && endTime[i] >= queryTime) sum++;
        }
        return sum;
    }


    public int[][] flipAndInvertImage(int[][] A) {
        int m = A.length;
        int n = A[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < ((n + 1) >> 1); j++) {
                int temp = A[i][j] ^ 1;
                A[i][j] = A[i][n - 1 - j] ^ 1;
                A[i][n - 1 - j] = temp;
            }
        }
        return A;

    }
}