package com.wenmq.cn.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Q257
 * https://leetcode-cn.com/problems/binary-tree-paths/
 */
public class Solution257 {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        appendPath(list, sb, root);
        return list;
    }

    static void appendPath(List<String> list, StringBuilder stringBuilder, TreeNode root) {
        stringBuilder.append(root.val);
        if (root.left == null && root.right == null) {
            list.add(stringBuilder.toString());
            return;
        }
        stringBuilder.append("->");
        if (root.left != null) {
            appendPath(list, new StringBuilder(stringBuilder), root.left);
        }
        if (root.right != null) {
            appendPath(list, stringBuilder, root.right);
        }
    }

    public List<String> binaryTreePaths2(TreeNode root) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder(String.valueOf(root.val));
        appendPath2(list, sb, root);
        return list;
    }

    static void appendPath2(List<String> list, StringBuilder stringBuilder, TreeNode root) {
        if (root.left == null && root.right == null) {
            list.add(stringBuilder.toString());
            return;
        }
        stringBuilder.append("->");
        if (root.left != null) {
            appendPath2(list, new StringBuilder(stringBuilder).append(root.left.val), root.left);
        }
        if (root.right != null) {
            appendPath2(list, stringBuilder.append(root.right.val), root.right);
        }
    }

    public List<String> binaryTreePaths3(TreeNode root) {
        List<String> paths = new ArrayList<>();
        constructPaths(root, "", paths);
        return paths;
    }

    public void constructPaths(TreeNode root, String path, List<String> paths) {
        if (root != null) {
            StringBuilder stringBuilder = new StringBuilder(path);
            stringBuilder.append(root.val);
            if (root.left == null && root.right == null) {  // 当前节点是叶子节点
                paths.add(stringBuilder.toString());  // 把路径加入到答案中
            } else {
                stringBuilder.append("->");  // 当前节点不是叶子节点，继续递归遍历
                constructPaths(root.left, stringBuilder.toString(), paths);
                constructPaths(root.right, stringBuilder.toString(), paths);
            }
        }
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

        TreeNode(int val) {
            this.val = val;
        }
    }


}
