package easy.e1029twocityscheduling;

import java.util.Arrays;

public class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int len=costs.length;
        W[] diff=new W[len];

        for(int i=0;i<len;i++){
            diff[i]=new W(costs[i][0],costs[i][1],costs[i][0]-costs[i][1]);
        }
        Arrays.sort(diff);

        int sum=0;
        for(int i=0;i<len/2;i++){
            sum+=(diff[i].a+diff[len-1-i].b);
        }

        return sum;
    }

    class W implements Comparable<W>{
        int a;
        int b;
        int diff;

        W(int a, int b, int diff){
            this.a=a;
            this.b=b;
            this.diff=diff;
        }

        @Override
        public int compareTo(W o){
            return this.diff-o.diff;
        }
    }
}
