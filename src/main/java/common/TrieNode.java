package common;

public class TrieNode {

    public char c;
    public TrieNode[] children;
    public boolean isWord;
    public int sum;

    public TrieNode(char c) {
        this.c = c;
        children = new TrieNode[26];
        isWord = false;
        this.sum = 0;
    }


}
