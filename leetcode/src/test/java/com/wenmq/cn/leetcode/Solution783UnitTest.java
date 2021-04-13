package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.wenmq.cn.leetcode.Solution783.TreeNode;

public class Solution783UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution783";

    private Solution783 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution783();
    }

    @Test
    public void testMinDiffInBST_Case1() {
        Integer[] treeList = new Integer[]{
                4, 2, 6, 1, 3
        };
        TreeNode root = buildTreeNode(treeList);
        int expected = 1;
        Assert.assertEquals(expected, mTestSolution.minDiffInBST(root));
    }

    @Test
    public void testMinDiffInBST_Case2() {
        Integer[] treeList = new Integer[]{
                1, 0, 48, null, null, 12, 49
        };
        TreeNode root = buildTreeNode(treeList);
        int expected = 1;
        Assert.assertEquals(expected, mTestSolution.minDiffInBST(root));
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