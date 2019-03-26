package easy.e0720longestwordindictionary;



public class Solution {
    public String longestWord(String[] words) {
        Trie trie = new Trie();
        for (int i = 0; i < words.length; i++) {
            trie.insert(words[i], i + 1);
        }
        trie.words = words;
        trie.dfs(trie.root);

        return trie.longest;
    }


    private class Node {
        char c;
        Node[] children;
        int end;

        Node(char c) {
            this.c = c;
            this.children = new Node[26];
        }

    }

    private class Trie {
        Node root;
        String[] words;
        String longest;

        Trie() {
            root = new Node('0');
            longest = "";
        }

        private void insert(String word, int index) {
            Node cur = root;
            for (char c : word.toCharArray()) {
                if (cur.children[c - 'a'] == null) {
                    cur.children[c - 'a'] = new Node(c);
                }
                cur = cur.children[c - 'a'];
            }
            cur.end = index;
        }

        private void dfs(Node node) {

            if (node.end > 0 || node == root) {
                if (node != root) {
                    String word = words[node.end - 1];
                    if (word.length() > longest.length() || word.length() == longest.length() && word.compareTo(longest) < 0) {
                        longest = word;
                    }

                }
                for (Node n : node.children) {
                    if(n!=null) {
                        dfs(n);
                    }
                }
            }

        }
    }

}
