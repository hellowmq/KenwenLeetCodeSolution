package com.wenmq.cn.leetcode;

import com.wenmq.cn.leetcode.Solution226.TreeNode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution226UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution226";
    private Solution226 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution226();
    }

    @Test
    public void testInvertTree_Case() {
        Integer[] list = new Integer[]{
                4, 2, 7, 1, 3, 6, 9
        };
        TreeNode root = buildTreeNode(list);
        Integer[] expected = new Integer[]{
                4, 7, 2, 9, 6, 3, 1
        };
        TreeNode expectedTree = buildTreeNode(expected);

        Assert.assertEquals(root, mTestSolution.invertTree(root));
        assertTreeNode(expectedTree, root);
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

    private boolean assertTreeNode(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null) {
            return false;
        }
        if (node1.val != node2.val) {
            return false;
        }
        return assertTreeNode(node1.left, node2.left)
                && assertTreeNode(node2.right, node2.right);
    }
}