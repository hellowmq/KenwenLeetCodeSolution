package com.wenmq.cn.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Q173
 * https://leetcode-cn.com/problems/binary-search-tree-iterator/
 */
public class Solution173 {
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
    static class BSTIterator {

        private List<Integer> mList;
        private int index = 0;

        public BSTIterator(TreeNode root) {
            mList = new ArrayList<>();
            print(root);
        }

        public void print(TreeNode root) {
            if (root.left != null) {
                print(root.left);
            }
            mList.add(root.val);
            if (root.right != null) {
                print(root.right);
            }
        }

        public int next() {
            return mList.get(index++);
        }

        public boolean hasNext() {
            return index < mList.size();
        }
    }


    /**
     * Your BSTIterator object will be instantiated and called as such:
     * BSTIterator obj = new BSTIterator(root);
     * int param_1 = obj.next();
     * boolean param_2 = obj.hasNext();
     */
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


}
