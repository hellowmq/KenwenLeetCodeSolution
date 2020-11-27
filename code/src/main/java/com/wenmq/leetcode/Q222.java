package com.wenmq.leetcode;

import com.wenmq.algo.base.TreeNode;

/**
 * Q222
 * https://leetcode-cn.com/problems/count-complete-tree-nodes/
 */
public class Q222 {
    static class Solution {
        /**
         * Definition for a binary tree node.
         * public class TreeNode {
         * int val;
         * TreeNode left;
         * TreeNode right;
         * TreeNode(int x) { val = x; }
         * }
         */
        public int countNodes(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int left = countHeight(root.left);
            int right = countHeight(root.right);
            if (left == right) {
                return countNodes(root.right) + (1 << left);
            } else {
                return countNodes(root.left) + (1 << right);
            }
        }

        private int countHeight(TreeNode root) {
            int level = 0;
            while (root != null) {
                level++;
                root = root.left;
            }
            return level;
        }

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.left.left = new TreeNode(4);
        treeNode.left.right = new TreeNode(5);
        treeNode.right.left = new TreeNode(6);
        System.out.println(solution.countNodes(treeNode));


    }

}
