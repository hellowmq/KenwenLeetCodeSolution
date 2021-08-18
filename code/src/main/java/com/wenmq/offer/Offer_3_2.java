package com.wenmq.offer;

/**
 * Offer-3
 * 找出数组中重复的数字
 * 给定一个包含 n + 1 个整数的数组 nums，其数字都在 1 到 n 之间（包括 1 和 n），可知至少存在一个重复的整数。
 * 假设只有一个重复的整数，找出这个重复的数。
 * <p>
 * - 不能更改原数组（假设数组是只读的）。
 * - 只能使用额外的 O(1) 的空间。
 * - 时间复杂度小于 O(n2) 。
 * - 数组中只有一个重复的数字，但它可能不止重复出现一次。
 *
 * !!! 这道题特别的地方在于定义域略大于值域，因此有了双指针解法。
 */
public class Offer_3_2 {

    public static void main(String[] args) {
        int[] nums = new int[]{0, 2, 1, 3, 4, 6, 6, 5, 3};
        Solution solution5 = new Solution1();
        int so5 = solution5.findDuplicate(nums);
        System.out.println(so5);
    }

    /**
     * 限制修改原数组并且限制 O(1) 空间的解法
     * 快慢指针
     * 时间 O(n) Floyd 判圈算法
     * 空间 O(1)
     * 目前看来算是不错的解法
     * !!! 这道题特别的地方在于定义域略大于值域，因此有了双指针解法。
     */
    static class Solution1 implements Solution {
        @Override
        public int findDuplicate(int[] nums) {
            if (nums.length <= 2) {
                return nums[0];
            }
            int i = 0, j = 0;
            while (true) {
                i = nums[i];
                j = nums[nums[j]];
                if (i == j) {
                    break;
                }
            }
            //慢指针归位
            i = 0;
            //快指针调整步调
            while (true) {
                i = nums[i];
                j = nums[j];
                if (i == j) break;
            }
            return i;
        }
    }


    /**
     * 限制修改原数组并且限制 O(1) 空间的解法
     * 二分查找，值域有限区间，对值域二分
     * 时间 O(nlogn)
     * 空间 O(1)
     *
     */
    static public class Solution2 implements Solution {

        @Override
        public int findDuplicate(int[] nums) {
            int len = nums.length;
            int left = 1;
            int right = len - 1;
            while (left < right) {
                // 在 Java 里可以这么用，当 left + right 溢出的时候，无符号右移保证结果依然正确
                int mid = (left + right) >>> 1;

                int cnt = 0;
                for (int num : nums) {
                    if (num <= mid) {
                        cnt += 1;
                    }
                }

                // 根据抽屉原理，小于等于 4 的个数如果严格大于 4 个
                // 此时重复元素一定出现在 [1, 4] 区间里
                if (cnt > mid) {
                    // 重复元素位于区间 [left, mid]
                    right = mid;
                } else {
                    // if 分析正确了以后，else 搜索的区间就是 if 的反面
                    // [mid + 1, right]
                    left = mid + 1;
                }
            }
            return left;
        }
    }

    interface Solution {
        int findDuplicate(int[] nums);
    }
}
