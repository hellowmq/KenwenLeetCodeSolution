package com.wenmq.cn.leetcode;

/**
 * <a href="https://leetcode-cn.com/problems/flatten-binary-tree-to-linked-list/">
 * Q114
 * </a>
 */
public class Solution114 {
    /**
     * 树中结点数在范围 [0, 2000] 内
     * -100 <= Node.val <= 100
     */
    public void flatten(TreeNode root) {
        while (root != null) {
            //左子树为 null，直接考虑下一个节点
            if (root.left != null) {
                // 找左子树最右边的节点
                TreeNode pre = root.left;
                while (pre.right != null) {
                    pre = pre.right;
                }
                //将原来的右子树接到左子树的最右边节点
                pre.right = root.right;
                // 将左子树插入到右子树的地方
                root.right = root.left;
                root.left = null;
                // 考虑下一个节点
            }
            root = root.right;
        }
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
}
