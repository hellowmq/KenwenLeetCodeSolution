package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Solution705UnitTest {

    private static final String TAG = "com.wenmq.leetcode.Solution705";
    private Solution705 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution705();
    }

    @Test
    public void testSolution() {
        assertCase(new Solution705.MyHashSet());
    }

    @Test
    public void testSolution2() {
        assertCase(new Solution705.MyHashSet2());
    }

    private void assertCase(Solution705.Solution solution) {
        String[] aa = getInstructions();
        int[][] a = getOperandNums();

        List<String> stringList = new ArrayList<>();
        stringList.add("null");
        for (int i = 0; i < aa.length; i++) {
            switch (aa[i]) {
                case "contains":
                    boolean contains = solution.contains(a[i][0]);
                    stringList.add(contains ? "true" : "false");
                    break;
                case "add":
                    solution.add(a[i][0]);
                    stringList.add("null");
                    break;
                case "remove":
                    solution.remove(a[i][0]);
                    stringList.add("null");
                    break;
            }

        }
        final String result = getOutputResult();
        String actual = stringList.toString();
        Assert.assertEquals(result, actual);
    }

    private String getOutputResult() {
        return "[null, false, null, null, null, false, null, true, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, true, null, null, true, null, null, null, null, null, null, null, null, true, null, null, null, null, false, null, false, null, null, null, null, null, true, null, null, null, null, true, null, null, null, null, null, null, true, true, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null]";
    }

    private int[][] getOperandNums() {
        return new int[][]{
                {72}, {91}, {48}, {41}, {96}, {87}, {48}, {49}, {84}, {82}, {24}, {7}, {56}, {87},
                {81}, {55}, {19}, {40}, {68}, {23}, {80}, {53}, {76}, {93}, {95}, {95}, {67}, {31},
                {80}, {62}, {73}, {97}, {33}, {28}, {62}, {81}, {57}, {40}, {11}, {89}, {28}, {97},
                {86}, {20}, {5}, {77}, {52}, {57}, {88}, {20}, {48}, {42}, {86}, {49}, {62}, {53},
                {43}, {98}, {32}, {15}, {42}, {50}, {19}, {32}, {67}, {84}, {60}, {8}, {85}, {43},
                {59}, {65}, {40}, {81}, {55}, {56}, {54}, {59}, {78}, {53}, {0}, {24}, {7}, {53},
                {33}, {69}, {86}, {7}, {1}, {16}, {58}, {61}, {34}, {53}, {84}, {21}, {58}, {25},
                {45}, {3}
        };
    }

    private String[] getInstructions() {
        return new String[]{
                "contains", "remove", "add", "add", "contains", "remove", "contains", "contains",
                "add", "add", "add", "add", "remove", "add", "add", "add", "add", "add", "add",
                "add", "add", "add", "add", "contains", "add", "contains", "add", "add", "contains",
                "add", "add", "remove", "add", "add", "add", "add", "add", "contains", "add", "add",
                "add", "remove", "contains", "add", "contains", "add", "add", "add", "add", "add",
                "contains", "remove", "remove", "add", "remove", "contains", "add", "remove", "add",
                "add", "add", "add", "contains", "contains", "add", "remove", "remove", "remove",
                "remove", "add", "add", "contains", "add", "add", "remove", "add", "add", "add",
                "add", "add", "add", "add", "add", "remove", "add", "remove", "remove", "add",
                "remove", "add", "remove", "add", "add", "add", "remove", "remove", "remove", "add",
                "contains", "add"
        };
    }
}