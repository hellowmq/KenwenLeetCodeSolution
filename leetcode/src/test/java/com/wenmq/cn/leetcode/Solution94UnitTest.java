package com.wenmq.cn.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static com.wenmq.cn.leetcode.Solution94.TreeNode;

public class Solution94UnitTest {

    private Solution94 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution94();
    }

    @Test
    public void testInorderTraversal_Case1() {
        Integer[] list = new Integer[]{
                1, null, 2, null, null, 3
        };
        TreeNode root = buildTreeNode(list);
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 3, 2));

        assertMoreSolution(root, expected);
    }

    @Test
    public void testInorderTraversal_Case2() {
        Integer[] list = new Integer[]{

        };
        TreeNode root = buildTreeNode(list);
        List<Integer> expected = new ArrayList<>(Collections.emptyList());

        assertMoreSolution(root, expected);
    }

    @Test
    public void testInorderTraversal_Case3() {
        Integer[] list = new Integer[]{
                1
        };
        TreeNode root = buildTreeNode(list);
        List<Integer> expected = new ArrayList<>(Collections.singletonList(1));

        assertMoreSolution(root, expected);
    }

    @Test
    public void testInorderTraversal_Case4() {
        Integer[] list = new Integer[]{
                1, 2
        };
        TreeNode root = buildTreeNode(list);
        List<Integer> expected = new ArrayList<>(Arrays.asList(2, 1));

        assertMoreSolution(root, expected);
    }

    @Test
    public void testInorderTraversal_Case5() {
        Integer[] list = new Integer[]{
                1, null, 2
        };
        TreeNode root = buildTreeNode(list);
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 2));

        assertMoreSolution(root, expected);
    }

    private void assertMoreSolution(TreeNode root, List<Integer> expected) {
        Asserts.assertListEqual(expected, mTestSolution.inorderTraversal(root));
        Asserts.assertListEqual(expected, mTestSolution.inorderTraversal2(root));
    }


    private TreeNode buildTreeNode(Integer[] list) {
        return buildTreeNode(list, 0);
    }

    private TreeNode buildTreeNode(Integer[] list, int head) {
        if (head >= list.length || list[head] == null) {
            return null;
        }
        TreeNode treeNode = new TreeNode(list[head]);
        treeNode.left = buildTreeNode(list, head * 2 + 1);
        treeNode.right = buildTreeNode(list, head * 2 + 2);
        return treeNode;

    }
}