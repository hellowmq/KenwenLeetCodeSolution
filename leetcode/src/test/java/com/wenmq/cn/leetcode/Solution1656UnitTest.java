package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static com.wenmq.cn.leetcode.Solution1656.OrderedStream;

public class Solution1656UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1656";

    private Solution1656 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1656();
    }

    @Test
    public void testCase() {
        String[] commands = new String[]{
                "OrderedStream", "insert", "insert", "insert", "insert", "insert"
        };
        Object[][] params = {
                {5},
                {3, "ccccc"},
                {1, "aaaaa"},
                {2, "bbbbb"},
                {5, "eeeee"},
                {4, "ddddd"}
        };

        Object[][] expected = {
                null,
                {},
                {"aaaaa"},
                {"bbbbb", "ccccc"},
                {},
                {"ddddd", "eeeee"}
        };
        Object[][] actual = getActual(commands, params);
        Assert.assertArrayEquals(expected, actual);

    }

    private Object[][] getActual(String[] commands, Object[][] params) {
        Object[][] actual = new Object[commands.length][];
        OrderedStream obj = null;
        for (int i = 0; i < commands.length; i++) {
            String command = commands[i];
            switch (command) {
                case "OrderedStream":
                    int n = (int) params[i][0];
                    obj = new OrderedStream(n);
                    break;
                case "insert":
                    int id = (int) params[i][0];
                    String value = (String) params[i][1];
                    List<String> insert = obj.insert(id, value);
                    actual[i] = insert.toArray();
                    break;
                default:
                    //ignore
            }
        }
        return actual;
    }

}