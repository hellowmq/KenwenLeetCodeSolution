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
                "Trie", "insert", "search", "search", "startsWith", "insert", "search"
        };
        String[] operandObjects = new String[]{
                null, "apple", "apple", "app", "app", "app", "app"
        };

        Boolean[] expected = new Boolean[]{
                null, null, true, false, true, null, true
        };

        assertTrie(commands, operandObjects, expected);
        assertTrie2(commands, operandObjects, expected);


    }

    private void assertTrie(String[] commands, String[] operandObjects, Boolean[] expecteds) {
        Trie trie = null;
        for (int i = 0; i < commands.length; i++) {
            switch (commands[i]) {
                case "Trie":
                    trie = new Trie();
                    Assert.assertNull(expecteds[i]);
                    break;
                case "insert":
                    trie.insert(operandObjects[i]);
                    Assert.assertNull(expecteds[i]);
                    break;
                case "search":
                    Assert.assertEquals(expecteds[i], trie.search(operandObjects[i]));
                    break;
                case "startsWith":
                    Assert.assertEquals(expecteds[i], trie.startsWith(operandObjects[i]));
                    break;
                default:
                    // ignore
            }
        }
    }

    private void assertTrie2(String[] commands, String[] operandObjects, Boolean[] expecteds) {
        Trie2 trie = null;
        for (int i = 0; i < commands.length; i++) {
            switch (commands[i]) {
                case "Trie":
                    trie = new Trie2();
                    Assert.assertNull(expecteds[i]);
                    break;
                case "insert":
                    trie.insert(operandObjects[i]);
                    Assert.assertNull(expecteds[i]);
                    break;
                case "search":
                    Assert.assertEquals(expecteds[i], trie.search(operandObjects[i]));
                    break;
                case "startsWith":
                    Assert.assertEquals(expecteds[i], trie.startsWith(operandObjects[i]));
                    break;
                default:
                    // ignore
            }
        }
    }
}