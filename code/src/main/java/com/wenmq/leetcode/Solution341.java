package com.wenmq.leetcode;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Q341
 * https://leetcode-cn.com/problems/flatten-nested-list-iterator/
 */
public class Solution341 {

    public static class NestedIterator implements Iterator<Integer> {

        private final Iterator<Integer> mIterator;

        public NestedIterator(List<NestedInteger> nestedList) {
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


    public static class NestedIterator2 implements Iterator<Integer> {
        private final Iterator<Integer> mIterator;

        public NestedIterator2(List<NestedInteger> nestedList) {
            List<Integer> result = new LinkedList<>();
            for (NestedInteger node : nestedList) {
                traverse(node, result);
            }
            this.mIterator = result.iterator();
        }

        //如果是一个数，则返回该数，如果是一个一个列表，则返回列表里的数
        @Override
        public Integer next() {
            return mIterator.next();
        }

        //如果下一个是数，则返回 true ；如果下一个列表，则返回false；
        @Override
        public boolean hasNext() {
            return mIterator.hasNext();
        }

        public void traverse(NestedInteger root, List<Integer> result) {
            if (root.isInteger()) {
                result.add(root.getInteger());
                return;
            }
            for (NestedInteger child : root.getList()) {
                traverse(child, result);
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
