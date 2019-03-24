package easy.e0762primenumberofsetbitsinbinaryrepresentation;

public class Solution {

    private int[] table = new int[]{0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1};

    public int countPrimeSetBits(int L, int R) {

        int ans = 0;
        for (int i = L; i <= R; i++) {
            ans += table[Integer.bitCount(i)];
        }
        return ans;
    }
}
