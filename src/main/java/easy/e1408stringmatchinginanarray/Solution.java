package easy.e1408stringmatchinginanarray;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<String> stringMatching(String[] words) {
        StringBuilder builder = new StringBuilder();
        for (String word : words) {
            builder.append(word).append(",");
        }
        String wholeWords = builder.toString();
        List<String> resultList = new ArrayList<>();
        for (String word : words) {
            int index1 = wholeWords.indexOf(word);
            int index2 = wholeWords.lastIndexOf(word);
            if (index1 >= 0 && index2 >= 0 && index1 != index2) {
                resultList.add(word);
            }
        }
        return resultList;
    }
}
