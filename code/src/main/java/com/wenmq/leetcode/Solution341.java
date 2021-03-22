package com.wenmq.leetcode;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Q341
 * https://leetcode-cn.com/problems/flatten-nested-list-iterator/
 */
public class Solution341 {

    public class NestedIterator implements Iterator<Integer> {

        private Iterator<Integer> mIterator;

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

    public interface NestedInteger {

        // @return true if this NestedInteger holds a single integer, rather than a nested list.
        public boolean isInteger();

        // @return the single integer that this NestedInteger holds, if it holds a single integer
        // Return null if this NestedInteger holds a nested list
        public Integer getInteger();

        // @return the nested list that this NestedInteger holds, if it holds a nested list
        // Return null if this NestedInteger holds a single integer
        public List<NestedInteger> getList();
    }

}
