package com.wenmq.cn.leetcode;

import com.wenmq.cn.leetcode.Solution559.Node;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution559UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution559";


    private Solution559 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution559();
    }

    @Test
    public void testMaxDepth_Case1() {
        Integer[] list = new Integer[]{
                1, null, 3, 2, 4, null, 5, 6
        };
        Node node = buildNodeTree(list);
        int expected = 3;
        assertMoreSolution(node, expected);
    }

    @Test
    public void testMaxDepth_Case2() {
        Integer[] list = new Integer[]{
                1, null, 2, 3, 4, 5, null, null, 6, 7, null, 8, null, 9, 10,
                null, null, 11, null, 12, null, 13, null, null, 14
        };
        Node node = buildNodeTree(list);
        int expected = 5;
        assertMoreSolution(node, expected);
    }

    @Test
    public void testMaxDepth_Case3() {
        int expected = 0;
        assertMoreSolution(null, expected);
    }

    private void assertMoreSolution(Node node, int expected) {
        Assert.assertEquals(expected, mTestSolution.maxDepth(node));
    }

    private static Node buildNodeTree(Integer[] list) {
        if (list == null || list.length == 0) {
            return null;
        }
        Node dump = new Node(-1);
        Queue<Node> queue = new LinkedList<>();
        queue.offer(dump);
        for (Integer integer : list) {
            Node cur = queue.peek();
            assert cur != null;
            if (cur.children == null) {
                cur.children = new ArrayList<>();
            }
            if (integer == null) {
                queue.poll();
                continue;
            }
            Node next = new Node(integer);
            queue.offer(next);
            cur.children.add(next);
        }
        return dump.children.get(0);
    }
}