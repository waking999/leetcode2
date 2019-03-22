package easy.e0599minimumindexsumoftwolists;

import java.util.*;

public class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {

        Map<String, Integer> map = new HashMap<>();

        int list1Len = list1.length;
        for (int i = 0; i < list1Len; i++) {
            map.put(list1[i], i );
        }


        List<String> rtn = new ArrayList<>();

        int maxSum = Integer.MAX_VALUE;
        int list2Len = list2.length;
        for (int i = 0; i < list2Len&&i<=maxSum; i++) {
            if (map.containsKey(list2[i])) {
                int sum = map.get(list2[i]) +i;
                if (sum < maxSum) {
                    maxSum = sum;
                    rtn.clear();
                    rtn.add(list2[i]);
                } else if (sum == maxSum) {
                    rtn.add(list2[i]);
                }

            }
        }


        return rtn.toArray(new String[0]);
    }
}
