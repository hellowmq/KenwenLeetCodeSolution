package com.wenmq.cn.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Q993
 * https://leetcode-cn.com/problems/cousins-in-binary-tree/
 */
public class Solution993 {
    /**
     * 方法一：dfs
     */
    public boolean isCousins(TreeNode root, int x, int y) {
        DFS dfs = new DFS();
        dfs.dfs(root.left, 1, x, y, root.val);
        dfs.dfs(root.right, 1, x, y, root.val);
        return (dfs.xpar != dfs.ypar) && (dfs.xdep == dfs.ydep);
    }

    static class DFS {
        int xpar;
        int xdep;
        int ypar;
        int ydep;

        public void dfs(TreeNode node, int dep, int x, int y, int par) {
            if (node == null) {
                return;
            }
            if (node.val == x) {
                xpar = par;
                xdep = dep;
            } else if (node.val == y) {
                ypar = par;
                ydep = dep;
            } else {
                dfs(node.left, dep + 1, x, y, node.val);
                dfs(node.right, dep + 1, x, y, node.val);
            }
        }
    }

    /**
     * 方法二：bfs
     */
    @SuppressWarnings("SuspiciousNameCombination")
    public boolean isCousins2(TreeNode root, int x, int y) {
        //这两个值任意一个都不会出现在根节点
        if (root == null || root.val == x || root.val == y) {
            return false;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        //对应x值的结点
        TreeNode xNode = null;
        //对应y值的结点
        TreeNode yNode = null;
        //对应x值的父亲的结点
        TreeNode xFather = null;
        //对应y值的父亲的结点
        TreeNode yFather = null;
        //开始bfs
        while (!q.isEmpty()) {
            int size = q.size();
            while (size-- > 0) {
                TreeNode temp = q.poll();
                assert temp != null;
                if (temp.left != null) {
                    q.add(temp.left);
                    //找节点
                    if (temp.left.val == x) {
                        xNode = temp.left;
                        xFather = temp;
                    }
                    if (temp.left.val == y) {
                        yNode = temp.left;
                        yFather = temp;
                    }
                }
                if (temp.right != null) {
                    q.add(temp.right);
                    //找节点
                    if (temp.right.val == x) {
                        xNode = temp.right;
                        xFather = temp;
                    }
                    if (temp.right.val == y) {
                        yNode = temp.right;
                        yFather = temp;
                    }
                }
                //两个节点都没找到，什么也不做
                if (xNode != null || yNode != null) {
                    if (xNode != null && yNode != null) {
                        //如果父亲结点不相等，说明是堂兄弟结点
                        return xFather != yFather;
                    } else if (size == 0) {
                        //这层遍历完了，但是有一个节点找到了，另外一个没找到
                        return false;
                    }
                }
                //两个节点都找到了，那么判断它们是不是堂兄弟节点


            }
        }
        return false;
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
