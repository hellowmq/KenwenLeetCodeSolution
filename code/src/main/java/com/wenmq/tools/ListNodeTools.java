package com.wenmq.tools;

import com.wenmq.algo.base.ListNode;

public class ListNodeTools {

    public static final int COUNTER_MAX = 1000;

    static public void printListNode(ListNode listNode) {
        printListNode(listNode, COUNTER_MAX);
    }

    static public void printListNode(ListNode listNode, int cycleDetect) {
        System.out.println(getListNodeString(listNode, cycleDetect));
    }

    public static String getListNodeString(ListNode listNode) {
        return getListNodeString(listNode, COUNTER_MAX);
    }


    public static String getListNodeString(ListNode listNode, int cycleDetect) {
        StringBuilder sb = new StringBuilder();
        int counter = cycleDetect;
        while (listNode != null && counter > 0) {
            sb.append(listNode.val);
            sb.append("->");
            listNode = listNode.next;
            counter--;
        }
        sb.append("null");
        return sb.toString();
    }

    public static int[] toArray(ListNode node) {
        ListNode iNode = node;
        int length = 0;
        while (iNode != null) {
            length++;
            iNode = iNode.next;
        }
        //
        int[] array = new int[length];
        ListNode indexNode = node;
        int index = 0;
        while (indexNode != null) {
            array[index] = indexNode.val;
            index++;
            indexNode = indexNode.next;
        }
        return array;
    }
}
