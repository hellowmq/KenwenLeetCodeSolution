package com.wenmq.leetcode;

/**
 * Q
 * https://leetcode-cn.com/problems/all/
 */
public class Solution153 {
    /**
     * 二分查找
     * 查看逆序的位置
     * 有侧有序则抛弃右侧一半的搜索空间
     * 左侧有序则抛弃左侧一半的搜索空间
     * high = mid 和 low = mid + 1 这里是为了获取最小值而用
     */
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int mid = (low + high) >>> 1;
            if (nums[mid] < nums[high]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return nums[low];
    }


}
