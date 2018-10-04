package easy.e0893groupsofspecialequivalentstrings.s01;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int numSpecialEquivGroups(String[] A) {
        Set<StrVal> set = new HashSet<>();
        for (String s : A) {
            StrVal sv = parse(s);
            set.add(sv);
        }
        return set.size();
    }

    private StrVal parse(String s) {
        int odd = 0;
        int even = 0;

        int sLen = s.length();
        for (int i = 0; i < sLen ; i = i + 2) {
            odd += 1 << (s.charAt(i)-'a');
        }
        for (int i = 1; i < sLen; i = i + 2) {
            even += 1 << (s.charAt(i)-'a');
        }


        return new StrVal(odd, even);
    }

    class StrVal  {
        int odd;
        int even;

        StrVal(int odd, int even) {
            this.odd = odd;
            this.even = even;
        }

        @Override
        public int hashCode() {
            int hash = 17;
            hash = hash * 31 + odd;
            hash = hash * 31 + even;

            return hash;
        }

        @Override
        public boolean equals(Object b) {
            if(!(b instanceof StrVal)){
                return false;
            }
            if (this == b) {
                return true;
            }
            return this.odd == ((StrVal) b).odd && this.even == ((StrVal) b).even;
        }
    }

}
