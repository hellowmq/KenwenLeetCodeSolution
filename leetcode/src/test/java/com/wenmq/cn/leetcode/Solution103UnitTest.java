package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static com.wenmq.cn.leetcode.Solution103.TreeNode;

public class Solution103UnitTest {

    public static final String TAG = "com.wenmq.cn.leetcode.Solution103";
    private Solution103 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution103();
    }

    @Test
    public void testZigzagLevelOrder_case1() {
//        prepare
        Integer[] list = {3, 9, 20, null, null, 15, 7};
        TreeNode treeNode = buildTreeNode(list);

        List<List<Integer>> lists = mTestSolution.zigzagLevelOrder(treeNode);
        Assert.assertEquals(3, lists.size());
        Assert.assertArrayEquals(new Integer[]{3}, lists.get(0).toArray());
        Assert.assertArrayEquals(new Integer[]{20, 9}, lists.get(1).toArray());
        Assert.assertArrayEquals(new Integer[]{15, 7}, lists.get(2).toArray());
    }


    @Test
    public void testZigzagLevelOrder2_case1() {
//        prepare
        Integer[] list = {3, 9, 20, null, null, 15, 7};

        TreeNode treeNode = buildTreeNode(list);
        List<List<Integer>> lists = mTestSolution.zigzagLevelOrder2(treeNode);
        Assert.assertEquals(3, lists.size());
        Assert.assertArrayEquals(new Integer[]{3}, lists.get(0).toArray());
        Assert.assertArrayEquals(new Integer[]{20, 9}, lists.get(1).toArray());
        Assert.assertArrayEquals(new Integer[]{15, 7}, lists.get(2).toArray());
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