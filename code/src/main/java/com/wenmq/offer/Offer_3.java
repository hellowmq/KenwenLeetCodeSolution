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
 * !!! 这里已经确定必然存在重复值
 */
public class Offer_3 {

    /**
     * 使用集合的唯一性
     * O(n) 时间
     * O(n) 空间
     * - 不修改原数组，时间最小化
     */
    static class Solution1 {
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
    static class Solution2 {
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
    static class Solution3 {
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
     *
     */
    static class Solution4 {
        public int findRepeatNumber(int[] nums){
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

    /**
     *
     * 限制修改原数组并且限制 O(1) 空间的解法
     * 快慢指针
     * 时间 O(n) Floyd 判圈算法
     * 空间 O(1)
     * 目前看来算是不错的解法
     */
    static class Solution5{
        public int findDuplicate(int[] nums) {
            if(nums.length <= 2){
                return nums[0];
            }
            //第一步找到相遇点
            //慢指针走一步nums[i];
            //快指针走两步nums[nums[j]]
            int i = 0,j = 0;
            while(true){
                i = nums[i];
                j = nums[nums[j]];
                if(i == j)  { break;}
            }
            //慢指针归位
            i = 0;
            //快指针调整步调
            while(true){
                i = nums[i];
                j = nums[j];
                if(i == j) break;
            }
            return i;
        }
    }

}
