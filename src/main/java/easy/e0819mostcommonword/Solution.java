package easy.e0819mostcommonword;

import java.util.*;

public class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        String bannedStr = String.join(",", banned);

        paragraph = paragraph.toLowerCase();
        paragraph = paragraph.replaceAll("[,.!?;'@]", " ");

        String[] words = paragraph.split(" ");

        Map<String, Integer> map = new HashMap<>();
        int maxCount = 0;
        String ret="";

        for (String word : words) {
            if (bannedStr.contains(word) || word.trim().length() == 0) {
                continue;
            }

            if (!map.containsKey(word)) {
                int count = 1;
                if (count > maxCount) {
                    maxCount = count;
                    ret=word;
                }
                map.put(word, 1);

            } else {
                int count = map.get(word) + 1;
                if (count > maxCount) {
                    maxCount = count;
                    ret=word;
                }
                map.put(word, count);
            }
        }


        return ret;

    }


}
