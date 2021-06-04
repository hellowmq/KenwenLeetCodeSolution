package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.wenmq.cn.leetcode.Solution872.TreeNode;

public class Solution872UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution872";

    private Solution872 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution872();
    }

    @Test
    public void testLeafSimilar_Case1() {
        Integer[] root1 = {
                3, 5, 1, 6, 2, 9, 8, null, null, 7, 4
        };
        Integer[] root2 = {
                3, 5, 1, 6, 7, 4, 2, null, null, null, null, null, null, 9, 8
        };
        TreeNode treeNode1 = buildTreeNode(root1);
        TreeNode treeNode2 = buildTreeNode(root2);
        final boolean expected = true;
        assertMoreSolution(treeNode1, treeNode2, expected);
    }

    @Test
    public void testLeafSimilar_Case2() {
        Integer[] root1 = {
                1
        };
        Integer[] root2 = {
                1
        };
        TreeNode treeNode1 = buildTreeNode(root1);
        TreeNode treeNode2 = buildTreeNode(root2);
        final boolean expected = true;
        assertMoreSolution(treeNode1, treeNode2, expected);
    }

    @Test
    public void testLeafSimilar_Case3() {
        Integer[] root1 = {
                1
        };
        Integer[] root2 = {
                2
        };
        TreeNode treeNode1 = buildTreeNode(root1);
        TreeNode treeNode2 = buildTreeNode(root2);
        final boolean expected = false;
        assertMoreSolution(treeNode1, treeNode2, expected);
    }

    @Test
    public void testLeafSimilar_Case4() {
        Integer[] root1 = {
                1, 2
        };
        Integer[] root2 = {
                2, 2,
        };
        TreeNode treeNode1 = buildTreeNode(root1);
        TreeNode treeNode2 = buildTreeNode(root2);
        final boolean expected = true;
        assertMoreSolution(treeNode1, treeNode2, expected);
    }

    private void assertMoreSolution(TreeNode treeNode1, TreeNode treeNode2, boolean expected) {
        Assert.assertEquals(expected, mTestSolution.leafSimilar(treeNode1, treeNode2));
        Assert.assertEquals(expected, mTestSolution.leafSimilar2(treeNode1, treeNode2));
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