package com.wenmq.cn.leetcode;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.wenmq.cn.leetcode.Solution160.ListNode;

public class Solution160UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution160";
    private Solution160 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution160();
    }

    /**
     * intersectVal = 8, listA = [4,1,8,4,5], listB = [5,0,1,8,4,5], skipA = 2, skipB = 3
     */
    @Test
    public void testGetIntersectionNode_Case1() {
        ListNode commonLink = generateList(new int[]{8, 4, 5});
        ListNode listA = generateList(new int[]{4, 1});
        connectListNode(listA, commonLink);
        ListNode listB = generateList(new int[]{5, 0, 1});
        connectListNode(listB, commonLink);

        ListNode actual = mTestSolution.getIntersectionNode(listA, listB);
        Assert.assertEquals(commonLink, actual);
    }

    /**
     * intersectVal = 2, listA = [0,9,1,2,4], listB = [3,2,4], skipA = 3, skipB = 1
     */
    @Test
    public void testGetIntersectionNode_Case2() {
        ListNode commonLink = generateList(new int[]{2, 4});
        ListNode listA = generateList(new int[]{0, 9, 1});
        connectListNode(listA, commonLink);
        ListNode listB = generateList(new int[]{3});
        connectListNode(listB, commonLink);


        ListNode actual = mTestSolution.getIntersectionNode(listA, listB);
        Assert.assertEquals(commonLink, actual);
    }

    /**
     * intersectVal = 0, listA = [2,6,4], listB = [1,5], skipA = 3, skipB = 2
     */
    @SuppressWarnings("ConstantConditions")
    @Test
    public void testGetIntersectionNode_Case3() {
        final ListNode commonLink = null;
        ListNode listA = generateList(new int[]{0, 9, 1});
        connectListNode(listA, commonLink);
        ListNode listB = generateList(new int[]{3});
        connectListNode(listB, commonLink);

        ListNode actual = mTestSolution.getIntersectionNode(listA, listB);
        Assert.assertEquals(commonLink, actual);
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

}