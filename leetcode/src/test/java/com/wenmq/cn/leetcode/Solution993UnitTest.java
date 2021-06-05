package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.wenmq.cn.leetcode.Solution993.TreeNode;

public class Solution993UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution993";

    private Solution993 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution993();
    }

    @Test
    public void testIsCousins_Case1() {
        Integer[] root = new Integer[]{
                1, 2, 3, 4
        };
        int x = 4;
        int y = 3;
        TreeNode rootNode = buildTreeNode(root);
        final boolean expected = false;
        assertMoreSolution(x, y, rootNode, expected);
    }


    @Test
    public void testIsCousins_Case2() {
        Integer[] root = new Integer[]{
                1,2,3,null,4,null,5
        };
        int x = 5;
        int y = 4;
        TreeNode rootNode = buildTreeNode(root);
        final boolean expected = true;
        assertMoreSolution(x, y, rootNode, expected);
    }


    @Test
    public void testIsCousins_Case3() {
        Integer[] root = new Integer[]{
                1,2,3,null,4
        };
        int x = 2;
        int y = 3;
        TreeNode rootNode = buildTreeNode(root);
        final boolean expected = false;
        assertMoreSolution(x, y, rootNode, expected);
    }

    @Test
    public void testIsCousins_Case4() {
        Integer[] root = new Integer[]{
                3, 9, 20, null, null, 15, 7
        };
        int x = 7;
        int y = 15;
        TreeNode rootNode = buildTreeNode(root);
        final boolean expected = false;
        assertMoreSolution(x, y, rootNode, expected);
    }

    @Test
    public void testIsCousins_Case5() {
        Integer[] root = new Integer[]{
                3, 9, 20, null, null, 15, 7
        };
        int x = 3;
        int y = 7;
        TreeNode rootNode = buildTreeNode(root);
        final boolean expected = false;
        assertMoreSolution(x, y, rootNode, expected);
    }


    @Test
    public void testIsCousins_CaseNotExist() {
        Integer[] root = new Integer[]{
                3, 9, 20, null, null, 15, 7
        };
        int x = 33;
        int y = 22;
        TreeNode rootNode = buildTreeNode(root);
        final boolean expected = false;
        assertMoreSolution(x, y, rootNode, expected);
    }

    private void assertMoreSolution(int x, int y, TreeNode rootNode, boolean expected) {
        Assert.assertEquals(expected, mTestSolution.isCousins(rootNode, x, y));
        Assert.assertEquals(expected, mTestSolution.isCousins2(rootNode, x, y));
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