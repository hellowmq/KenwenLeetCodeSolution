package com.wenmq.cn.leetcode;

import static com.wenmq.cn.leetcode.Solution114.TreeNode;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Solution114UnitTest {

    private Solution114 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution114();
    }

    @Test
    public void test_Flatten_Case1() {
        Integer[] list = new Integer[]{
                1, 2, 5, 3, 4, null, 6
        };
        TreeNode root = buildTreeNode(list);
        mTestSolution.flatten(root);
        List<Integer> actualTravel = new ArrayList<>();
        scan(root, actualTravel);
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(
                1, null, 2, null, 3, null, 4, null, 5, null, 6, null, null
        ));
        Asserts.assertListEqual(expectedList, actualTravel);
    }

    @Test
    public void test_Flatten_Case2() {
        Integer[] list = new Integer[]{
        };
        TreeNode root = buildTreeNode(list);
        mTestSolution.flatten(root);
        List<Integer> actualTravel = new ArrayList<>();
        scan(root, actualTravel);
        List<Integer> expectedList = new ArrayList<>();
        Asserts.assertListEqual(expectedList, actualTravel);
    }

    @Test
    public void test_Flatten_Case3() {
        Integer[] list = new Integer[]{
                0
        };
        TreeNode root = buildTreeNode(list);
        mTestSolution.flatten(root);
        List<Integer> actualTravel = new ArrayList<>();
        scan(root, actualTravel);
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(
                0, null, null
        ));
        Asserts.assertListEqual(expectedList, actualTravel);
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

    public void scan(TreeNode node, List<Integer> array) {
        if (node == null) {
            return;
        }
        array.add(node.val);
        if (node.left != null) {
            scan(node.left, array);
        } else {
            array.add(null);
        }
        if (node.right != null) {
            scan(node.right, array);
        } else {
            array.add(null);
        }
    }
}