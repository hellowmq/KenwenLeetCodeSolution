package com.wenmq.cn.leetcode;

/**
 * <a href="https://leetcode-cn.com/problems/populating-next-right-pointers-in-each-node/">
 * Q116
 * </a>
 */
public class Solution116 {
    /**
     * 树中节点的数量少于 4096
     * -1000 <= node.val <= 1000
     */
    Node connect(Node root) {
        if (root == null) {
            return null;
        }
        connectTwoNode(root.left, root.right);
        return root;
    }

    /**
     * 辅助函数
     */
    void connectTwoNode(Node node1, Node node2) {
        if (node1 == null || node2 == null) {
            return;
        }
        // 将传入的两个节点连接
        node1.next = node2;

        // 连接相同父节点的两个子节点
        connectTwoNode(node1.left, node1.right);
        connectTwoNode(node2.left, node2.right);
        // 连接跨越父节点的两个子节点
        connectTwoNode(node1.right, node2.left);
    }

    static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node(int val) {
            this.val = val;
        }


    }

}
