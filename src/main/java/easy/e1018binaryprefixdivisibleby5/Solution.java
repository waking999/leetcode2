package easy.e1018binaryprefixdivisibleby5;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Boolean> prefixesDivBy5(int[] A) {


        List<Boolean> rtn = new ArrayList<>(A.length);

        int r = 0;

        for (int a:A) {
            r= ((r << 1) + a)%5;
            rtn.add(r  == 0);

        }

        return rtn;

    }
}
