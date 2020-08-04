package com.wenmq.offer;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Offer-3
 * 找出数组中重复的数字
 * 在一个长度为n的数组中，所有数字都在 0 ~ n-1 的范围内。
 * 数组中某些数字是重复的，但是不知道几个数字重复了，也不知道数字重复了几次。
 * 请找出数组中任意一个重复的数字。
 * 例如：一个长度为7的数组{2,3,1,0,2,5,3}，数组中重复的数字是2和3。
 */
public class Offer_3_1 {

    public static void main(String[] args) {
        int[] nums = new int[]{0, 2, 1, 3, 4, 6, 6, 5, 3};
        Solution solution1 = new Solution1();
        int so1 = solution1.findRepeatNumber(nums);
        System.out.println(so1);
    }

    /**
     * 使用集合的唯一性
     * O(n) 时间
     * O(n) 空间
     * - 不修改原数组，时间最小化
     */
    static class Solution1 implements Solution {
        @Override
        public int findRepeatNumber(int[] nums) {
            Set<Integer> set = new HashSet<>();
            int repeat = -1;
            for (int num : nums) {
                if (!set.add(num)) {
                    repeat = num;
                    break;
                }
            }
            return repeat;
        }
    }

    /**
     * 原地置换
     * O(n) 时间
     * O(1) 空间
     * 每次交换至少减少一次 for 循环，时间复杂度为 O(n)
     * - 修改了原数组，时间空间最小化
     */
    static class Solution2 implements Solution {
        @Override
        public int findRepeatNumber(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                while (i != nums[i]) {
                    if (nums[i] == nums[nums[i]]) {
                        return nums[i];
                    }
                    int temp = nums[i];
                    nums[i] = nums[temp];
                    nums[temp] = temp;
                }
            }
            return -1;
        }
    }

    /**
     * 使用原数组的符号位作为拓展空间
     * O(n) 时间
     * O(1) 空间
     * - 修改了原数组，时间空间最小化
     */
    static class Solution3 implements Solution {
        @Override
        public int findRepeatNumber(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                int m = Math.abs(nums[i]);
                if (nums[m] < 0) {
                    return m;
                } else {
                    nums[m] = nums[m] * -1;
                }
            }
            return -1;
        }
    }

    /**
     * 限制修改原数组并且限制 O(1) 空间的解法
     * 二分查找，值域有限区间，对值域二分
     * 时间 O(nlogn)
     * 空间 O(1)
     * - 不修改原数组，空间最小化，耗时显著提升
     * - 要求重复必然存在
     */
    static class Solution4 implements Solution {
        @Override
        public int findRepeatNumber(int[] nums) {
            // 该方法需要数字一定有重复的才行，
            // 因此如果题目修改在长度为n，数字在1到n-1的情况下，此时数组中至少有一个数字是重复的，该方法可以通过。
            int n = nums.length;
            int left = 1;
            int right = n - 1;
            while (left < right) {
                int mid = left + (right - left) / 2;
                int cnt = 0;
                for (int i = 0; i < n; i++) {
                    if (nums[i] <= mid) {
                        cnt++;
                    }
                }
                // 从1到mid最多有mid个元素，超过它说明有重复元素
                if (cnt > mid) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
            return left;
        }

    }

    interface Solution {
        int findRepeatNumber(int[] nums);
    }
}
