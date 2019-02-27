package easy.e0997findthetownjudge;

import java.util.Arrays;

public class Solution {
    public int findJudge(int N, int[][] trust) {
//trusted by how many person
        int[] count=new int[N+1];
        //the total of trusting person label
        int[] sum=new int[N+1];

        Arrays.fill(count,0);
        Arrays.fill(sum,0);
        int expSum=N*(N+1)/2;
        int len=trust.length;

        for(int i=0;i<len;i++){
            int[] relation=trust[i];
            //if a person i is trusted, the count increase by 1
            count[relation[1]]++;
            //the total of person label will increase by the trusting person's label
            sum[relation[1]]+=relation[0];
            //at the same time, since the judge does not trust anyperson, the trusting person should be deducted
            count[relation[0]]--;
            sum[relation[0]]-=relation[1];

        }


        for(int i=1;i<=N;i++){
            //if both count and sum are satisfied, i will be the judge's label
            if(count[i]==N-1&&sum[i]==expSum-i){
                return i;
            }
        }


        return -1;
    }
}
