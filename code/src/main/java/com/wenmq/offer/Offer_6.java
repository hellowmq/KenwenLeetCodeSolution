package com.wenmq.offer;

import com.wenmq.algo.base.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Offer-6
 * 从尾到头打印链表
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 */
public class Offer_6 {


    /**
     * O(N) 时间
     * O(N) 空间
     * 不修改链表结构
     */
    class Solution1 implements Solution {

        @Override
        public int[] reversePrint(ListNode head) {
            Stack<Integer> stack = new Stack<>();
            ListNode p = head;
            while (p != null) {
                stack.push(p.val);
                p = p.next;
            }
            int[] result = new int[stack.size()];
            int index = 0;
            while (!stack.isEmpty()) {
                result[index] = stack.pop();
                index++;
            }
            return result;
        }
    }

    /**
     * O(N) 时间
     * O(N) 空间
     * 使用递归方法
     */
    class Solution2 implements Solution {

        @Override
        public int[] reversePrint(ListNode head) {
            if (head == null) {
                return new int[0];
            }

            List<Integer> res = new ArrayList<>();
            printListFromTailToHead(head, res);

            // 这里代码有点长，但做的事情只是把 res 转到 int[]
            int size = res.size();
            int[] resArray = new int[size];
            for (int i = 0; i < size; i++) {
                resArray[i] = res.get(i);
            }
            return resArray;
        }

        private void printListFromTailToHead(ListNode node, List<Integer> res) {
            if (node == null) {
                return;
            }

            // 如果有后继结点，就一直递归下去
            if (node.next != null) {
                printListFromTailToHead(node.next, res);
            }
            // 重点：在递归返回的时候把当前结点的值添加到结果列表中
            res.add(node.val);
        }

    }




    interface Solution {
        public int[] reversePrint(ListNode head);
    }
}
