package com.wenmq.leetcode;

import com.wenmq.algo.base.TreeNode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class Solution103UnitTest {

    String TAG = "com.wenmq.leetcode.Solution103";
    private Solution103 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution103();
    }

    @Test
    public void testZigzagLevelOrder_case1() {
//        prepare
//        Integer[] a = {3, 9, 20, null, null, 15, 7};
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        treeNode.right = new TreeNode(20);
        treeNode.right.left = new TreeNode(15);
        treeNode.right.right = new TreeNode(7);

        List<List<Integer>> lists = mTestSolution.zigzagLevelOrder(treeNode);
        Assert.assertEquals(3, lists.size());
        Assert.assertArrayEquals(new Integer[]{3}, lists.get(0).toArray());
        Assert.assertArrayEquals(new Integer[]{20, 9}, lists.get(1).toArray());
        Assert.assertArrayEquals(new Integer[]{15, 7}, lists.get(2).toArray());
    }


    @Test
    public void testZigzagLevelOrder2_case1() {
//        prepare
//        Integer[] a = {3, 9, 20, null, null, 15, 7};
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        treeNode.right = new TreeNode(20);
        treeNode.right.left = new TreeNode(15);
        treeNode.right.right = new TreeNode(7);

        List<List<Integer>> lists = mTestSolution.zigzagLevelOrder2(treeNode);
        Assert.assertEquals(3, lists.size());
        Assert.assertArrayEquals(new Integer[]{3}, lists.get(0).toArray());
        Assert.assertArrayEquals(new Integer[]{20, 9}, lists.get(1).toArray());
        Assert.assertArrayEquals(new Integer[]{15, 7}, lists.get(2).toArray());
    }
}