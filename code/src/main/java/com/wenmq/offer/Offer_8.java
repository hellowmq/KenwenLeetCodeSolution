package com.wenmq.offer;

/**
 * Offer-8
 * 二叉树的下一个节点
 * 给定一个二叉树和其中的一个结点，
 * 请找出中序遍历顺序的下一个结点并且返回。
 * 注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
 */
public class Offer_8 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode parent;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * 分析：中序先左后中在右
     * 1.check有右孩子，则下一节点为其右孩子最左节点
     * 2.check没有右孩子，且为其父节点的左节点，则下一节点为其父节点
     * 3.check既无右孩子，又是其父节点的右节点：
     * 往上遍历直到遇到节点为其父节点的左孩子，则其父节点为check下一节点
     * 若无此节点，则check无下一节点
     */
    public TreeNode solution(TreeNode searchNext) {
        if (searchNext == null) return null;
        TreeNode next = null;
        if (searchNext.right != null) {
            next = searchNext.right;
            while (next.left != null)
                next = next.left;
        } else if (searchNext.parent != null) {
            TreeNode parent = searchNext.parent;
            TreeNode current = searchNext;
            while (parent != null && current == parent.right) {
                current = parent;
                parent = parent.parent;
            }
            next = parent;
        }
        return next;
    }

    /**
     * 测试用例：
     * 1.普通二叉树（完全二叉树；不完全二叉树）
     * 2.特殊二叉树（所有节点都没有右子节点；所有节点没有左子树；只有一个节点；根节点为null）
     * 3.不同位置的下一节点
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] pre = {1, 2, 4, 5, 8, 9, 3, 6, 7};
        int[] in = {4, 2, 8, 5, 9, 1, 6, 3, 7};
        Offer_8 a = new Offer_8();
        TreeNode root = a.reConstructBinaryTree(pre, in);
        System.out.println(a.solution(root.right.right) == null ? "null" : a.solution(root.right.right).val);
        System.out.println(a.solution(root.right) == null ? "null" : a.solution(root.right).val);
        System.out.println(a.solution(root) == null ? "null" : a.solution(root).val);

    }

    //建树
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre.length <= 0 || in.length <= 0) return null;
        return solution(pre, 0, pre.length - 1, in, 0, in.length - 1);
    }

    private TreeNode solution(int[] pre, int pS, int pE, int[] in, int iS, int iE) {
        if (pS > pE || iS > iE) return null;
        TreeNode node = new TreeNode(pre[pS]);
        int leftLength = 0;
        while (leftLength <= iE - iS && pre[pS] != in[iS + leftLength])
            leftLength++;
        node.left = solution(pre, pS + 1, pS + leftLength, in, iS, leftLength + iS - 1);
        if (node.left != null) node.left.parent = node;
        node.right = solution(pre, pS + leftLength + 1, pE, in, iS + leftLength + 1, iE);
        if (node.right != null) node.right.parent = node;
        return node;
    }
}