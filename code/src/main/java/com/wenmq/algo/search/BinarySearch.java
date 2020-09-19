package com.wenmq.algo.search;

/**
 * Created by  @ifans.wen
 *
 * @date 2020/8/31.
 */
public class BinarySearch {


    /**
     * @see #check we use this to check
     * @return
     */
    public int binary(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (check(nums, mid, target)) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return right;
    }

    private boolean check(int[] nums, int mid, int mid1) {
        return true;
    }
}
