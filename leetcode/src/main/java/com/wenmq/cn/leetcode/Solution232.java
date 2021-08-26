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
    @SuppressWarnings("@Override")
    static class MyQueue extends MyAbstractQueue {
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

    @SuppressWarnings("@Override")
    static class MyQueue2 extends MyAbstractQueue {

        private final Stack<Integer> s1 = new Stack<>();
        private final Stack<Integer> s2 = new Stack<>();

        /**
         * Initialize your data structure here.
         */
        public MyQueue2() {
        }

        /**
         * Push element x to the back of queue.
         */
        public void push(int x) {
            s1.push(x);
        }

        /**
         * Removes the element from in front of queue and returns that element.
         */
        public int pop() {
            peek();
            return s2.pop();
        }

        /**
         * Get the front element.
         */
        public int peek() {
            if (s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }
            return s2.peek();
        }

        /**
         * Returns whether the queue is empty.
         */
        public boolean empty() {
            return s1.isEmpty() && s2.isEmpty();
        }

    }


    abstract static class MyAbstractQueue {

        /**
         * 添加元素到队尾
         */
        public abstract void push(int x);

        /**
         * 删除队头的元素并返回
         */
        public abstract int pop();

        /**
         * 返回队头元素
         */
        public abstract int peek();

        /**
         * 判断队列是否为空
         */
        public abstract boolean empty();
    }
}
