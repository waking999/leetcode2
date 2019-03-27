package hard.h0154findminimuminrotatedsortedarrayii;

public class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int h = nums.length - 1;
        //our template of bs cannot handle if head and tail of the arr equal
        //we need to reallocate the index lo to a nonduplicate idx(or move hi)
        //after reallocation, we are garantee we still have the duplicated element within our choice of
        //range of the array
        while (nums[l] == nums[h] && l<nums.length - 1) {
            l++;
        }
        return nums[bs(nums,l,h)];
    }
    public int bs(int[] nums, int l, int h) {

        while (l < h) {
            int m = l+ (h - l) / 2;

            if (nums[m] > nums[m + 1]) return m+ 1;
            else if (nums[m] > nums[h]) l = m+ 1;      /*move to left*/
            else { h = m; }
        }
        return l;
    }
}
