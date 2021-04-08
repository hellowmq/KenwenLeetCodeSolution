package com.wenmq.cn.leetcode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Q341
 * https://leetcode-cn.com/problems/flatten-nested-list-iterator/
 */
public class Solution341 {

    public static class NestedIterator implements Iterator<Integer> {
        // 存储列表的当前遍历位置
        private Deque<Iterator<NestedInteger>> mStack;

        public NestedIterator(List<NestedInteger> nestedList) {
            mStack = new LinkedList<>();
            mStack.push(nestedList.iterator());
        }

        @Override
        public Integer next() {
            // 由于保证调用 next 之前会调用 hasNext，直接返回栈顶列表的当前元素
            //noinspection ConstantConditions
            return mStack.peek().next().getInteger();
        }

        @Override
        public boolean hasNext() {
            while (!mStack.isEmpty()) {
                Iterator<NestedInteger> it = mStack.peek();
                if (!it.hasNext()) {
                    // 遍历到当前列表末尾，出栈
                    mStack.pop();
                    continue;
                }
                // 若取出的元素是整数，则通过创建一个额外的列表将其重新放入栈中
                NestedInteger nest = it.next();
                if (nest.isInteger()) {
                    List<NestedInteger> list = new ArrayList<>();
                    list.add(nest);
                    mStack.push(list.iterator());
                    return true;
                }
                mStack.push(nest.getList().iterator());
            }
            return false;
        }
    }

    /**
     * 这个做法实际上不符合迭代器的设计想法
     * https://leetcode-cn.com/problems/flatten-nested-list-iterator/solution/bian-ping-hua-qian-tao-lie-biao-die-dai-ipjzq/848432
     * 在面试官眼中，写了这个解法大打折扣
     */
    public static class NestedIterator2 implements Iterator<Integer> {

        private final Iterator<Integer> mIterator;

        public NestedIterator2(List<NestedInteger> nestedList) {
            LinkedList<Integer> res = new LinkedList<>();
            for (NestedInteger root : nestedList) {
                traverse(root, res);
            }
            this.mIterator = res.iterator();
        }

        @Override
        public Integer next() {
            return mIterator.next();
        }

        @Override
        public boolean hasNext() {
            return mIterator.hasNext();
        }

        void traverse(NestedInteger root, LinkedList<Integer> res) {
            if (root.isInteger()) {
                res.add(root.getInteger());
                return;
            }
            for (NestedInteger child : root.getList()) {
                traverse(child, res);
            }
        }
    }

    public interface NestedInteger {

        // @return true if this NestedInteger holds a single integer, rather than a nested list.
        boolean isInteger();

        // @return the single integer that this NestedInteger holds, if it holds a single integer
        // Return null if this NestedInteger holds a nested list
        Integer getInteger();

        // @return the nested list that this NestedInteger holds, if it holds a nested list
        // Return null if this NestedInteger holds a single integer
        List<NestedInteger> getList();
    }

}
