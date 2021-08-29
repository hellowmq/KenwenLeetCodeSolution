package com.wenmq.cn.leetcode;

/**
 * <a href="https://leetcode-cn.com/problems/permutation-in-string/">
 * Q567
 * </a>
 */
public class Solution567 {
    /**
     * 1 <= s1.length, s2.length <= 10^4
     * s1 和 s2 仅包含小写字母
     * 没写出来
     */
    public boolean checkInclusion(String s1, String s2) {
        // 1 <= s1.length, s2.length <= 104
        // s1 和 s2 仅包含小写字母
        char[] arr1 = s1.toCharArray(); // 备查
        char[] arr2 = s2.toCharArray(); // 备查
        int[] dictionary = new int[26]; // s1的字典
        for (int i = 0; i < 26; i++) { // 避免左针走的太快
            dictionary[i] = -1;// 不存在的数;
        }
        int len1 = s1.length();
        for (char c1 : arr1) {
            int has = c1 - 'a';
            if (dictionary[has] == -1) {
                dictionary[has] = 1;
            } else {
                dictionary[has] += 1; // 初始化字典
            }
        }
        int l = 0; // 慢针
        int r = 0; // 快针
        int len2 = s2.length();
        boolean compare = false;
        while (r < len2) {
            int check = arr2[r] - 'a';
            if (dictionary[check] > 0) { // 有
                if (!compare) {
                    compare = true;
                    l = r;
                }
                if (r - l + 1 == len1) {
                    return true;
                }
                dictionary[check] -= 1;
                r++;
            } else if (dictionary[check] < 0) { // 没有
                if (compare) { // 中断了
                    while (l < r) { // 错了重来
                        dictionary[arr2[l] - 'a'] += 1;
                        l++;
                    }
                    compare = false;
                }
                r++;
            } else {
                while (arr2[l] != arr2[r]) {
                    dictionary[arr2[l] - 'a'] += 1;
                    l++;
                }
                l++;
                r++;
            }
        }
        return false;
    }

}
