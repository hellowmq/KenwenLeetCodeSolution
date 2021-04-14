package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.wenmq.cn.leetcode.Solution208.Trie;
import static com.wenmq.cn.leetcode.Solution208.Trie2;

public class Solution208UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution208";

    private Solution208 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution208();
    }


    @Test
    public void testTrie() {
        String[] commands = new String[]{
                "Trie", "insert", "search", "search", "startsWith", "insert", "search", "search", "startsWith"
        };
        String[] operandObjects = new String[]{
                null, "apple", "apple", "app", "app", "app", "app", "banana", "banana"
        };

        Boolean[] expected = new Boolean[]{
                null, null, true, false, true, null, true, false, false
        };

        Assert.assertArrayEquals(expected, getTrieActual(commands, operandObjects, expected));
        Assert.assertArrayEquals(expected, getTrieActual2(commands, operandObjects, expected));

    }

    private Boolean[] getTrieActual(String[] commands, String[] operandObjects, Boolean[] expecteds) {
        Boolean[] actual = new Boolean[commands.length];
        Trie trie = null;
        for (int i = 0; i < commands.length; i++) {
            switch (commands[i]) {
                case "Trie":
                    trie = new Trie();
                    break;
                case "insert":
                    trie.insert(operandObjects[i]);
                    Assert.assertNull(expecteds[i]);
                    break;
                case "search":
                    actual[i] = trie.search(operandObjects[i]);
                    break;
                case "startsWith":
                    actual[i] = trie.startsWith(operandObjects[i]);
                    break;
                default:
                    // ignore
            }
        }
        return actual;
    }

    private Boolean[] getTrieActual2(String[] commands, String[] operandObjects, Boolean[] expecteds) {
        Boolean[] actual = new Boolean[commands.length];
        Trie2 trie = null;
        for (int i = 0; i < commands.length; i++) {
            switch (commands[i]) {
                case "Trie":
                    trie = new Trie2();
                    break;
                case "insert":
                    trie.insert(operandObjects[i]);
                    Assert.assertNull(expecteds[i]);
                    break;
                case "search":
                    actual[i] = trie.search(operandObjects[i]);
                    break;
                case "startsWith":
                    actual[i] = trie.startsWith(operandObjects[i]);
                    break;
                default:
                    // ignore
            }
        }
        return actual;
    }

}