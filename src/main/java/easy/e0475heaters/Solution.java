package easy.e0475heaters;

import java.util.Arrays;

public class Solution {
    public int findRadius(int[] houses, int[] heaters) {

        int housesLen = houses.length;
        int heatersLen = heaters.length;

        Arrays.sort(houses);
        Arrays.sort(heaters);

        if (houses[housesLen - 1] < heaters[0]) {
            return heaters[0] - houses[0];
        }

        if (houses[0] > heaters[heatersLen - 1]) {
            return houses[housesLen - 1] - heaters[heatersLen - 1];
        }
        int j = -1;
        int r=0;
        for (int h : houses) {
            while (j < heatersLen - 1 && heaters[j + 1] < h) {
                j++;
            }
            int d = Integer.MAX_VALUE;
            if (j >= 0) {
                d = h - heaters[j];
                if (d == 0) {
                    continue;
                }
            }
            if (j + 1 < heatersLen) {
                d = Math.min(d, heaters[j + 1] - h);
            }
            if (r < d) {
                r = d;
            }
        }


        return r;
    }
}
