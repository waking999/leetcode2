package easy.e0933numberofrecentcalls;

import java.util.*;

public class Solution {
    public int[] pin(int[] inputs) {
        RecentCounter r = new RecentCounter();
        int inputLen = inputs.length;
        int[] rtn = new int[inputLen];
        for (int i = 0; i < inputLen; i++) {
            rtn[i] = r.ping(inputs[i]);
        }
        return rtn;
    }


    class RecentCounter {
        int[] times = new int[10000];
        int tail = 0;
        int head = 0;

        public RecentCounter() {
        }

        public int ping(int t) {
            times[tail] = t;
            while(times[head] + 3000 < t) {
                head++;
            }
            return tail++ - head + 1;
        }
    }

}
