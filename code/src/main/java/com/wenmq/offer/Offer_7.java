package com.wenmq.offer;


import com.wenmq.algo.base.TreeNode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Offer-7
 * 重建二叉树
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 */
public class Offer_7 {


    /**
     * 递归法
     * 时间 O(N)
     * 空间 O(N)
     */
    static class Solution1 implements Solution {
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            if (preorder == null || preorder.length == 0) {
                return null;
            }
            Map<Integer, Integer> indexMap = new HashMap<Integer, Integer>();
            int length = preorder.length;
            for (int i = 0; i < length; i++) {
                indexMap.put(inorder[i], i);
            }
            TreeNode root = buildTree(preorder, 0, length - 1, inorder, 0, length - 1, indexMap);
            return root;
        }

        public TreeNode buildTree(int[] preorder, int preorderStart, int preorderEnd, int[] inorder, int inorderStart, int inorderEnd, Map<Integer, Integer> indexMap) {
            if (preorderStart > preorderEnd) {
                return null;
            }
            int rootVal = preorder[preorderStart];
            TreeNode root = new TreeNode(rootVal);
            if (preorderStart == preorderEnd) {
                return root;
            } else {
                int rootIndex = indexMap.get(rootVal);
                int leftNodes = rootIndex - inorderStart, rightNodes = inorderEnd - rootIndex;
                TreeNode leftSubtree = buildTree(preorder, preorderStart + 1, preorderStart + leftNodes, inorder, inorderStart, rootIndex - 1, indexMap);
                TreeNode rightSubtree = buildTree(preorder, preorderEnd - rightNodes + 1, preorderEnd, inorder, rootIndex + 1, inorderEnd, indexMap);
                root.left = leftSubtree;
                root.right = rightSubtree;
                return root;
            }
        }
    }

    /**
     * 迭代法
     * 时间 O(N)
     * 空间 O(N)
     */
    static class Solution2 implements Solution {
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            if (preorder == null || preorder.length == 0) {
                return null;
            }
            TreeNode root = new TreeNode(preorder[0]);
            int length = preorder.length;
            Stack<TreeNode> stack = new Stack<TreeNode>();
            stack.push(root);
            int inorderIndex = 0;
            for (int i = 1; i < length; i++) {
                int preorderVal = preorder[i];
                TreeNode node = stack.peek();
                if (node.val != inorder[inorderIndex]) {
                    node.left = new TreeNode(preorderVal);
                    stack.push(node.left);
                } else {
                    while (!stack.isEmpty() && stack.peek().val == inorder[inorderIndex]) {
                        node = stack.pop();
                        inorderIndex++;
                    }
                    node.right = new TreeNode(preorderVal);
                    stack.push(node.right);
                }
            }
            return root;
        }
    }


    interface Solution {

        public TreeNode buildTree(int[] preorder, int[] inorder);
    }


}
