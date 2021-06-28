package com.wenmq.cn.leetcode;

import static com.wenmq.cn.leetcode.Solution155.MinStack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution155UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution155";


    private Solution155 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution155();
    }

    @Test
    public void testMinStack() {
        String[] commands = new String[]{
                "MinStack", "push", "push", "push", "getMin", "pop", "top", "getMin"
        };
        Integer[][] inputs = new Integer[][]{
                {}, {-2}, {0}, {-3}, {}, {}, {}, {}
        };
        Integer[] result = new Integer[]{
                null, null, null, null, -3, null, 0, -2
        };
        MinStack stack = null;
        for (int i = 0; i < commands.length; i++) {
            switch (commands[i]) {
                case "MinStack":
                    stack = new MinStack();
                    break;
                case "push":
                    stack.push(inputs[i][0]);
                    break;
                case "pop":
                    stack.pop();
                    break;
                case "top":
                    int top = stack.top();
                    Assert.assertEquals(result[i], Integer.valueOf(top));
                    break;
                case "getMin":
                    int min = stack.getMin();
                    Assert.assertEquals(result[i], Integer.valueOf(min));
                    break;
                default:
                    // ignore
            }
        }
    }
}