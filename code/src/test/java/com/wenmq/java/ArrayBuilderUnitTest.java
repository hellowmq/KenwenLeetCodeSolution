package com.wenmq.java;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayBuilderUnitTest {

    private static final String TAG = "com.wenmq.java.ArrayBuilder";


    @Test
    public void testHeapPollutionCase() {
        List<String> stringListA = new ArrayList<String>();
        List<String> stringListB = new ArrayList<String>();

        ArrayBuilder.addToList(stringListA, "Seven", "Eight", "Nine");
        ArrayBuilder.addToList(stringListB, "Ten", "Eleven", "Twelve");
        List<List<String>> listOfStringLists =
                new ArrayList<List<String>>();
        ArrayBuilder.addToList(listOfStringLists,
                stringListA, stringListB);
        ClassCastException exception = null;
        try {
            ArrayBuilder.faultyMethod(Arrays.asList("Hello!"), Arrays.asList("World!"));
        } catch (ClassCastException e) {
            exception = e;
        }
        Assert.assertNotNull(exception);
    }

}