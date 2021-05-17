package com.wenmq.cn.leetcode;

/**
 * Q938
 * https://leetcode-cn.com/problems/range-sum-of-bst/
 */
public class Solution938 {
    /**
     * 树中节点数目在范围 [1, 2 * 10^4] 内
     * 1 <= Node.val <= 105
     * 1 <= low <= high <= 105
     * 所有 Node.val 互不相同
     */
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }
        int sum = 0;
        boolean lowerBound = root.val >= low;
        boolean upperBound = root.val <= high;
        if (lowerBound) {
            sum += rangeSumBST(root.left, low, high);
        }
        if (upperBound) {
            sum += rangeSumBST(root.right, low, high);
        }
        if (lowerBound && upperBound) {
            sum += root.val;
        }
        return sum;
    }

    /**
     * 树中节点数目在范围 [1, 2 * 10^4] 内
     * 1 <= Node.val <= 105
     * 1 <= low <= high <= 105
     * 所有 Node.val 互不相同
     */
    public int rangeSumBST2(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }
        int sum = rangeSumBST2(root.left, low, high) + rangeSumBST2(root.right, low, high);
        if (root.val >= low && root.val <= high) {
            sum += root.val;
        }
        return sum;
    }


    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

//        TreeNode() {
//        }

        TreeNode(int val) {
            this.val = val;
        }

//        TreeNode(int val, TreeNode left, TreeNode right) {
//            this.val = val;
//            this.left = left;
//            this.right = right;
//        }
    }

}
