package com.wenmq.algo.linklist;

import com.wenmq.algo.base.ListNode;

/**
 * @author ifans.wen
 * @date 2020/7/3
 * @description
 */
public class ListNodeHelper {
    public static void printAll(ListNode list) {
        if (list == null) {
            System.out.print("null");
        }
        ListNode p = list;
        int i = 30;
        while (p != null && i > 0) {
            i--;
            System.out.print(p.val + " ");
            p = p.next;
        }
        System.out.println();
    }
}
