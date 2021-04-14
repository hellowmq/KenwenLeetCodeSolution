package com.wenmq.cn.leetcode;

/**
 * Q208
 * https://leetcode-cn.com/problemset/all/
 */
public class Solution208 {
    /**
     * Your Trie object will be instantiated and called as such:
     * Trie obj = new Trie();
     * obj.insert(word);
     * boolean param_2 = obj.search(word);
     * boolean param_3 = obj.startsWith(prefix);
     */
    public static class Trie {
        Trie[] child = new Trie[26];
        boolean isEnd = false;

        /**
         * Initialize your data structure here.
         */
        public Trie() {

        }

        /**
         * Inserts a word into the trie.
         */
        public void insert(String word) {
            Trie t = find(word, true);
            t.isEnd = true;
        }

        /**
         * Returns if the word is in the trie.
         */
        public boolean search(String word) {
            Trie t = find(word, false);
            return t != null && t.isEnd;
        }

        /**
         * Returns if there is any word in the trie that starts with the given prefix.
         */
        public boolean startsWith(String prefix) {
            Trie t = find(prefix, false);
            return t != null;
        }

        private Trie find(String word, boolean insertMode) {
            Trie t = this;
            for (int i = 0; i < word.length(); i++) {
                int index = word.charAt(i) - 'a';
                if (t.child[index] == null) {
                    if (insertMode) {
                        t.child[index] = new Trie();
                    } else {
                        return null;
                    }
                }
                t = t.child[index];
            }
            return t;
        }
    }

    /**
     * Your Trie object will be instantiated and called as such:
     * Trie obj = new Trie();
     * obj.insert(word);
     * boolean param_2 = obj.search(word);
     * boolean param_3 = obj.startsWith(prefix);
     */
    public static class Trie2 {

        Node mNode;

        /**
         * Initialize your data structure here.
         */
        public Trie2() {
            mNode = new Node();
        }

        /**
         * Inserts a word into the trie.
         */
        public void insert(String word) {
            Node node = mNode;
            for (int i = 0; i < word.length(); i++) {
                int charIndex = word.charAt(i) - 'a';
                if (node.mNodes[charIndex] == null) {
                    node.mNodes[charIndex] = new Node();
                }
                node = node.mNodes[charIndex];
            }
            node.mNodes[26] = new Node();
        }

        /**
         * Returns if the word is in the trie.
         */
        public boolean search(String word) {
            Node node = mNode;
            for (int i = 0; i < word.length(); i++) {
                int charIndex = word.charAt(i) - 'a';
                if (node.mNodes[charIndex] == null) {
                    return false;
                }
                node = node.mNodes[charIndex];
            }
            return node.mNodes[26] != null;
        }

        /**
         * Returns if there is any word in the trie that starts with the given prefix.
         */
        public boolean startsWith(String prefix) {
            Node node = mNode;
            for (int i = 0; i < prefix.length(); i++) {
                int charIndex = prefix.charAt(i) - 'a';
                if (node.mNodes[charIndex] == null) {
                    return false;
                }
                node = node.mNodes[charIndex];
            }
            return true;
        }

        static class Node {
            Node[] mNodes = new Node[27];
        }

    }


}
