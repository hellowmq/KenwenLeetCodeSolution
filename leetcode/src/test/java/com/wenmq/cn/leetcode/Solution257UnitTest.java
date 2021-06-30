package com.wenmq.cn.leetcode;

import static com.wenmq.cn.leetcode.Solution257.TreeNode;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution257UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution257";


    private Solution257 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution257();
    }

    @Test
    public void testBinaryTreePaths_Case1() {
        Integer[] list = new Integer[]{
                1, 2, 3, null, 5
        };
        TreeNode treeNode = buildTreeNode(list);
        List<?> expect = new ArrayList<>(Arrays.asList(
                "1->2->5", "1->3"
        ));

        Asserts.assertListEqual(expect, mTestSolution.binaryTreePaths(treeNode));
        Asserts.assertListEqual(expect, mTestSolution.binaryTreePaths2(treeNode));
        Asserts.assertListEqual(expect, mTestSolution.binaryTreePaths3(treeNode));
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