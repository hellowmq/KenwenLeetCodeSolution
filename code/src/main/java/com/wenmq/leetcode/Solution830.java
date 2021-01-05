package com.wenmq.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Q830
 * https://leetcode-cn.com/problems/positions-of-large-groups/
 */
public class Solution830 {
    /**
     * 没时间自己做，这个是 CV 提交里耗时最短的
     */
    public List<List<Integer>> largeGroupPositions(String s) {
        int start = 0;
        List<List<Integer>> result = new ArrayList();
        for (int end = 1; end < s.length(); end++) {
            if (s.charAt(end) != s.charAt(start)) {
                if (end - start >= 3) {
                    result.add(Arrays.asList(start, end - 1));
                }
                start = end;
            }
        }
        if (s.length() - start >= 3) {
            result.add(Arrays.asList(start, s.length() - 1));
        }
        return result;
    }

}
