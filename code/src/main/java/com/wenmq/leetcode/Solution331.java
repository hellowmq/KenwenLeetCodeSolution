package com.wenmq.leetcode;

/**
 * Q331
 * https://leetcode-cn.com/problems/verify-preorder-serialization-of-a-binary-tree/
 */
public class Solution331 {
    /**
     * 在不考虑输入格式非法的情况下，
     * 不满足先序遍历的条件为：
     * 1. NULL 节点指向新节点
     * 2. 结束时没有遍历到所有的 NULL 节点
     *
     * @param preOrder 判断为先序遍历的结果
     * @return 是否为先序遍历的结果
     */
    public boolean isValidSerialization(String preOrder) {
        int emptyCount = 0;
        int loginNodeCount = 1;
        for (char ch : preOrder.toCharArray()) {
            if ((emptyCount << 1) > loginNodeCount) {
                return false;
            }
            if (ch == ',') {
                loginNodeCount++;
            } else if (ch == '#') {
                emptyCount++;
            }
        }
        return loginNodeCount + 1 == emptyCount << 1;
    }

}
