package easy.e0747largestnumberatleasttwiceofothers;

public class Solution {
    public int dominantIndex(int[] nums) {
        int lPos=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[lPos]){
                lPos=i;
            }
        }

        for(int i=0;i<nums.length;i++){
            if(i!=lPos){
                if(nums[lPos]<2*nums[i]){
                    return -1;
                }
            }
        }

        return lPos;
    }
}
