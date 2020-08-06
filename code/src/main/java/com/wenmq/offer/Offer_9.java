package com.wenmq.offer;


import java.util.LinkedList;
import java.util.Stack;

/**
 * Offer-9
 * 用两个栈实现队列
 * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，
 * 分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
 */
public class Offer_9 {


    /**
     * 使用 Stack 作为集合
     * 按需移动
     * 由于 Stack 继承了 Vector 的特性，存在动态扩容的能力，会更加耗时
     */
    class CQueueSolution1 implements CQueue {

        Stack<Integer> list1;
        Stack<Integer> list2;

        CQueueSolution1() {
            list1 = new Stack<>();
            list2 = new Stack<>();
        }

        public void appendTail(int value) {
            if (list1.isEmpty()) {
                while (!list2.isEmpty()) {
                    list1.push(list2.pop());
                }
            }
            list1.push(value);
        }

        public int deleteHead() {
            if (list2.isEmpty()) {
                while (!list1.isEmpty()) {
                    list2.push(list1.pop());
                }
            }
            int temp = -1;
            if (!list2.isEmpty()) temp = list2.pop();
            return temp;
        }
    }

    /**
     * 使用 LinkedList 作为集合
     * 按需移动
     * 不存在动态扩容，效率更高
     */

    class CQueueSolution2 implements CQueue {

        public CQueueSolution2() {

        }

        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();


        public void appendTail(int value) {
            if (list1.isEmpty()) {
                while (!list2.isEmpty()) {
                    list1.push(list2.pop());
                }
            }
            list1.push(value);
        }

        public int deleteHead() {
            if (!list2.isEmpty()) {
                return list2.pop();
            }
            if (list2.isEmpty()) {
                while (!list1.isEmpty()) {
                    list2.push(list1.pop());
                }
            }
            if (!list2.isEmpty()) {
                return list2.pop();
            } else {
                return -1;
            }
        }
    }


    /**
     * 使用 LinkedList 作为集合
     * 明明不是按需移动，并且还是 Stack
     * 耗时竟然很短
     */

    class CQueueSolution3 implements CQueue {
        Stack<Integer> stack1;
        Stack<Integer> stack2;

        public CQueueSolution3() {
            stack1 = new Stack();
            stack2 = new Stack();
        }

        public void appendTail(int value) {

            stack1.push(value);

        }

        public int deleteHead() {
//第一次判断stack2是否为空，还有数的话直接出队
            if (!stack2.empty()) return stack2.pop();
//stack1出，stack2入
            else while (!stack1.empty()) stack2.push(stack1.pop());
            if (!stack2.empty()) return stack2.pop();
            else return -1;
        }
    }


    interface CQueue {

        public void appendTail(int value);

        public int deleteHead();
    }

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */
}
