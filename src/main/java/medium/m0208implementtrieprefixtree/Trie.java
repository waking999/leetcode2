package medium.m0208implementtrieprefixtree;

import common.TrieNode;

public class Trie {



    TrieNode root;


    /**
     * Initialize your data structure here.
     */
    public Trie() {
        root = new TrieNode('0');

    }

    /**
     * Inserts a word into the trie.
     */
    public void insert(String word) {
        TrieNode curr = root;
        for (char c : word.toCharArray()) {
            if (curr.children[c - 'a'] == null) {
                curr.children[c - 'a'] = new TrieNode(c);

            }
            curr = curr.children[c - 'a'];
        }
        curr.isWord=true;

    }

    /**
     * Returns if the word is in the trie.
     */
    public boolean search(String word) {
        TrieNode curr = root;
        for (char c : word.toCharArray()) {
            if (curr.children[c - 'a'] == null) {
                return false;
            }
            curr = curr.children[c - 'a'];
        }
        return curr.isWord;


    }

    /**
     * Returns if there is any word in the trie that starts with the given prefix.
     */
    public boolean startsWith(String prefix) {
        TrieNode curr = root;
        for (char c : prefix.toCharArray()) {
            if (curr.children[c - 'a'] == null) {
                return false;
            }
            curr = curr.children[c - 'a'];
        }

        return true;
    }
}
