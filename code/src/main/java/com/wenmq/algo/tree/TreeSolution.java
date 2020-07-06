package com.wenmq.algo.tree;


import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author ifans.wen
 * @date 2020/7/3
 * @description
 */
public class TreeSolution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return dfs(nums, 0, nums.length - 1);
    }

    private TreeNode dfs(int[] nums, int lo, int hi) {
        if (lo > hi) {
            return null;
        }
        // 以升序数组的中间元素作为根节点 root。
        int mid = lo + (hi - lo) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        // 递归的构建 root 的左子树与右子树。
        root.left = dfs(nums, lo, mid - 1);
        root.right = dfs(nums, mid + 1, hi);
        return root;
    }

    private TreeNode c2dfs(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = left + (right - left) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = c2dfs(nums, left, mid - 1);
        node.right = c2dfs(nums, mid + 1, right);
        return node;
    }



}
