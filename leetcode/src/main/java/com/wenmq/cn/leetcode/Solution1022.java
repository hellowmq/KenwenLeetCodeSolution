package com.wenmq.cn.leetcode;

/**
 * Q1022
 * https://leetcode-cn.com/problems/sum-of-root-to-leaf-binary-numbers/
 */

class Solution1022 {
    /**
     * 二叉树遍历
     */
    public int sumRootToLeaf(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode node, int sum) {
        if (node == null) {
            return 0;
        }
        sum = (sum << 1) + node.val;
        if (node.left == null && node.right == null) {
            return sum;
        }
        return dfs(node.left, sum) + dfs(node.right, sum);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

//        TreeNode() {
//        }
//
//        TreeNode(int val) {
//            this.val = val;
//        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}