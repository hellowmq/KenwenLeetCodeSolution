package com.wenmq.cn.codinginterviews;

import org.junit.Before;
import org.junit.Test;

public class CISolutionUnitTest {

    private static final String TAG = "com.wenmq.cn.codinginterviews.CISolution";
    private CISolution mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new CISolution();
    }

    @Test
    public void testSolution_() {
        mTestSolution.solution();
    }
}