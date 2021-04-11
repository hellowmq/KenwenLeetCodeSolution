package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Solution1773UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1773";

    private Solution1773 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1773();
    }

    @Test
    public void testCountMatches_Case1() {
        List<List<String>> items = Arrays.asList(
                getStringList("phone", "blue", "pixel"),
                getStringList("computer", "silver", "lenovo"),
                getStringList("phone", "gold", "iphone")
        );
        String ruleKey = "color";
        String ruleValue = "silver";

        int expected = 1;
        Assert.assertEquals(expected, mTestSolution.countMatches(items, ruleKey, ruleValue));
    }

    @Test
    public void testCountMatches_Case2() {
        List<List<String>> items = Arrays.asList(
                getStringList("phone", "blue", "pixel"),
                getStringList("computer", "silver", "phone"),
                getStringList("phone", "gold", "iphone")
        );
        String ruleKey = "type";
        String ruleValue = "phone";

        int expected = 2;
        Assert.assertEquals(expected, mTestSolution.countMatches(items, ruleKey, ruleValue));
    }

    @Test
    public void testCountMatches_Case3() {
        List<List<String>> items = Arrays.asList(
                getStringList("phone", "blue", "pixel"),
                getStringList("computer", "silver", "phone"),
                getStringList("phone", "gold", "iphone")
        );
        String ruleKey = "name";
        String ruleValue = "phone";

        int expected = 1;
        Assert.assertEquals(expected, mTestSolution.countMatches(items, ruleKey, ruleValue));
    }

    private List<String> getStringList(String... list) {
        return Arrays.asList(list);
    }
}