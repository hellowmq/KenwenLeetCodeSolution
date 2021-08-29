package com.wenmq.cn.leetcode;

import static com.wenmq.cn.leetcode.Solution116.Node;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution116UnitTest {

    private Solution116 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution116();
    }

    @Test
    public void test_Connect() {
        Node root = buildTreeNode(new Integer[]{
                1, 2, 3, 4, 5, 6, 7
        });
        mTestSolution.connect(root);
        Integer[] expectedList = new Integer[]{
                1, null, 2, 3, null, 4, 5, 6, 7, null
        };
        assertConnectNode(root, expectedList);
    }

    private void assertConnectNode(Node root, Integer[] expectedList) {
        int index = 0;
        Node cur = root;
        while (cur != null) {
            Node lineCur = cur;
            while (lineCur != null) {
                Assert.assertEquals((int) expectedList[index++], lineCur.val);
                System.out.println(expectedList[index]);
                lineCur = lineCur.next;
            }
            index++;
            cur = cur.left;
        }
    }

    @Test
    public void test_ConnectNull() {
        mTestSolution.connect(null);
    }


    private Node buildTreeNode(Integer[] list) {
        return buildTreeNode(list, 0);
    }

    private Node buildTreeNode(Integer[] list, int head) {
        if (head >= list.length || list[head] == null) {
            return null;
        }
        Node node = new Node(list[head]);
        node.left = buildTreeNode(list, head * 2 + 1);
        node.right = buildTreeNode(list, head * 2 + 2);
        return node;
    }
}