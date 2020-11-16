package com.wenmq.leetcode;


import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class Q1122Test {
    @Test
    public void emailValidator_CorrectEmailSimple_ReturnsTrue() {
        Q1122.Solution sl = new Q1122.Solution();
        int[] a = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] b = {2, 1, 4, 3, 9, 6};
//        assertThat(sl.relativeSortArray(a, b).equals(int[]{2,2,2,1,4,3,3,9,6,7,19}));
    }
}
