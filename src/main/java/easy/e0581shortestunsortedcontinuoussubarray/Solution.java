package easy.e0581shortestunsortedcontinuoussubarray;

public class Solution {
    public int findUnsortedSubarray(int[] nums){
        int numsLen = nums.length;

        int start=0;
        int end=numsLen-1;
        while(start<end&&nums[start+1]>=nums[start]){
            start++;
        }
        while(end>start&&nums[end-1]<=nums[end]){
            end--;
        }
        if(start>=end){
            return 0;
        }

        int min=nums[start];
        int max=nums[end];
        for(int i=start;i<=end;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }

        while(start>=0&&nums[start]>min){
            start--;
        }
        while(end<numsLen&&nums[end]<max){
            end++;
        }




        return end-start-1;
    }
}
