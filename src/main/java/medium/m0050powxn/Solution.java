package medium.m0050powxn;

public class Solution {
    public double myPow(double x, int n) {
        if (x == 0) {
            return 0;
        }

        if (n == 0) {
            return 1;
        }


        boolean isNegative = false;
        if (n < 0) {
            isNegative = true;
            x = 1 / x;
            n = -(n + 1); // avoid overflow
        }

        double res = 1;
        double tmp = x;

        while (n > 0) {
            if (n % 2 == 1) {
                res *= tmp;
            }

            tmp = tmp * tmp;
            n >>= 1;
        }

        if (isNegative) {
            return res * x;
        } else {
            return res;
        }

    }
}
