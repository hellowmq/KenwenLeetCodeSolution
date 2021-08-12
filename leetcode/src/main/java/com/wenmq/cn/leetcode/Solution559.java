package com.wenmq.cn.leetcode;

import java.util.List;

/**
 * Q559
 * https://leetcode-cn.com/problems/maximum-depth-of-n-ary-tree/
 */
public class Solution559 {
    /**
     * 树的深度不会超过 1000 。
     * 树的节点数目位于 [0, 10^4] 之间。
     */
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.children == null) {
            return 1;
        }
        int max = 0;
        for (Node node : root.children) {
            max = Math.max(max, maxDepth(node));
        }
        return max + 1;
    }


    // Definition for a Node.
    static class Node {
        public int val;
        public List<Node> children;

//        public Node() {
//        }

        public Node(int i) {
            val = i;
        }

        public Node(int i, List<Node> nodes) {
            val = i;
            children = nodes;
        }
    }
}
