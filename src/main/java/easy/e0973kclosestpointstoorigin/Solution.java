package easy.e0973kclosestpointstoorigin;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class Solution {
    public int[][] kClosest(int[][] points, int K) {
        PriorityQueue<DisOrder> minHeap = new PriorityQueue<>();

        int pointsLen=points.length;

        for(int i=0;i<pointsLen;i++){
            int[] point=points[i];
            int distance=point[0]*point[0]+point[1]*point[1];
            minHeap.add(new DisOrder(i,distance));
        }



        int[][] rtn=new int[K][2];
        int count=0;
        while(count<K) {
            DisOrder disOrder=minHeap.poll();
            int index=disOrder.index;
            rtn[count]=points[index];
            count++;
        }


        return rtn;
    }

    private class DisOrder implements Comparable<DisOrder> {
        int index;
        int distance;

        DisOrder(int index, int distance) {
            this.index = index;
            this.distance = distance;
        }

        @Override
        public int compareTo(DisOrder other) {
            return Integer.compare(this.distance, other.distance);
        }
    }
}
