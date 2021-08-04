package com.wenmq.cn.leetcode;

import static com.wenmq.cn.leetcode.Solution225.MyStack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution225UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution225";


    private Solution225 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution225();
    }


    @Test
    public void testNameMyStack_Case1() {
        String[] commands = new String[]{
                "MyStack", "push", "push", "top", "pop", "empty"
        };
        Integer[][] input = new Integer[][]{
                {}, {1}, {2}, {}, {}, {}
        };
        Object[] result = new Object[]{null, null, null, 2, 2, false};

        MyStack stack = null;
        for (int i = 0; i < commands.length; i++) {
            switch (commands[i]) {
                case "MyStack":
                    stack = new MyStack();
                    break;
                case "push":
                    stack.push(input[i][0]);
                    break;
                case "pop":
                    stack.pop();
                    break;
                case "top":
                    Assert.assertEquals(result[i], stack.top());
                    break;
                case "empty":
                    Assert.assertEquals(result[i], stack.empty());
                    break;
                default:
                    // ignore
            }

        }


    }
}