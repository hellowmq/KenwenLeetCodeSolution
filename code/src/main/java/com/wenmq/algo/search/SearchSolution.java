package com.wenmq.algo.search;

import java.util.HashMap;

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

    public int getFirst(String str) {
        if (str == null || str.length() == 0) return -1;
        HashMap<Character, Integer> map = new HashMap(128);
        for (int i = 0; i < str.length(); i++) {
            Character cha = str.charAt(i);
            if (map.containsKey(cha)) {
                map.put(cha, map.get(cha) + 1);
            } else {
                map.put(cha, 1);
            }
        }
        for (int i = 0; i < str.length(); i++) {
            Character cha = str.charAt(i);
            if (map.get(cha) == 1) {
                return i;
            }

        }
        return -1;
    }
}
