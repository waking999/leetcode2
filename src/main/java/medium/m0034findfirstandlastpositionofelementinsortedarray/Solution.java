package medium.m0034findfirstandlastpositionofelementinsortedarray;

public class Solution {



    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;

        int[] rtn = new int[2];
        rtn[0] = -1;
        rtn[1] = -1;

        int l = 0;
        int r = n - 1;
        boolean found=false;
        while (l  <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] < target) {
                l = m + 1;
            } else if (nums[m] > target) {
                r = m - 1;
            } else {
                rtn[0]=m;
                rtn[1]=m;
                found=true;
                break;
            }
        }

        if(!found){
            return rtn;
        }
        //look for left first
        r=rtn[0]-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(nums[m]<target){
                l=m+1;
            }else{
                r=m-1;
            }
        }
        rtn[0]=l;


        l=rtn[1];
        r=n-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(nums[m]>target){
                r=m-1;
            }else{
                l=m+1;
            }
        }
        rtn[1]=r;

        return rtn;
    }
}
