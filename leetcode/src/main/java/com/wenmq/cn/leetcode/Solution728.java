package com.wenmq.cn.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Q728
 * https://leetcode-cn.com/problems/self-dividing-numbers/
 */
public class Solution728 {
    /**
     * 每个输入参数的边界满足 1 <= left <= right <= 10000
     */
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for (int n = left; n <= right; ++n) {
            if (selfDividing(n)) {
                ans.add(n);
            }
        }
        return ans;
    }

    public boolean selfDividing(int n) {
        int x = n;
        while (x > 0) {
            int d = x % 10;
            x /= 10;
            if (d == 0 || (n % d) > 0) {
                return false;
            }
        }
        return true;
    }

}
