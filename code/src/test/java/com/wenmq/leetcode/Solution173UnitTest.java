package com.wenmq.leetcode;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.wenmq.leetcode.Solution173.BSTIterator;
import static com.wenmq.leetcode.Solution173.TreeNode;

public class Solution173UnitTest {

    private static final String TAG = "com.wenmq.leetcode.Solution173";

    private Solution173 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution173();
    }

    @Test
    public void testBSTIterator() {
        String[] instructions = new String[]{
                "BSTIterator", "next", "next", "hasNext", "next",
                "hasNext", "next", "hasNext", "next", "hasNext"
        };
        Integer[] list = {7, 3, 15, null, null, 9, 20};
        TreeNode head;
        BSTIterator iterator = null;
        Object[] expected = {null, 3, 7, true, 9, true, 15, true, 20, false};
        for (int i = 0; i < instructions.length; i++) {
            String command = instructions[i];
            switch (command) {
                case "BSTIterator":
                    head = buildTreeNode(list);
                    iterator = new BSTIterator(head);
                    break;
                case "next":
                    Assert.assertEquals(expected[i], iterator.next());
                    break;
                case "hasNext":
                    Assert.assertEquals(expected[i], iterator.hasNext());
                    break;
                default:
                    //ignore
            }
        }


    }

    private TreeNode buildTreeNode(Integer[] list) {
        return buildTreeNode(list, 0);
    }

    private TreeNode buildTreeNode(Integer[] list, int head) {
        if (head >= list.length || list[head] == null) {
            return null;
        }
        return new TreeNode(
                list[head],
                buildTreeNode(list, head * 2 + 1),
                buildTreeNode(list, head * 2 + 2)
        );
    }


}