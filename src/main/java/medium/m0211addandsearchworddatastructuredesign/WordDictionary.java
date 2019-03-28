package medium.m0211addandsearchworddatastructuredesign;

import common.TrieNode;

public class WordDictionary {
    private TrieNode root;

    /**
     * Initialize your data structure here.
     */
    public WordDictionary() {
        root = new TrieNode('0');
    }

    /**
     * Adds a word into the data structure.
     */
    public void addWord(String word) {
        TrieNode curr = root;
        for (char c : word.toCharArray()) {
            if (curr.children[c - 'a'] == null) {
                curr.children[c - 'a'] = new TrieNode(c);
            }
            curr = curr.children[c - 'a'];
        }
        curr.isWord = true;
    }

    /**
     * Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter.
     */
    public boolean search(String word) {
        TrieNode curr = root;
        char[] chars = word.toCharArray();
        return search(curr, chars, 0 );
    }


    private boolean search(TrieNode t, char[] chars, int l) {
        if (t == null) {
            return false;
        }
        if (l == chars.length) {
            return t.isWord;
        }
        char c = chars[l];
        if (c == '.') {
            for (TrieNode p : t.children) {
                if (search(p, chars, l + 1)) {
                    return true;
                }
            }
        } else {
            return search(t.children[c - 'a'], chars, l + 1);
        }
        return false;
    }


}
