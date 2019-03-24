package easy.e0703kthlargestelementinastream.s03;


import java.util.PriorityQueue;

public class KthLargest {

    private final int k;
    private PriorityQueue<Integer> q;

    public KthLargest(int k, int[] nums) {
         this.k=k;
         q=new PriorityQueue<>(k);
         for(int n:nums){
             add(n);
         }
    }

    public int add(int val) {
        if(q.size()<k){
            q.offer(val);
        }else if(q.peek()<val){
            q.poll();
            q.offer(val);
        }
        return q.peek();
    }



}
