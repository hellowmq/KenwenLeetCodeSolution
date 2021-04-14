package com.wenmq.cn.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Q1656
 * https://leetcode-cn.com/problems/design-an-ordered-stream/
 */
public class Solution1656 {
    /**
     * Your OrderedStream object will be instantiated and called as such:
     */
    static class OrderedStream {

        private final String[] mStrings;
        private final int mSize;
        private int ptr = 1;

        public OrderedStream(int n) {
            this.mSize = n;
            this.mStrings = new String[n + 1];
        }

        public List<String> insert(int id, String value) {
            mStrings[id] = value;
            List<String> res = new ArrayList<>();
            while (ptr <= mSize && mStrings[ptr] != null) {
                res.add(mStrings[ptr]);
                ptr++;
            }
            return res;
        }
    }

}
