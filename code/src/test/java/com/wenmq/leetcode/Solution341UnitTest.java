package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution341UnitTest {

    private static final String TAG = "com.wenmq.leetcode.Solution341";
    private Solution341 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution341();
    }

    @Test
    public void testNestedIterator_Case1() {
        NInteger nestedInteger = NInteger.fromList(
                NInteger.fromList(
                        new NInteger(1),
                        new NInteger(1)
                ),
                new NInteger(2),
                NInteger.fromList(
                        new NInteger(1),
                        new NInteger(1)
                )
        );
        Solution341.NestedIterator actualIterator = mTestSolution.new NestedIterator(nestedInteger.getList());

        List<Integer> actualList = new ArrayList<>();
        while (actualIterator.hasNext()) {
            actualList.add(actualIterator.next());
        }
        List<Integer> expected = Arrays.asList(1, 1, 2, 1, 1);
        Assert.assertEquals(expected.toString(), actualList.toString());
    }


    @Test
    public void testNestedIterator_Case2() {
        NInteger nestedInteger = NInteger.fromList(
                new NInteger(1), NInteger.fromList(
                        new NInteger(4),
                        new NInteger(6)
                )
        );
        Solution341.NestedIterator actualIterator = mTestSolution.new NestedIterator(nestedInteger.getList());

        List<Integer> actualList = new ArrayList<>();
        while (actualIterator.hasNext()) {
            actualList.add(actualIterator.next());
        }
        List<Integer> expected = Arrays.asList(1, 4, 6);
        Assert.assertEquals(expected.toString(), actualList.toString());
    }


    private static final class NInteger implements Solution341.NestedInteger {

        Integer mInteger;
        List<Solution341.NestedInteger> mList;

        public NInteger(int num) {
            this.mInteger = num;
        }

        public NInteger(List<Solution341.NestedInteger> list) {
            this.mList = list;
        }

        public static NInteger fromList(NInteger... a) {
            return new NInteger(Arrays.asList(a));
        }

        @Override
        public boolean isInteger() {
            return mInteger != null;
        }

        @Override
        public Integer getInteger() {
            return mInteger;
        }

        @Override
        public List<Solution341.NestedInteger> getList() {
            return mList;
        }


    }
}