package com.wenmq.cn.leetcode;

import java.util.Stack;

/**
 * Q232
 * https://leetcode-cn.com/problems/implement-queue-using-stacks/
 */
public class Solution232 {

    /**
     * Your MyQueue object will be instantiated and called as such:
     * MyQueue obj = new MyQueue();
     * obj.push(x);
     * int param_2 = obj.pop();
     * int param_3 = obj.peek();
     * boolean param_4 = obj.empty();
     */
    static class MyQueue {
        Stack<Integer> list1 = new Stack<>();
        Stack<Integer> list2 = new Stack<>();

        /**
         * Initialize your data structure here.
         */
        public MyQueue() {

        }

        /**
         * Push element x to the back of queue.
         */
        public void push(int x) {
            if (list1.isEmpty()) {
                while (!list2.isEmpty()) {
                    list1.push(list2.pop());
                }
            }
            list1.push(x);

        }

        /**
         * Removes the element from in front of queue and returns that element.
         */
        public int pop() {
            if (list2.isEmpty()) {
                while (!list1.isEmpty()) {
                    list2.push(list1.pop());
                }
            }
            int temp = -1;
            if (!list2.isEmpty()) {
                temp = list2.pop();
            }
            return temp;
        }

        /**
         * Get the front element.
         */
        public int peek() {
            if (list2.isEmpty()) {
                while (!list1.isEmpty()) {
                    list2.push(list1.pop());
                }
            }
            return list2.peek();
        }

        /**
         * Returns whether the queue is empty.
         */
        public boolean empty() {
            return list1.isEmpty() && list2.isEmpty();
        }

    }


}
