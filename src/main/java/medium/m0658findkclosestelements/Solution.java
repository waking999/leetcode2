package medium.m0658findkclosestelements;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> rtn = new ArrayList<>();
        int p = getFirstLessXPos(arr, x);
        int l = p - 1;
        int r = p;
        for (int i = 0; i < k; i++) {
            if (l == -1) {
                r++;
            } else if (r == arr.length) {
                l--;
            } else {
                if (x - arr[l] <= arr[r] - x) {
                    l--;
                } else {
                    r++;
                }
            }
        }
        for (int i = l + 1; i < r; i++) {
            rtn.add(arr[i]);
        }


        return rtn;
    }

    private int getFirstLessXPos(int[] arr, int x) {
        int l = 0;
        int r = arr.length - 1;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (arr[m] >= x) {
                r = m;
            } else {
                l = m + 1;
            }
        }


        return l;
    }
}
