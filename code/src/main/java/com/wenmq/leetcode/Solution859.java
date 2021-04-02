package com.wenmq.leetcode;

/**
 * Q859
 * https://leetcode-cn.com/problems/buddy-strings/
 */
public class Solution859 {
    /**
     * a != null && b != null
     */
    public boolean buddyStrings2(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        int[] map = new int[26];
        int index = -1;
        int diffCount = 0;
        for (int i = 0; i < a.length(); i++) {
            map[a.charAt(i) - 'a']++;
            if (a.charAt(i) != b.charAt(i)) {
                // 存在第三个不同点，返回 false
                if (diffCount == 2) {
                    return false;
                }
                if (index >= 0) {
                    // 和第一个不同点是否可交换，不可交换返回 false
                    if (a.charAt(i) != b.charAt(index) || a.charAt(index) != b.charAt(i)) {
                        return false;
                    }
                }
                index = i;
                diffCount++;
            }
        }
        // 正好存在两个不同点，并且可交换，返回 true
        if (diffCount == 2) {
            return true;
        }
        // 只存在一个不同点，返回 false
        if (index >= 0) {
            return false;
        }
        for (int value : map) {
            if (value > 1) {
                return true;
            }
        }
        return false;


    }

    /**
     * buddyStrings
     */
    public boolean buddyStrings(String a, String b) {
        int aLength = a.length();
        int bLength = b.length();

        if (aLength < 2 || aLength != bLength) {
            return false;
        }

        if (a.equals(b)) {
            if (aLength > 26) {
                // 容斥原理，必然重复
                return true;
            }
            int[] sum = new int[26];
            for (int i = 0; i < aLength; i++) {
                int num = ++sum[a.charAt(i) - 'a'];
                if (num == 2) {
                    return true;
                }
            }
            return false;
        }

        char[] aArr = a.toCharArray();
        char[] bArr = b.toCharArray();
        int count = 0;
        int j = 0;
        for (int i = 0; i < aLength; i++) {
            if (aArr[i] != bArr[i]) {
                count++;
                if (count > 2) {
                    return false;
                }
                if (count == 2) {
                    if (aArr[j] != bArr[i] || aArr[i] != bArr[j]) {
                        return false;
                    }
                }
                j = i;
            }
        }
        return count != 1;
    }


}
