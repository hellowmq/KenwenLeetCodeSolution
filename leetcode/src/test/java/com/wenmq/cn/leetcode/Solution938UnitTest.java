package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.wenmq.cn.leetcode.Solution938.TreeNode;

public class Solution938UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution938";

    private Solution938 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution938();
    }

    @Test
    public void testRangeSumBST_Case1() {
        Integer[] root = {
                10, 5, 15, 3, 7, null, 18
        };
        int low = 7;
        int high = 15;
        TreeNode treeNode = buildTreeNode(root);

        int expected = 32;
        Assert.assertEquals(expected, mTestSolution.rangeSumBST(treeNode, low, high));
        Assert.assertEquals(expected, mTestSolution.rangeSumBST2(treeNode, low, high));
    }

    @Test
    public void testRangeSumBST_Case2() {
        Integer[] root = {
                10, 5, 15, 3, 7, 13, 18, 1, null, 6
        };
        int low = 6;
        int high = 10;
        TreeNode treeNode = buildTreeNode(root);

        int expected = 23;
        Assert.assertEquals(expected, mTestSolution.rangeSumBST(treeNode, low, high));
        Assert.assertEquals(expected, mTestSolution.rangeSumBST2(treeNode, low, high));
    }

    private TreeNode buildTreeNode(Integer[] list) {
        return buildTreeNode(list, 0);
    }

    private TreeNode buildTreeNode(Integer[] list, int head) {
        if (head >= list.length || list[head] == null) {
            return null;
        }
        TreeNode node = new TreeNode(list[head]);
        node.left = buildTreeNode(list, head * 2 + 1);
        node.right = buildTreeNode(list, head * 2 + 2);
        return node;
    }
}