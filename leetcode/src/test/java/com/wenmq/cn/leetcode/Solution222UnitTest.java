package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.wenmq.cn.leetcode.Solution222.TreeNode;

public class Solution222UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution222";

    private Solution222 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution222();
    }

    @Test
    public void testCountNodes_Case1() {
        TreeNode treeNode = buildTreeNode(new Integer[]{1, 2, 3, 4, 5, 6});
        int expected = 6;
        Assert.assertEquals(expected, mTestSolution.countNodes(treeNode));
    }

    @Test
    public void testCountNodes_Case2() {
        TreeNode treeNode = buildTreeNode(new Integer[]{});
        int expected = 0;
        Assert.assertEquals(expected, mTestSolution.countNodes(treeNode));
    }

    @Test
    public void testCountNodes_Case3() {
        TreeNode treeNode = buildTreeNode(new Integer[]{1});
        int expected = 1;
        Assert.assertEquals(expected, mTestSolution.countNodes(treeNode));
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