package easy.e0703kthlargestelementinastream.s02;

import java.util.Arrays;

public class KthLargest {

    private final static int IMPOSSIBLE_VALUE = -1;
    private static final float expandRate = 0.8F;
    private static final int initialSize = 12000;
    int[] nums;
    int count;

    int k;

    public KthLargest(int k, int[] nums) {
        this.k=k;

        this.nums = new int[initialSize];
        Arrays.fill(this.nums, IMPOSSIBLE_VALUE);
        Arrays.sort(nums);
        if(nums!=null) {
            count = nums.length;
            System.arraycopy(nums, 0, this.nums, 0, count);
        }else{
            count=0;
        }
    }

    public int add(int val) {
        int pos=findFirstLargerNumPos(val);
        moveToRight(pos);
        nums[pos]=val;
        count++;
        return nums[count-k];
    }

    private int findFirstLargerNumPos(int val){
        return binarySearch(val,0,count-1);
    }

    private int binarySearch(int val,int l, int r){
        if(l>r){
            return l;
        }
        int m=l+(r-l)/2;
        if(nums[m]>val){
            return binarySearch(val,l,m-1);
        }else{
            return binarySearch(val,m+1,r);
        }
    }


    private void moveToRight(int from){
        expand();
        if (count + 1 - from >= 0) System.arraycopy(nums, from, nums, from + 1, count + 1 - from);
    }

    private void expand(){
        int size=nums.length;
        if(count>=size*expandRate){
            int[] newNums=new int[size+initialSize];
            Arrays.fill(newNums,IMPOSSIBLE_VALUE);
            System.arraycopy(nums, 0, newNums, 0, count);
            nums=newNums;
        }
    }
}
