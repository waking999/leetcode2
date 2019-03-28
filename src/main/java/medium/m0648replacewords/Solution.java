package medium.m0648replacewords;



import java.util.Collections;
import java.util.List;

public class Solution {
    public String replaceWords(List<String> dict, String sentence) {


        root = new TrieNode('0');
        Collections.sort(dict);
        for(String word:dict){
            insert(word);
        }


        String[] words = sentence.split(" ");

        StringBuilder sb=new StringBuilder();
        for (String word:words) {
            TrieNode curr=root;
            for(int i=0;i<=word.length();i++){
                if(i==word.length()){
                    sb.append(word);
                    break;
                }
                char c=word.charAt(i);
                if(curr.children[c-'a']==null){
                    sb.append(word);
                    break;
                }else if(curr.children[c-'a'].isWord){
                    sb.append(word, 0, i+1);
                    break;
                }
                    curr=curr.children[c-'a'];

            }
            sb.append(" ");

        }
        sb.setLength(sb.length()-1);
        return sb.toString();


    }

    TrieNode root;

    class TrieNode {
        char c;
        TrieNode[] children;
        boolean isWord;

        TrieNode(char c) {
            this.c = c;
            children = new TrieNode[26];
            isWord = false;
        }

    }

    private void insert(String word) {
        TrieNode curr = root;
        for (char c : word.toCharArray()) {
            if (curr.children[c - 'a'] == null) {
                curr.children[c - 'a'] = new TrieNode(c);
            }
            curr = curr.children[c - 'a'];
        }
        curr.isWord = true;
    }

    private boolean startWith(String prefix) {
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
