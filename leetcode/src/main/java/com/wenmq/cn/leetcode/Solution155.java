package com.wenmq.cn.leetcode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Q155
 * https://leetcode-cn.com/problemset/all/
 */
public class Solution155 {

    /**
     * Your MinStack object will be instantiated and called as such:
     * MinStack obj = new MinStack();
     * obj.push(val);
     * obj.pop();
     * int param_3 = obj.top();
     * int param_4 = obj.getMin();
     */
    static class MinStack {
        Deque<Integer> mDataDeque;
        Deque<Integer> mMinDeque;

        /**
         * initialize your data structure here.
         */
        public MinStack() {
            mDataDeque = new LinkedList<>();
            mMinDeque = new LinkedList<>();
        }

        public void push(int val) {
            mDataDeque.push(val);
            if (mMinDeque.isEmpty()) {
                mMinDeque.push(val);
            } else {
                mMinDeque.push(Math.min(mMinDeque.peek(), val));
            }
        }

        public void pop() {
            mDataDeque.pop();
            mMinDeque.pop();
        }

        @SuppressWarnings("ConstantConditions")
        public int top() {
            return mDataDeque.peek();
        }

        @SuppressWarnings("ConstantConditions")
        public int getMin() {
            return mMinDeque.peek();
        }
    }

}
