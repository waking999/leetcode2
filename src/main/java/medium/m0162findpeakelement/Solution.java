package medium.m0162findpeakelement;

public class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return  nums[0]>nums[1]?0:1;
        }

        int l=0;
        int r=nums.length-1;
        int m=0;
        while(l<=r){
            m=l+(r-l)/2;
            if((m==0&&nums[m]>nums[m+1])||(m==nums.length-1&&nums[m]>nums[m-1])){
                return m;
            }
            if(m>0&&nums[m-1]>nums[m]){
                r=m-1;
            }else{
                l=m+1;
            }
        }


        return r;
    }
}
