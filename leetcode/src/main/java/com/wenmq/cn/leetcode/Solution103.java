package com.wenmq.cn.leetcode;

import com.wenmq.algo.base.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Q103
 * https://leetcode-cn.com/problems/binary-tree-zigzag-level-order-traversal/
 */
public class Solution103 {
    /**
     * 两种思路
     * 思路一：先 DFS 然后 reverse
     */
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        traversal(root, res, 0);
        for (int i = 1; i < res.size(); i += 2) {
            Collections.reverse(res.get(i));
        }
        return res;
    }

    private void traversal(TreeNode root, List<List<Integer>> res, int level) {
        if (root == null) {
            return;
        }
        if (res.size() == level) {
            res.add(new ArrayList<>());
        }
        res.get(level).add(root.val);
        traversal(root.left, res, level + 1);
        traversal(root.right, res, level + 1);
    }

    /**
     * 思路二：边 DFS 边判断，但是内层 List 选用 LinkedList 避免数组头部插入移动
     */
    public List<List<Integer>> zigzagLevelOrder2(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        traversal2(root, res, 0);
        return res;
    }

    private void traversal2(TreeNode root, List<List<Integer>> res, int level) {
        if (root == null) {
            return;
        }

        if (res.size() == level) {
            res.add(new LinkedList<>());
        }

        LinkedList<Integer> integers = (LinkedList<Integer>) res.get(level);
        if ((level & 1) == 1) {
            integers.add(0, root.val);
        } else {
            integers.add(root.val);
        }

        traversal2(root.left, res, level + 1);
        traversal2(root.right, res, level + 1);
    }

}
