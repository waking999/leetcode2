package easy.e0594longestharmonioussubsequence;

import java.util.Arrays;

public class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);

        int maxLen=0;
        int numsLen=nums.length;

        int start=0;
        int end=1;
        while(start<end&&end<numsLen){
            while(start<end&&end<numsLen&&nums[end]-nums[start]<=1){
                end++;
            }
            int len=0;
            if(nums[start]!=nums[end-1]){
                len=end-start;
            }

            if(len>maxLen){
                maxLen=len;
            }
            while(start<numsLen-1&&nums[start+1]==nums[start]){
                start++;
            }
            start++;
            end=start+1;

        }



        return maxLen;
    }
}
