package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.wenmq.cn.leetcode.Solution404.*;
import static org.junit.Assert.*;

public class Solution404UnitTest {

    private Solution404 mTestSolutoin;

    @Before
    public void setUp() throws Exception {
        mTestSolutoin = new Solution404();
    }

    @Test
    public void sumOfLeftLeaves_Case1() {
        Integer[] list = new Integer[]{
                3, 9, 20, null, null, 15, 7
        };
        TreeNode treeNode = buildTreeNode(list);
        int expected = 24;
        Assert.assertEquals(expected, mTestSolutoin.sumOfLeftLeaves(treeNode));
    }
    @Test
    public void sumOfLeftLeaves_Case2() {
        Integer[] list = new Integer[]{
                1
        };
        TreeNode treeNode = buildTreeNode(list);
        int expected = 0;
        Assert.assertEquals(expected, mTestSolutoin.sumOfLeftLeaves(treeNode));
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