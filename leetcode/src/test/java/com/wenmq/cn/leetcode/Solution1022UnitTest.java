package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.wenmq.cn.leetcode.Solution1022.TreeNode;

public class Solution1022UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1022";

    private Solution1022 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1022();
    }

    @Test
    public void testSumRootToLeaf_Case1() {
        Integer[] root = {
                1, 0, 1, 0, 1, 0, 1
        };
        TreeNode node = buildTreeNode(root);
        int expected = 22;
        Assert.assertEquals(expected, mTestSolution.sumRootToLeaf(node));
    }

    @Test
    public void testSumRootToLeaf_Case2() {
        Integer[] root = {
                0
        };
        TreeNode node = buildTreeNode(root);
        int expected = 0;
        Assert.assertEquals(expected, mTestSolution.sumRootToLeaf(node));
    }

    @Test
    public void testSumRootToLeaf_Case3() {
        Integer[] root = {
                1
        };
        TreeNode node = buildTreeNode(root);
        int expected = 1;
        Assert.assertEquals(expected, mTestSolution.sumRootToLeaf(node));
    }

    @Test
    public void testSumRootToLeaf_Case4() {
        Integer[] root = {
                1, 1
        };
        TreeNode node = buildTreeNode(root);
        int expected = 3;
        Assert.assertEquals(expected, mTestSolution.sumRootToLeaf(node));
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