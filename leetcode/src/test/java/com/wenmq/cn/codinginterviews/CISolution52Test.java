package com.wenmq.cn.codinginterviews;

import com.wenmq.cn.codinginterviews.CISolution52.ListNode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CISolution52Test {

    private CISolution52 mTestSolution;

    @Before
    public void setUp() {
        mTestSolution = new CISolution52();
    }

    @Test
    public void testGetIntersectionNode_Case1() {
        int intersectVal = 8;
        ListNode commonLink = generateList(new int[]{8, 4, 5});
        ListNode listA = generateList(new int[]{4, 1,});
        connectListNode(listA, commonLink);
        ListNode listB = generateList(new int[]{5, 0, 1,});
        connectListNode(listB, commonLink);

        int skipA = 2;
        int skipB = 3;

        ListNode result = mTestSolution.getIntersectionNode(listA, listB);

        Assert.assertEquals(intersectVal, result.val);
        Assert.assertEquals(getNextNumNode(listA, skipA), result);
        Assert.assertEquals(getNextNumNode(listB, skipB), result);
    }


    @Test
    public void testGetIntersectionNode_Case2() {
        int intersectVal = 2;
        ListNode commonLink = generateList(new int[]{2, 4});
        ListNode listA = generateList(new int[]{0, 9, 1,});
        connectListNode(listA, commonLink);
        ListNode listB = generateList(new int[]{3,});
        connectListNode(listB, commonLink);

        int skipA = 3;
        int skipB = 1;

        ListNode result = mTestSolution.getIntersectionNode(listA, listB);

        Assert.assertEquals(intersectVal, result.val);
        Assert.assertEquals(getNextNumNode(listA, skipA), result);
        Assert.assertEquals(getNextNumNode(listB, skipB), result);
    }

    @Test
    public void testGetIntersectionNode_Case3() {
        ListNode commonLink = generateList(new int[]{});
        ListNode listA = generateList(new int[]{2, 6, 4,});
        connectListNode(listA, commonLink);
        ListNode listB = generateList(new int[]{1, 5,});
        connectListNode(listB, commonLink);

        ListNode result = mTestSolution.getIntersectionNode(listA, listB);

        Assert.assertNull(result);
    }

    @Test
    public void testGetIntersectionNode_Case4() {
        ListNode commonLink = generateList(new int[]{});
        ListNode listA = generateList(new int[]{1,});
        connectListNode(listA, commonLink);
        ListNode listB = generateList(new int[]{});
        connectListNode(listB, commonLink);

        ListNode result = mTestSolution.getIntersectionNode(listA, listB);

        Assert.assertNull(result);
    }


    public ListNode generateList(int[] list) {
        if (list == null || list.length == 0) {
            return null;
        }
        ListNode head = new ListNode(list[0]);
        ListNode node = head;
        for (int i = 1; i < list.length; i++) {
            node.next = new ListNode(list[i]);
            node = node.next;
        }
        return head;
    }

    public void connectListNode(ListNode head, ListNode tail) {
        if (head == null || tail == null) {
            return;
        }
        ListNode listNode = head;
        int cycleLimit = 0;
        while (listNode.next != null) {
            listNode = listNode.next;
            cycleLimit++;
            if (cycleLimit > 1000) {
                throw new Error("connectListNode");
            }
        }
        listNode.next = tail;
    }

    public ListNode getNextNumNode(ListNode node, int number) {
        if (number < 0) {
            throw new IllegalArgumentException();
        }
        ListNode newNode = node;
        while (number-- > 0) {
            newNode = newNode.next;
        }
        return newNode;
    }

}