package com.wenmq.algo.search;

public class SearchSolution {

    public static void main(String[] args) {

        int[] res = new int[]{1, 3, 5, 6};
        System.out.println(new SearchSolution().searchInsert(res, 7));
    }


    public int searchInsert(int[] nums, int target) {
        int top = nums.length - 1, mid, bot = 0;
        while (bot <= top) {
            mid = bot + ((top - bot) >> 1);
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                bot = mid + 1;
            } else {
                top = mid - 1;
            }
        }
        return bot;

    }
}
