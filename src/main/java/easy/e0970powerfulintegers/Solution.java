package easy.e0970powerfulintegers;

import java.util.*;

public class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {

        if (bound < 2) {
            return new ArrayList<>();
        }


        List<Integer> xList = new ArrayList<>();
        getList(xList, x, bound);
        List<Integer> yList = new ArrayList<>();
        getList(yList, y, bound);


        List<Integer> rtn = new ArrayList<>();
        rtn.add(2);

        int num = 3;
        while (num <= bound) {
            for (int xPart : xList) {
                if (yList.contains(num - xPart)) {
                    rtn.add(num);
                    break;
                }
            }
            num++;
        }


        return rtn;
    }

    private void getList(List<Integer> list, int a, int bound) {
        list.add(1);
        if (a > 1) {
            int value = 1;
            while (value < bound) {
                value *= a;
                list.add(value);
            }
        }
    }


}
