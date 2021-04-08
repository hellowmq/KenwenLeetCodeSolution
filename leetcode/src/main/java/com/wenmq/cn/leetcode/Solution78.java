package com.wenmq.cn.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Q78
 * https://leetcode-cn.com/problems/subsets/
 */
public class Solution78 {
    List<Integer> mIntegerArrayList = new ArrayList<>();
    List<List<Integer>> mLists = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        dfs(0, nums);
        return mLists;
    }

    public void dfs(int cur, int[] nums) {
        if (cur == nums.length) {
            mLists.add(new ArrayList<>(mIntegerArrayList));
            return;
        }
        mIntegerArrayList.add(nums[cur]);
        dfs(cur + 1, nums);
        mIntegerArrayList.remove(mIntegerArrayList.size() - 1);
        dfs(cur + 1, nums);
    }


    List<Integer> t = new ArrayList<>();
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> subsets2(int[] nums) {
        int n = nums.length;
        for (int mask = 0; mask < (1 << n); mask++) {
            t.clear();
            for (int i = 0; i < n; ++i) {
                if ((mask & (1 << i)) != 0) {
                    t.add(nums[i]);
                }
            }
            ans.add(new ArrayList<>(t));
        }
        return ans;
    }


}
