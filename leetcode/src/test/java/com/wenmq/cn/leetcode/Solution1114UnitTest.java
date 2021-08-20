package com.wenmq.cn.leetcode;

import com.wenmq.cn.leetcode.Solution1114.Foo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.concurrent.atomic.AtomicInteger;

public class Solution1114UnitTest {

    private Foo mTestSolution;

    private final AtomicInteger mNum = new AtomicInteger();

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Foo();
    }

    @Test
    public void test_Solution() {
        int[] taskOrder = new int[]{
                1, 2, 3
        };
        for (int num : taskOrder) {
            new AssertThread(num).start();
        }
    }

    private class AssertThread extends Thread {
        private final int mTaskNum;
        private final Runnable mAssertRunnable;

        public AssertThread(int taskNum) {
            mTaskNum = taskNum;
            mAssertRunnable = () -> {
                Assert.assertEquals(taskNum, mNum.addAndGet(1));
            };
        }

        @Override
        public void run() {
            try {
                switch (mTaskNum) {
                    case 1:
                        mTestSolution.first(mAssertRunnable);
                        break;
                    case 2:
                        mTestSolution.second(mAssertRunnable);
                        break;
                    case 3:
                        mTestSolution.third(mAssertRunnable);
                        break;
                    default:
                        // ignore

                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}