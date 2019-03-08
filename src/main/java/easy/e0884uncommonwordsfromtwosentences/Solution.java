package easy.e0884uncommonwordsfromtwosentences;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        Map<String, Boolean> map = new HashMap<>();

        for (String str : (A + " " + B).split(" ")) {
            if (!map.containsKey(str)) {
                map.put(str, true);
            } else {
                map.put(str, false);
            }
        }

        List<String> list = new ArrayList<>();
        for (String word : map.keySet()) {
            if (map.get(word)) {
                list.add(word);
            }
        }

        return list.toArray(new String[0]);
    }
}
