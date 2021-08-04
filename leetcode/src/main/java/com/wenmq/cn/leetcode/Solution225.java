package com.wenmq.cn.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Q225
 * https://leetcode-cn.com/problems/implement-stack-using-queues/
 */
public class Solution225 {

    /**
     * Your MyStack object will be instantiated and called as such:
     * MyStack obj = new MyStack();
     * obj.push(x);
     * int param_2 = obj.pop();
     * int param_3 = obj.top();
     * boolean param_4 = obj.empty();
     */
    @SuppressWarnings("ConstantConditions")
    static class MyStack {

        Queue<Integer> mDataQueue;
        Queue<Integer> mTaskQueue;

        /**
         * Initialize your data structure here.
         */
        public MyStack() {
            mDataQueue = new LinkedList<>();
            mTaskQueue = new LinkedList<>();
        }

        /**
         * Push element x onto stack.
         */
        public void push(int x) {
            mTaskQueue.offer(x);
            while (!mDataQueue.isEmpty()) {
                mTaskQueue.offer(mDataQueue.poll());
            }
            Queue<Integer> temp = mTaskQueue;
            mTaskQueue = mDataQueue;
            mDataQueue = temp;
        }

        /**
         * Removes the element on top of the stack and returns that element.
         */
        @SuppressWarnings("ConstantConditions")
        public int pop() {
            return mDataQueue.poll();
        }

        /**
         * Get the top element.
         */
        public int top() {
            return mDataQueue.peek();
        }

        /**
         * Returns whether the stack is empty.
         */
        public boolean empty() {
            return mDataQueue.isEmpty();
        }
    }

}
