package com.wenmq.leetcode;

import com.wenmq.algo.base.ListNode;
import com.wenmq.tools.ListNodeTools;

/**
 * Q147
 * https://leetcode-cn.com/problems/insertion-sort-list/
 */
public class Solution147 {
    /**
     * 从头结点向后遍历，如果逆序，从头结点向后遍历至插入点
     * 单次安全插入
     * 1. 持有待插入结点
     * 2. 删除待插入结点在链中的位置
     * 2.1 cur.next = cur.next.next;
     * 3. 待插入位置插入结点
     * 3.1 temp.next = insert.next
     * 3.2 insert.next = temp
     * 断开结点，从插入点接入。
     *
     * @param head 头结点
     * @return 返回处理后的链表头结点
     */
    public ListNode insertionSortList(ListNode head) {
        ListNode cur = head;
        ListNode dummy = new ListNode(0);
        ListNode pre;
        dummy.next = cur;
        while (cur != null && cur.next != null) {
            if (cur.val <= cur.next.val) {
                cur = cur.next;
                continue;
            }
            pre = dummy;
            while (pre.next.val < cur.next.val) {
                pre = pre.next;
            }
            ListNode temp = cur.next;
            cur.next = temp.next;
            temp.next = pre.next;
            pre.next = temp;
        }
        return dummy.next;
    }

}
