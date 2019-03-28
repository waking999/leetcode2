package medium.m0677mapsumpairs;


import common.TrieNode;

import java.util.HashSet;
import java.util.Set;

public class MapSum {



    private TrieNode root;
    private Set<String> keySet;

    /**
     * Initialize your data structure here.
     */
    public MapSum() {
        root = new TrieNode('0');
        keySet = new HashSet<>();
    }

    public void insert(String key, int val) {
        if (keySet.contains(key)) {
            TrieNode curr = root;
            for (char c : key.toCharArray()) {
                curr.sum = val;
                curr = curr.children[c - 'a'];
            }
            curr.sum = val;
        } else {

            TrieNode curr = root;
            for (char c : key.toCharArray()) {
                if (curr.children[c - 'a'] == null) {
                    curr.children[c - 'a'] = new TrieNode(c);
                }
                curr.sum += val;
                curr = curr.children[c - 'a'];
            }
            curr.sum += val;
            keySet.add(key);
        }
    }

    public int sum(String prefix) {


        TrieNode curr = root;
        for (char c : prefix.toCharArray()) {
            if (curr.children[c - 'a'] == null) {
                return 0;
            }
            curr = curr.children[c - 'a'];
        }
        return curr.sum;
    }
}
