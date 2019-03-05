package easy.e0961nrepeatedelementinsize2narray;

import java.util.*;

public class Solution {
    public int repeatedNTimes(int[] A) {
        Set<Integer> set = new HashSet<>();

        for (int a : A) {
            if (set.contains(a)) {
                return a;
            }
            set.add(a);

        }

        return 0;
    }
}
