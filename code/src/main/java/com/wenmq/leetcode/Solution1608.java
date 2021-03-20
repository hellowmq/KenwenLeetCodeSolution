package com.wenmq.leetcode;

import com.wenmq.tools.ArrayTools;

import java.util.Arrays;

/**
 * Q1608
 * https://leetcode-cn.com/problems/special-array-with-x-elements-greater-than-or-equal-x/
 */
public class Solution1608 {
    /**
     * 当我们看到方法二的时候，应该反思为什么我们在写出类似于方法一的解法时
     * 很自然写出 Arrays.sort(nums);
     * 思考一下：当我们使用排序时，我们追求的目的到底是什么？
     * 对于一个解空间在有限的开销可用的场景，使用排序后的数组能带来哪些好处。
     * 在这个问题中，我们显然并非用到是数组中的相对次序而是数组中的数值分布
     *
     * 值得一提的是，这种先排序的想法往往是 LeetCode 题解中最常见的解法
     * 自然是思考最容易的做法，在解题的思考路径上，我们常见的思路是：
     * 1. 没有点头绪，不妨排个序
     * 2. 发现到排序之后更容易执行下边的运算
     * 3. 确定排序是一种可行解
     *
     * 这就是我们思考的"归约化简"
     * 这种思考的危险所在就是一旦我们归约到一个已知的问题，同样可能会增加运算的复杂度
     * 作为开发者当然是要百般警惕，平时思考问题也当如此。
     * 白虹贯日、有凤来仪都是固定招式，但是一旦每招每式都要方寸不差
     * 招式之间就开始内耗，自然每招每式都流露出不和谐
     */
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int target = Math.min(nums.length, nums[nums.length - 1]);
        int count = 0;
        int cur = nums.length - 1;
        while (cur >= 0 && count <= target) {
            if (nums[cur] >= target) {
                cur--;
                count++;
            } else if (target != count) {
                target--;
            } else {
                return target;
            }
        }
        if (cur < 0 && target == count) {
            return target;
        }
        return -1;
    }

    /**
     * 算法的精要在于压缩解的空间
     */
    public int specialArray2(int[] nums) {
        int n = nums.length;
        int[] cnt = new int[n + 1];
        for (int num : nums) {
            cnt[Math.min(num, n)]++;
        }
        ArrayTools.printArray(cnt);
        for (int i = n; i >= 0; i--) {
            if (i < n) {
                cnt[i] += cnt[i + 1];
            }
            if (cnt[i] == i) {
                return i;
            }
        }
        return -1;
    }

}
