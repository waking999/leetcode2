package easy.e0167twosumiiinputarrayissorted;



public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;

        int l=0;
        int r=n-1;
        while(l<r){
            if(nums[l]+nums[r]==target){
                return new int[]{l+1,r+1};
            }else if (nums[l]+nums[r]>target){
                r--;
            }else{
                l++;
            }
        }

        return null;

    }


}
