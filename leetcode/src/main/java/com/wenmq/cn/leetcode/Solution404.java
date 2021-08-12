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
        int leftLeaves = sumOfLeftLeaves(root.right);
        if (root.left != null && root.left.left == root.left.right) {
            return leftLeaves + root.left.val;
        } else {
            return leftLeaves + sumOfLeftLeaves(root.left);
        }
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
