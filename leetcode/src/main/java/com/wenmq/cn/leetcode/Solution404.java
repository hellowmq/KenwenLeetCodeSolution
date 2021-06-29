package com.wenmq.cn.leetcode;

/**
 * Q404
 * https://leetcode-cn.com/problems/sum-of-left-leaves/
 */
public class Solution404 {
    /**
     * 递归
     */
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left != null && root.left.left == root.left.right) {
            return sumOfLeftLeaves(root.right) + root.left.val;
        }
        return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
