package com.wenmq.cn.leetcode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Q872
 * https://leetcode-cn.com/problems/leaf-similar-trees/
 */
public class Solution872 {
    /**
     * 收集到集合里，判断集合的一致性
     */
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = travel(root1, null);
        List<Integer> list2 = travel(root2, null);
        if (list1.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list1.size(); i++) {
            if (!list1.get(i).equals(list2.get(i))) {
                return false;
            }
        }
        return true;
    }


    List<Integer> travel(TreeNode node, List<Integer> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        if (node.left == null && node.right == null) {
            list.add(node.val);
            return list;
        }
        if (node.left != null) {
            travel(node.left, list);
        }
        if (node.right != null) {
            travel(node.right, list);
        }
        return list;
    }


    /**
     * 代码的精进不要依赖于测试用例
     * 使用一个栈，把深度优先遍历分解成叶子节点迭代器的分步骤试探
     * 判断条件依赖于迭代器每一个叶子 val 的结果相等，并且同时结束
     * 此外只需要实现一个叶子节点迭代器。
     * 使用迭代器有很多的好处，无需占用 O(n)的空间，无需收集所有叶子节点的情况。
     * 空间开销为 O(log N) 级别
     * 时间开销和也是 O(N)级别，但是可以发现，在两棵差异巨大的树对比情况下，这个算法效率极高，可以快速退出
     */
    public boolean leafSimilar2(TreeNode root1, TreeNode root2) {
        Iterator<TreeNode> iterator1 = new TreeNodeLeafIterator(root1);
        Iterator<TreeNode> iterator2 = new TreeNodeLeafIterator(root2);
        while (iterator1.hasNext() && iterator2.hasNext()) {
            TreeNode next1 = iterator1.next();
            TreeNode next2 = iterator2.next();
            if (next1.val != next2.val) {
                return false;
            }
        }
        return !iterator1.hasNext() ^ iterator2.hasNext();
    }


    public static class TreeNodeLeafIterator implements Iterator<TreeNode> {

        Deque<TreeNode> queue = new LinkedList<>();
        private TreeNode mNode;

        public TreeNodeLeafIterator(TreeNode root) {
            queue.push(root);
        }

        private void findNext() {
            while (!queue.isEmpty()) {
                mNode = queue.pop();
                if (mNode.right != null) {
                    queue.push(mNode.right);
                }
                if (mNode.left != null) {
                    queue.push(mNode.left);
                }
                if (mNode.left == null && mNode.right == null) {
                    break;
                }
            }
        }

        @Override
        public boolean hasNext() {
            return !queue.isEmpty();
        }

        @Override
        public TreeNode next() {
            findNext();
            return mNode;
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
